/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

/**
 * Generate Java wrapper classes from COM type libraries. 
 * This class was used to generated the com.wilutions.jao.ms*, office*, outlook*, stdole* packages.
 */
public class Generator {
	public static void main(String[] args) {
		
		DispatchImpl.initLogger("d:\\temp\\log\\joacpp.log", "ERROR", false);
		
		String[] typeLibIds = new String[] {
				"{00062FFF-0000-0000-C000-000000000046}", //"D:\\Program Files (x86)\\Microsoft Office\\Office15\\MSOUTL.OLB";
				"{0D452EE1-E08F-101A-852E-02608C4D0BB4}", // Forms type library (i.e., fm20.dll)
				//"{0F9377B3-9F5B-4551-8709-8E422D5F7A8A}", // JoaCtrl
		};
		String outDir = "d:\\git\\joa\\java\\joa\\src-gen";
		String pack = "com.wilutions.mslib";
		System.out.println("Generator started...");
		JoaDll.nativeGenerateJavaClassesForTypeLibs(outDir, pack, typeLibIds, JoaDll.GENERATOR_INCLUDE_REFERENCED_TYPELIBS);
		System.out.println("Generator finished."); 
		
	}
}
