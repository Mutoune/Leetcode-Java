@echo off
setlocal EnableDelayedExpansion
git pull origin master
set DIR="%D:\workspace\Leetcode-workplace\%"
for /r %DIR% %%i in (*.java) do (
	set str=%%~pdi
	set str=!str:~32!
	set str=!str:~0,-5!
	copy %%i !str!.java
)
git add .
git commit -m "Auto Update@%date%%time%"
git push origin master
pause