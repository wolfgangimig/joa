package com.wilutions.joactrllib;
import com.wilutions.com.__AllClasses;
public class __TypeLib { 
  private static boolean loaded = false;
  public static boolean load() {
    if (loaded) return true;
    __AllClasses.registerClass("{19E66BF2-50B4-4DA6-8B09-B83A560B98AF}","com.wilutions.joactrllib._IJoaBridgeCtrlEvents");
    __AllClasses.registerClass("{246D42EA-0513-447B-B7E6-86FE0400B3EA}","com.wilutions.joactrllib.JoaBridgeCtrl");
    __AllClasses.registerClass("{21510D80-0112-4214-B91A-2D332BC41874}","com.wilutions.joactrllib._IJoaBridgeDialogEvents");
    __AllClasses.registerClass("{092F3085-8620-4218-A38D-7F223DA710D9}","com.wilutions.joactrllib.IJoaBridgeDialog");
    __AllClasses.registerClass("{7B57EC55-0A9C-4AB0-A2CC-AF81C680CFAC}","com.wilutions.joactrllib.JoaUtilAddin");
    __AllClasses.registerClass("{8B43F7ED-C4B5-4DBA-B174-E8D61C449B08}","com.wilutions.joactrllib.IJoaBridgeCtrl");
    __AllClasses.registerClass("{5995DE21-CBAA-4E8B-8EC3-FB779A1D6390}","com.wilutions.joactrllib.JoaBridgeDialog");
    __AllClasses.registerClass("{403444E9-2793-4450-AB21-0C1DB4754F3F}","com.wilutions.joactrllib.IJoaUtilAddin");
    loaded = true;
    return true;
  }
}
