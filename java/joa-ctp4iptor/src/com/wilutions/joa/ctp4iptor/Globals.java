/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.ctp4iptor;

public class Globals {

	private static CreateNoteAddin addin;
	
	protected static void setThisAddin(CreateNoteAddin addin) {
		Globals.addin = addin;
	}
	
	public static CreateNoteAddin getThisAddin() {
		return addin;
	}
}

