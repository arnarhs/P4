@echo off


echo Have you changed the expression.g4 file?
echo [Yes/No]

set /p answer= 
if %answer% == yes goto runexprandjavac
if %answer% == Yes goto runexprandjavac
if %answer% == no goto runtest
if %answer% == No goto runtest

:runexprandjavac	
	echo Running
	cd antlr
	CALL antlr -visitor expression.g4
	CALL javac *.java
	cd ..

:runtest
	echo Type name of file to text without .txt
	set /p filename=
	start grun antlr.expression prog test/%filename%.txt -gui
	echo Testing: %filename%

echo Completed testing