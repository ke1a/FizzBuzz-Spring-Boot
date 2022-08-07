# FizzBuzz-Spring-Boot
In der **FizzBuzzApplication** befindet sich die Main-Methode zum Starten der Anwendung. Hier wurden keine Änderungen vorgenommen.  
Die Model-Klasse **FizzBuzz** beinhaltet ein Array alleZahlen, welcher für die Ausgabe der FizzBuzz Zahlen genutzt wird.

Die Klasse **FizzBuzzController** bearbeitet die http Abfrage. In der GET Abfrage wird eine Zahl als Parameter übergeben. Diese Zahl wird im **FizzBuzzService** in der Funktion getFizzBuzzNumbers() genutzt. Die Methode implementiert die FizzBuzz-Logik. Diese ist in einer Schleife umgesetzt, in der die FizzBuzz-Bedingungen geprüft werden.   

Die Anwendung ist über http://localhost:8080/fizzbuzz?targetNum=15 aufrufbar. Dem Pfad targetNum muss eine ganze Zahl übergeben werden. Bei einer Eingabe einer negativen Zahl wird das Array mit einer Fehlermeldung ausgegeben.
