%%

%unicode 6.1
%public
%class UnicodeDerivedCoreProperties_XID_Continue_6_1

%type int
%standalone

%include ../../resources/common-unicode-all-binary-property-java

%%

\p{XID_Continue} { setCurCharPropertyValue(); }
[^] { }

<<EOF>> { printOutput(); return 1; }
