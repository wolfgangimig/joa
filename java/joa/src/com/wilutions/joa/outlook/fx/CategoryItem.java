/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook.fx;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;

import com.wilutions.com.ComException;
import com.wilutions.joa.outlook.OutlookUtil;
import com.wilutions.mslib.outlook.Categories;
import com.wilutions.mslib.outlook.OlCategoryColor;
import com.wilutions.mslib.outlook._Category;

public class CategoryItem {

	private final String text;
	private final Color color;
	private final _Category olCategory;

	public CategoryItem(_Category olCategory) {
		this.text = getNameIgnoreException(olCategory);
		this.color = getColorIgnoreException(olCategory);
		this.olCategory = olCategory;
	}

	public _Category getOutlookCategory() {
		return olCategory;
	}
	
	public Color getColor() {
		return color;
	}

	public String toString() {
		return text;
	}

	public static ObservableList<CategoryItem> createObservableListOfCategories(Categories categories) {
		
		ArrayList<CategoryItem> list = new ArrayList<CategoryItem>();
		try {

			int nbOfCats = categories.getCount();

			for (int i = 0; i < nbOfCats; i++) {
				final _Category cat = categories.Item(i + 1);
				list.add(new CategoryItem(cat));
			}
		} catch (ComException ignored) {
		}

		return FXCollections.observableArrayList(list);
	}
	
	private static String getNameIgnoreException(_Category olCategory) {
		try {
			return olCategory.getName();
		} catch (ComException ignored) {
			return "";
		}
	}

	private static Color getColorIgnoreException(_Category olCategory) {
		OlCategoryColor olColor = OlCategoryColor.olCategoryColorBlack;
		try {
			olColor = olCategory.getColor();
		} catch (ComException ignored) {
		}
		return OutlookUtil.toJavaColor(olColor);
	}
}
