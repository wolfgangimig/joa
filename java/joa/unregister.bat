REM set JAVA="D:\Program Files (x86)\Java\jdk1.8.0_20\jre\bin\java.exe"
set JAVA="d:\Program Files\Java\jdk1.8.0_25\jre\bin\java.exe"
set CLASSPATH="D:\git\joa\java\joa-ctp4iptor\bin;D:\git\joa\java\joa\bin"
set MAIN=com.wilutions.joa.AddinApplication
set PARAMS=/log d:\temp\log\joa.log /llevel DEBUG /UnregisterServer %1 
%JAVA% -classpath %CLASSPATH% %MAIN% %PARAMS%