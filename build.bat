@echo off
setlocal
if exist out rmdir /s /q out
mkdir out\main
mkdir out\test
for /r src\main\java %%f in (*.java) do echo %%f>> out\main-sources.txt
javac -d out\main @out\main-sources.txt
for /r src\test\java %%f in (*.java) do echo %%f>> out\test-sources.txt
javac -cp out\main -d out\test @out\test-sources.txt
java -cp out\main;out\test com.communitysdks.godaddy.TestMain
