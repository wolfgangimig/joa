/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook.fx;

import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;

import com.wilutions.mslib.outlook.Categories;

public class CategoryComboBox extends ComboBox<CategoryItem> {

	public CategoryComboBox(Categories categories) {
		
		super(CategoryItem.createObservableListOfCategories(categories));

		setCellFactory(new Callback<ListView<CategoryItem>, ListCell<CategoryItem>>() {
			@Override
			public ListCell<CategoryItem> call(ListView<CategoryItem> param) {

				final ListCell<CategoryItem> cell = new ListCell<CategoryItem>() {
					private final Rectangle rectangle;
					
					{
						super.setPrefWidth(100);
						rectangle = new Rectangle(10, 10);
					}

					@Override
					public void updateItem(CategoryItem item, boolean empty) {
						super.updateItem(item, empty);
						if (item != null) {
							rectangle.setFill(item.getColor());
                            setGraphic(rectangle);
							setText(item.toString());
						}
					}
				};
				return cell;
			}
		});
	}
}
