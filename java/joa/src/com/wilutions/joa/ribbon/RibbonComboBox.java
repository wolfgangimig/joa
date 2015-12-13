package com.wilutions.joa.ribbon;

import java.util.ArrayList;
import java.util.List;

import com.wilutions.mslib.office.IRibbonControl;

public class RibbonComboBox<T> extends RibbonControl {
	
	public interface ChangeListener<T> {
		void f(IRibbonControl control, T oldValue, T newValue);
	}
	
	private List<T> items = new ArrayList<T>();
	private int selectedIndex;
	
	@RibbonControlAttribute("Ribbon_onChange")
	private ChangeListener<T> onChange;
	
	public RibbonComboBox() {
		super("comboBox");
	}
	
	public String getText() {
		return getItemLabel(selectedIndex);
	}

	public String getItemLabel(int idx) {
		String ret = "";
		if (idx < items.size()) {
			ret = items.get(idx).toString();
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
	
}
