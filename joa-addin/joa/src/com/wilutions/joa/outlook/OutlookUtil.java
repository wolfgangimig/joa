/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook;

import javafx.scene.paint.Color;

import com.wilutions.mslib.outlook.OlCategoryColor;

public class OutlookUtil {
	
	private static Color[] colorTable = new Color[] {
		Color.WHITE,
		Color.rgb(217, 136, 137), // olCategoryColorRed 1
		Color.rgb(241, 157, 90),  // olCategoryColorOrange 2
		Color.rgb(235, 202, 103), // olCategoryColorPeach 3
		Color.rgb(248, 242, 100), // olCategoryColorYellow 4
		Color.rgb(124, 206, 110), // olCategoryColorGreen 5
		Color.rgb(117, 202, 177), // olCategoryColorTeal 6
		Color.rgb(171, 187, 141), // olCategoryColorOlive 7
		Color.rgb(116, 153, 225), // olCategoryColorBlue 8
		Color.rgb(147, 123, 209), // olCategoryColorPurple 9
		Color.rgb(205, 141, 170), // olCategoryColorMaroon 10
		Color.rgb(193, 191, 195), // olCategoryColorSteel 11
		Color.rgb(83, 97, 125), // olCategoryColorDarkSteel 12
		Color.rgb(162, 162, 162), // olCategoryColorDark 13
		Color.rgb(85, 85, 85), // olCategoryColorDarkGray 14
		Color.rgb(0, 0, 0), // olCategoryColorBlack 15
		Color.rgb(160, 11, 21), // olCategoryColorDarkRed 16
		Color.rgb(204, 82, 0), // olCategoryColorDarkOrange 17
		Color.rgb(174, 128, 24), // olCategoryColorDarkPeach 18
		Color.rgb(159, 155, 0), // olCategoryColorDarkYellow 19
		Color.rgb(33, 107, 24), // olCategoryColorDarkGreen 20
		Color.rgb(35, 122, 94), // olCategoryColorDarkTeal 21
		Color.rgb(95, 116, 43), // olCategoryColorDarkTeal 22
		Color.rgb(24, 67, 135), // olCategoryColorDarkBlue 23
		Color.rgb(74, 46, 139), // olCategoryColorDarkPurple 24
		Color.rgb(123, 51, 87), // olCategoryColorDarkMaroon 25
	};
	
	public static Color toJavaColor(OlCategoryColor oColor) {
		Color color = colorTable[0];
		int idx = oColor.value;
		if (idx > 0 && idx < colorTable.length) {
			color = colorTable[idx];
		}
		return color;
	}
}
