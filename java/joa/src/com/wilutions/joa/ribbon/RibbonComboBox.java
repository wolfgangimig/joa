package com.wilutions.joa.ribbon;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.wilutions.com.Dispatch;
import com.wilutions.joa.IconManager;
import com.wilutions.mslib.office.IRibbonControl;

public class RibbonComboBox<T> extends RibbonControl {

	public interface ChangeListener<T> {
		void f(IRibbonControl control, T oldValue, T newValue);
	}

	public interface ExtractItemData<T> {
		String getItemID(T item);

		String getItemLabel(T item);

		Dispatch getItemImage(IconManager iconManager, T item);
	}

	private List<T> items = new ArrayList<T>();
	private int selectedIndex;
	private ExtractItemData<T> extractItemData;

	@RibbonControlAttribute("Ribbon_onChange")
	private ChangeListener<T> onChange;

	public RibbonComboBox() {
		this(null);
	}

	public RibbonComboBox(ExtractItemData<T> extractItemData) {
		super("comboBox");

		if (extractItemData == null) {
			extractItemData = new ExtractItemDefault<T>();
		}

		this.extractItemData = extractItemData;
	}

	public String getText() {
		return getItemLabel(selectedIndex);
	}

	public String getItemLabel(int idx) {
		String ret = "";
		if (idx < items.size()) {
			T item = items.get(idx);
			ret = extractItemData.getItemLabel(item);
		}
		return ret;
	}

	public String getItemID(int idx) {
		String ret = "";
		if (idx < items.size()) {
			T item = items.get(idx);
			ret = extractItemData.getItemID(item);
		}
		return ret;
	}

	public Dispatch getItemImage(IconManager iconManager, int idx) {
		Dispatch ret = null;
		if (idx < items.size()) {
			T item = items.get(idx);
			ret = extractItemData.getItemImage(iconManager, item);
		}
		return ret;
	}

	public void setOnChange(ChangeListener<T> onChange) {
		this.onChange = onChange;
	}

	public ChangeListener<T> getOnChange() {
		return onChange;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public int getSelectedIndex() {
		return selectedIndex;
	}

	public void setSelectedIndex(int selectedIndex) {
		this.selectedIndex = selectedIndex;
	}

	public int findItemIndex(String text) {
		int ret = 0;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).toString().equals(text)) {
				ret = i;
				break;
			}
		}
		return ret;
	}

	private static class ExtractItemDefault<T> implements ExtractItemData<T> {

		public String getItemLabel(T item) {
			String ret = null;
			Class<?> clazz = item.getClass();
			try {
				Field field = clazz.getDeclaredField("label");
				field.setAccessible(true);
				Object value = field.get(item);
				if (value != null) {
					ret = value.toString();
				}
			}
			catch (Exception e) {
			}
			return ret;
		}

		public Dispatch getItemImage(IconManager iconManager, T item) {
			Dispatch ret = null;
			Class<?> clazz = item.getClass();
			try {
				Field field = clazz.getDeclaredField("image");
				field.setAccessible(true);
				Object value = field.get(item);
				if (value != null) {
					ret = iconManager.get(value.toString());
				}
			}
			catch (Exception e) {
			}
			return ret;
		}

		@Override
		public String getItemID(T item) {
			String ret = null;
			Class<?> clazz = item.getClass();
			try {
				Field field = clazz.getDeclaredField("id");
				field.setAccessible(true);
				Object value = field.get(item);
				if (value != null) {
					ret = value.toString();
				}
			}
			catch (Exception e) {
			}
			return ret;
		}

	}
}
