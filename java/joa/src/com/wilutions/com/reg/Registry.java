/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com.reg;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComEnum;
import com.wilutions.com.ComException;
import com.wilutions.com.DispatchImpl;

/**
 * This class helps to store and load the state of UI controls.
 */
public class Registry {
	
	private final String regKey;
	private static final int OPT_ONLY_ANNOTATED_FIELDS = 1;
	private static final int OPT_ALL_FIELDS = 0;
	
	/**
	 * Initialize the registry destination path. 
	 * @param manufacturerName Manufacturer name
	 * @param appName Application name
	 */
	public Registry(String manufacturerName, String appName) {
		this.regKey = "HKCU\\Software\\" + manufacturerName + "\\" + appName;
	}
	
	/**
	 * Initialize the registry destination path.
	 * The path is computed as HKEY_CURRENT_USER\Software\{program ID of coclass} 
	 * @param coclass COM class annotated with {@link CoClass}
	 */
	public Registry(Class<? extends DispatchImpl> coclass) {
		CoClass co = coclass.getAnnotation(CoClass.class);
		this.regKey = "HKCU\\Software\\" + co.progId();
	}
	
	/**
	 * Store all fields annotated by {@link DeclRegistryValue}.
	 * @param obj Store fields of this object.
	 */
	public void writeFields(Object obj) {
		if (obj == null) throw new IllegalArgumentException("obj must not be null");
		String subKey = regKey + "\\" + obj.getClass().getName();
		writeObject(subKey, obj, OPT_ONLY_ANNOTATED_FIELDS);
	}
	
	/**
	 * Read all fields annotated by {@link DeclRegistryValue}.
	 * @param obj Read annotated fields of this object.
	 */
	public void readFields(Object obj) {
		String subKey = regKey + "\\" + obj.getClass().getName();
		readFields(subKey, obj, OPT_ONLY_ANNOTATED_FIELDS);
	}

	/**
	 * Read an object or primitive value at the given sub-key.
	 * This function reads all fields - not only annotated fields.
	 * @param subKey Sub-key
	 * @return Object or primitive value
	 */
	public Object read(String subKey) {
		return readObject(regKey + "\\" + subKey);
	}
	
	/**
	 * Write object or primitive value at the given sub-key.
	 * This function writes all fields - not only annotated fields.
	 * @param subKey Sub-key
	 * @param obj Object to be written.
	 */
	public void write(String subKey, Object obj) {
		writeObject(regKey + "\\" + subKey, obj, OPT_ALL_FIELDS);
	}
	
	private static void readFields(String key, Object obj, int opts) {
		Class<?> clazz = obj.getClass();
		while (clazz != null && clazz != Object.class) {
			for (Field field : clazz.getDeclaredFields()) {
				String fieldName = field.getName();
				int mods = field.getModifiers();
	
				if (Modifier.isStatic(mods))
					continue;
				if (Modifier.isFinal(mods))
					continue;
				if (Modifier.isTransient(mods))
					continue;
				
				if ((opts & OPT_ONLY_ANNOTATED_FIELDS) != 0) {
					DeclRegistryValue regValueAnno = field.getAnnotation(DeclRegistryValue.class);
					if (regValueAnno == null) continue;
					String s = regValueAnno.value();
					if (s != null && s.length() != 0) {
						fieldName = s;
					}
				}
	
				if (!Modifier.isPublic(mods)) {
					field.setAccessible(true);
				}
	
				try {
					Object fieldValue = getFieldValue(key, fieldName, field.getType());
					if (fieldValue != null) {
						field.set(obj, fieldValue);
					}
				} catch (Throwable ignored) {
				}
			}
			
			clazz = clazz.getSuperclass();
		}
	}

	private static Object readObject(String key) {
		String className = (String) RegUtil.getRegistryValue(key, "", "");
		if (className == null || className.length() == 0)
			return null;

		Object ret = null;

		try {
			Class<?> clazz = Class.forName(className);
			ret = clazz.newInstance();
			readFields(key, ret, OPT_ALL_FIELDS);

		} catch (Throwable ignored) {
		}

		return ret;
	}

