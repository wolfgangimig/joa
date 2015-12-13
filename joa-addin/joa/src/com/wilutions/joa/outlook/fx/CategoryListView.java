/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook.fx;

import com.wilutions.mslib.outlook.Categories;

public class CategoryListView extends CheckBoxListView<CategoryItem> {

	public CategoryListView(Categories categories) {
		super(CategoryItem.createObservableListOfCategories(categories));
	}
	
	
}
