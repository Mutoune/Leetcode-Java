
set DIR="%D:\workspace\Leetcode-workplace\%"
for /r %DIR% %%i in (Solution.java) do (
	set str1=%%~pdi
	set str2=%str1:~32%
	set str3=%str2:~0,-5%
	copy %%i "%str3%.java"
)