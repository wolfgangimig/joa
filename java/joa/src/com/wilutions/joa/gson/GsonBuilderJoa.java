package com.wilutions.joa.gson;

import com.google.gson.GsonBuilder;
import com.wilutions.mslib.office.MsoCTPDockPosition;

public class GsonBuilderJoa {
	
	public static GsonBuilder create() {
		GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(MsoCTPDockPosition.class, new SerializerComEnum());
        return builder;
	}

}
