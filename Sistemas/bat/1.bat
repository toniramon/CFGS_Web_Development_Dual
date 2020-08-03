@echo off
set/p numero1= Introduce el primer numero
set/p numero2= Introduce el segundo numero
pause

if %numero1% GTR %numero2% goto correcto 
if %numero2% GTR %numero1% goto incorrecto
:correcto
echo %numero1%
pause
exit
:incorrecto
echo %numero2%
pause
exit
