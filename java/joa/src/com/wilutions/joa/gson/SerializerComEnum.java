package com.wilutions.joa.gson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.wilutions.com.ComEnum;

public class SerializerComEnum implements JsonSerializer<ComEnum>, JsonDeserializer<ComEnum> {

	@SuppressWarnings("unchecked")
	@Override
	public JsonElement serialize(ComEnum src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject result = new JsonObject();
		//result.add("class", new JsonPrimitive(src.getClass().getName()));
		Integer value = 0;
		try {
			String typeName = typeOfSrc.getTypeName();
			Class<ComEnum> enumClass = (Class<ComEnum>)Class.forName(typeName);
			Field field = enumClass.getDeclaredField("value");
			value = (Integer)field.get(src);
		}
		catch (Exception ignored) {
		}
		result.add("value", new JsonPrimitive(value));
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ComEnum deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		ComEnum ret = null; 
		JsonObject jsobj = json.getAsJsonObject();
		if (jsobj != null) {
			int value = 0;
			JsonElement jselm = jsobj.get("value");
			if (jselm != null) {
				Number nvalue = jselm.getAsNumber();
				if (nvalue != null) {
					value = nvalue.intValue();
				}
			}
			
			try {
				String typeName = typeOfT.getTypeName();
				Class<ComEnum> enumClass = (Class<ComEnum>)Class.forName(typeName);
				Method method = enumClass.getMethod("valueOf", int.class);
				ret = (ComEnum)method.invoke(null, value);
			}
			catch (Exception ignored) {
			}
		}
		return ret;
	}

}
