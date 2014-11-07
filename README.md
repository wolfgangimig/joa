JOA - Java Library for Microsoft Outlook Add-ins
===

This library enables you to create Add-ins for Microsoft Outlook with Java. It is based on the official APIs for writing COM Add-ins for Microsoft Outlook and offers the following opportunities:
- Customize the Ribbon toolbar of explorer and inspector windows
- Add custom task panes to explorer and inspector windows
- Add form regions to inspector windows
- Access the Outlook object model

Please have a look at [Screenshot](https://github.com/wolfgangimig/joa/blob/master/Screenshot1.png) to get a picture of JOA. This screenshot was taken from the joa-ctp4iptor example project. 


In order to develop Add-ins, the following additional software is required:
- Microsoft Outlook 2010 or 2013 - NOT Outlook Express
- Windows 7 or newer
- JDK 8
- Java IDE, e.g. Eclipse Juno or newer


The JOA library is split into a public and a private part. The public part is licensed under the MIT license 
and provides Java sources, Eclipse project configurations, ANT scripts and two native DLLs. 

The private part consists of C++ sources for the COM bridge and the Java source code of a frame window class that allows to place a JavaFX scene inside a native window. The private sources are not available for download. 

The MIT license allows you to use JOA in any project, inclusive commercial products. I am looking forward to your comments and bug reports on the "Issues" section. Depending on your feedback, this work might become a real product with commercial support. 

More information can be found in the wiki. You may want to start reading with the  [Tutorial](https://github.com/wolfgangimig/joa/wiki/Tutorial).

Kind regards

Wolfgang Imig
