package com.wilutions.joa.example.folderhp;

public class Globals {

    private static FolderHomePageAddin addin;

    protected static void setThisAddin(FolderHomePageAddin addin) {
         Globals.addin = addin;
    }

    public static FolderHomePageAddin getThisAddin() {
         return addin;
    }
}