	private static Object getFieldValueArray(String key, String fieldName, Class<?> arrayType)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String arrayKey = key + "\\" + fieldName;
		Class<?> elementType = arrayType.getComponentType();
		int length = Integer.valueOf((String) RegUtil.getRegistryValue(arrayKey, "length", "0"));
		Object fieldValue = Array.newInstance(elementType, length);
		for (int i = 0; i < length; i++) {
			Object elementValue = getFieldValue(arrayKey, Integer.toString(i), elementType);
			Array.set(fieldValue, i, elementValue);
		}
		return fieldValue;
	}

	private static void setFieldValueArray(String key, String fieldName, Object arrayValue) throws ComException {
		String arrayKey = key + "\\" + fieldName;
		int length = Array.getLength(arrayValue);
		RegUtil.setRegistryValue(arrayKey, "length", length);
		for (int i = 0; i < length; i++) {
			Object elementValue = Array.get(arrayValue, i);
			if (elementValue == null)
				continue;
			setFieldValue(arrayKey, Integer.toString(i), elementValue);
		}
	}

	private static Object getFieldValueList(String key, String fieldName, Class<?> listType)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String listKey = key + "\\" + fieldName;
		Integer length = (Integer)RegUtil.getRegistryValue(listKey, "length", 0);
		@SuppressWarnings("unchecked")
		List<Object> fieldValue = listType.equals(List.class) ? new ArrayList<Object>() : (List<Object>)listType.newInstance();
		if (length != null && length != 0) {
			String elementTypeName = (String) RegUtil.getRegistryValue(listKey, "elementClass", "");
			Class<?> elementType = Class.forName(elementTypeName);
			for (int i = 0; i < length; i++) {
				Object elementValue = getFieldValue(listKey, Integer.toString(i), elementType);
				fieldValue.add(elementValue);
			}
		}
		return fieldValue;
	}

	@SuppressWarnings("rawtypes")
	private static void setFieldValueList(String key, String fieldName, Object listValue) throws ComException {
		String listKey = key + "\\" + fieldName;
		List list = (List) listValue;
		int length = list.size();
		RegUtil.setRegistryValue(listKey, "length", length);
		int i = 0;
		boolean classWritten = false;
		for (Object elementValue : list) {
			if (!classWritten && elementValue != null) {
				RegUtil.setRegistryValue(listKey, "elementClass", elementValue.getClass().getName());
				classWritten = true;
			}
			setFieldValue(listKey, Integer.toString(i++), elementValue);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Object getFieldValueMap(String key, String fieldName, Class<?> mapType)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String mapKey = key + "\\" + fieldName;
		Integer length = (Integer)RegUtil.getRegistryValue(mapKey, "length", 0);
		Map fieldValue = mapType.equals(Map.class) ? new HashMap<Object,Object>() : (Map) mapType.newInstance();
		if (length != null && length != 0) {
			String keyTypeName = (String) RegUtil.getRegistryValue(mapKey, "keyClass", "");
			String valueTypeName = (String) RegUtil.getRegistryValue(mapKey, "valueClass", "");
			Class<?> keyType = Class.forName(keyTypeName);
			Class<?> valueType = Class.forName(valueTypeName);
			for (int i = 0; i < length; i++) {
				String elementKey = mapKey + "\\" + i;
				Object keyValue = getFieldValue(elementKey, "key", keyType);
				Object valueValue = getFieldValue(elementKey, "value", valueType);
				fieldValue.put(keyValue, valueValue);
			}
		}
		return fieldValue;
	}

	@SuppressWarnings("rawtypes")
	private static void setFieldValueMap(String key, String fieldName, Object mapValue) throws ComException {
		String mapKey = key + "\\" + fieldName;
		Map map = (Map) mapValue;
		int length = map.size();
		RegUtil.setRegistryValue(mapKey, "length", length);
		boolean keyClassWritten = false, valueClassWritten = false;
		int i = 0;
		for (Object e : map.entrySet()) {
			String elementKey = mapKey + "\\" + (i++);
			Map.Entry mapEntry = (Map.Entry) e;
			Object keyValue = mapEntry.getKey();
			Object valueValue = mapEntry.getValue();
			if (!keyClassWritten && keyValue != null) {
				RegUtil.setRegistryValue(mapKey, "keyClass", keyValue.getClass().getName());
			}
			if (!valueClassWritten && valueValue != null) {
				RegUtil.setRegistryValue(mapKey, "valueClass", valueValue.getClass().getName());
			}
			setFieldValue(elementKey, "key", keyValue);
			setFieldValue(elementKey, "value", valueValue);
		}
	}

	private static Object getFieldValue(String key, String fieldName, Class<?> fieldType)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Object ret = null;

		if (fieldType.isArray()) {
			ret = getFieldValueArray(key, fieldName, fieldType);
		} else if (fieldType == String.class) {
			ret = RegUtil.getRegistryValue(key, fieldName, "");
		} else if (fieldType == Integer.class || fieldType == int.class) {
			Object regValue = RegUtil.getRegistryValue(key, fieldName, Integer.valueOf(0));
			ret = (Integer) regValue;
		} else if (fieldType == Long.class || fieldType == long.class) {
			Object regValue = RegUtil.getRegistryValue(key, fieldName, "0");
			ret = Long.valueOf((String) regValue);
		} else if (fieldType == Double.class || fieldType == double.class) {
			Object regValue = RegUtil.getRegistryValue(key, fieldName, "0");
			ret = Double.valueOf((String) regValue);
		} else if (fieldType == Float.class || fieldType == float.class) {
			Object regValue = RegUtil.getRegistryValue(key, fieldName, "0.f");
			ret = Float.valueOf((String) regValue);
		} else if (fieldType == Boolean.class || fieldType == boolean.class) {
			Object regValue = RegUtil.getRegistryValue(key, fieldName, Boolean.FALSE.toString());
			ret = Boolean.valueOf((String) regValue);
		} else if (fieldType.isEnum()) {
			String enumValueStr = (String)RegUtil.getRegistryValue(key, fieldName, "");
			for (Object e : fieldType.getEnumConstants()) {
				if (e.toString().equals(enumValueStr)) {
					ret = e;
					break;
				}
			}
		} else if (ComEnum.class.isAssignableFrom(fieldType)) {
			String enumValueStr = (String)RegUtil.getRegistryValue(key, fieldName, "");
			if (!enumValueStr.isEmpty()) {
				try {
					int enumValue = Integer.parseInt(enumValueStr);
					Method m = fieldType.getDeclaredMethod("valueOf", int.class);
					ret = m.invoke(null, enumValue);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if (List.class.isAssignableFrom(fieldType)) {
			ret = getFieldValueList(key, fieldName, fieldType);
		} else if (Map.class.isAssignableFrom(fieldType)) {
			ret = getFieldValueMap(key, fieldName, fieldType);
		} else {
			ret = readObject(key + "\\" + fieldName);
		}
		return ret;
	}

	private static void setFieldValue(String key, String fieldName, Object value) throws ComException {
		if (value == null) {
			RegUtil.deleteRegistryValue(key, fieldName);
		} else {
			Class<?> fieldType = value.getClass();
			if (fieldType.isArray()) {
				setFieldValueArray(key, fieldName, value);
			} else if (fieldType == String.class) {
				RegUtil.setRegistryValue(key, fieldName, (String) value);
			} else if (fieldType == Integer.class) {
				RegUtil.setRegistryValue(key, fieldName, (Integer) value);
			} else if (fieldType == Long.class) {
				RegUtil.setRegistryValue(key, fieldName, value.toString());
			} else if (fieldType == Double.class) {
				RegUtil.setRegistryValue(key, fieldName, value.toString());
			} else if (fieldType == Float.class) {
				RegUtil.setRegistryValue(key, fieldName, value.toString());
			} else if (fieldType == Boolean.class) {
				RegUtil.setRegistryValue(key, fieldName, value.toString());
			} else if (fieldType.isEnum()) {
				RegUtil.setRegistryValue(key, fieldName, value.toString());
			} else if (ComEnum.class.isAssignableFrom(fieldType)) {
				try {
					Field f = fieldType.getDeclaredField("value");
					String enumValueStr = Integer.toString((int)f.get(value));
					RegUtil.setRegistryValue(key, fieldName, enumValueStr);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (List.class.isAssignableFrom(fieldType)) {
				setFieldValueList(key, fieldName, value);
			} else if (Map.class.isAssignableFrom(fieldType)) {
				setFieldValueMap(key, fieldName, value);
			} else {
				writeObject(key + "\\" + fieldName, value, OPT_ALL_FIELDS);
			}
		}
	}

	private static void writeObject(String key, Object obj, int opts) {
		String className = obj != null ? obj.getClass().getName() : "";
		try {
			RegUtil.purgeRegistryKey(key);
			RegUtil.setRegistryValue(key, "", className);
			if (className == null || className.length() == 0)
				return;

			Class<?> clazz = obj.getClass();
			while (clazz != null && clazz != Object.class) {
				for (Field field : clazz.getDeclaredFields()) {
					String fieldName = field.getName();
					int mods = field.getModifiers();
					
					if (Modifier.isStatic(mods))
						continue;
					if (Modifier.isFinal(mods))
						continue;
					if (Modifier.isTransient(mods))
						continue;
					
					if ((opts & OPT_ONLY_ANNOTATED_FIELDS) != 0) {
						DeclRegistryValue regValueAnno = field.getAnnotation(DeclRegistryValue.class);
						if (regValueAnno == null) continue;
						String s = regValueAnno.value();
						if (s != null && s.length() != 0) {
							fieldName = s;
						}
					}
	
					if (!Modifier.isPublic(mods)) {
						field.setAccessible(true);
					}
	
					try {
						Object fieldValue = field.get(obj);
						setFieldValue(key, fieldName, fieldValue);
					} catch (Throwable e) {
						e.printStackTrace();
					}
				}
				
				clazz = clazz.getSuperclass();
			}	
		} catch (Throwable e) {
		}
	}
}
