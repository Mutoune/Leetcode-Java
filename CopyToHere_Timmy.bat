@echo off
setlocal EnableDelayedExpansion
set DIR="%D:\workspace\Leetcode-workplace\%"
for /r %DIR% %%i in (*.java) do (
	set str=%%~pdi
	set str=!str:~32!
	set str=!str:~0,-5!
	copy %%i .\Solutions\!str!.java
)
git add .
git commit -m "Auto Update@%date% %time%"
pause