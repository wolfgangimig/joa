/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.im;

import java.io.IOException;

import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;

/**
 * Generate Java wrapper classes from COM type libraries for IM integration.
 * This joa-im package belongs to the IMClient example and is not required for 
 * developing Add-ins.
 */
public class Generator {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("JoaDll.version=" + JoaDll.getVersion());

		generateJavaClasses("com.wilutions.mslib", 
				
				// UCCollaborationLib (Integration of IM clients)
				// Found in C:\Program Files (x86)\Skype\Phone\Skype.exe\3
				// Microsoft.Office.Uc.dll from LyncSDK is .NET and is not registered
				"{B9AA1F11-F480-4054-A84E-B5D9277E40A8}",
				
				// Microsoft Office Communicator 2007 SDK
				// http://www.microsoft.com/en-us/download/details.aspx?id=10176
				// ... only IDLs no TypeLib
				
				// Messenger API Type Library
				"{E02AD29E-80F5-46c6-B416-9B3EBDDF057E}"
		);
		
	}

	private static void generateJavaClasses(String pack, String... typeLibIds) {
		DispatchImpl.initLogger("d:\\temp\\log\\joagen-im.log", "ERROR", false);
		String outDir = "d:\\git\\joa\\java\\joa-im\\src-gen";
		System.out.println("Generator started for " + pack +  "...");
		JoaDll.nativeGenerateJavaClassesForTypeLibs(outDir, pack, typeLibIds,
				JoaDll.GENERATOR_INCLUDE_REFERENCED_TYPELIBS);
		System.out.println("Generator finished.");
	}
}
