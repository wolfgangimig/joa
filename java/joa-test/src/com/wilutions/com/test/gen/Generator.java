/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com.test.gen;

import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;

public class Generator {
	public static void main(String[] args) {

		DispatchImpl.initLogger("d:\\temp\\log\\joagen.log", "DEBUG", false);

		String[] typeLibIds = new String[] { "{70DC6790-DDED-480A-9A11-A2A1F2B70084}"};
		String outDir = "d:\\git\\joa\\java\\joa-test\\src-gen";
		String pack = "com.wilutions.joa";
		System.out.println("Generator started...");
		JoaDll.nativeGenerateJavaClassesForTypeLibs(outDir, pack, typeLibIds, JoaDll.GENERATOR_EXCLUDE_REFERENCED_TYPELIBS);
		System.out.println("Generator finished.");

	}

}
