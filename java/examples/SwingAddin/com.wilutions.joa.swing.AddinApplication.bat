@echo off
pushd "C:\Users\Wolfgang\git\itol\joa\java\examples\SwingAddin"
set CP=C:\Users\Wolfgang\git\itol\joa\java\examples\SwingAddin\bin
set CP=%CP%;C:\Users\Wolfgang\git\itol\joa\java\joa\bin\main
set CP=%CP%;\joa\bin\default
set CP=%CP%;C:\Users\Wolfgang\.gradle\caches\modules-2\files-2.1\com.google.code.gson\gson\2.8.0\c4ba5371a29ac9b2ad6129b1d39ea38750043eff\gson-2.8.0.jar
set CP=%CP%;C:\Users\Wolfgang\.gradle\caches\modules-2\files-2.1\org.openjfx\javafx-swing\13\a8531f7b83595165b8307a40b2854b72d001ccd5\javafx-swing-13-win.jar
set CP=%CP%;C:\Users\Wolfgang\.gradle\caches\modules-2\files-2.1\org.openjfx\javafx-controls\13\7524fd4ab57de51637adb0e99f0220a1ae0ae4dd\javafx-controls-13-win.jar
set CP=%CP%;C:\Users\Wolfgang\.gradle\caches\modules-2\files-2.1\org.openjfx\javafx-graphics\13\bbcbc616702a086567585183efcb0ab8eb22a66b\javafx-graphics-13-win.jar
set CP=%CP%;C:\Users\Wolfgang\.gradle\caches\modules-2\files-2.1\org.openjfx\javafx-graphics\13\a9407212df2b75d557a509ec14a9e8e282494b4e\javafx-graphics-13.jar
set CP=%CP%;C:\Users\Wolfgang\.gradle\caches\modules-2\files-2.1\org.openjfx\javafx-base\13\6386f02a2b71d8b503c6ca3cd2d2dcb382ce86b4\javafx-base-13-win.jar
set CP=%CP%;C:\Users\Wolfgang\.gradle\caches\modules-2\files-2.1\org.openjfx\javafx-base\13\43c52e1d11b38514e9d2421ad98ca6a35de12b0\javafx-base-13.jar
"C:\Program Files\OpenJDK\jdk-13.0.1\bin\java.exe" -classpath "%CP%" com.wilutions.joa.swing.AddinApplication
