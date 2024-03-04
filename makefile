fichJar = pi.jar

limpiar: 
	rm -f *.jar
	rm -rf bin
	rm -rf html

compilar: limpiar 
	mkdir bin 
	find . -name *.java | xargs javac -cp bin -d bin 

jar: compilar 
	jar cvfm $(fichJar) manifest -C bin . m
javadoc:compilar
	find src -type f -name "*.java" | xargs javadoc -d html -encoding utf-8 -doencoding utg-8
