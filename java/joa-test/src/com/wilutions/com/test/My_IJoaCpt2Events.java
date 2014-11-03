/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com.test;

import com.wilutions.com.ComException;
import com.wilutions.com.DispatchImpl;
import com.wilutions.joa.joacomtestlib._IJoaCpt2Events;

public class My_IJoaCpt2Events extends DispatchImpl implements _IJoaCpt2Events {

	public volatile String receivedGrrr;

	@Override
	public void onConnpointsInLibFolder(String grrr1) throws ComException {
	}

	@Override
	public void onGrrr(String Grrr) throws ComException {
		receivedGrrr = Grrr;
	}

}
