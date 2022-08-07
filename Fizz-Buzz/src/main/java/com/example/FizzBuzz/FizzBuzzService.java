package com.example.FizzBuzz;

public class FizzBuzzService {

    // prüft das target gegen die FizzBuzz Logik 
    public static FizzBuzz getFizzBuzzNumbers(Integer target) {
        
        FizzBuzz fb = new FizzBuzz();

            /* prüft ob das target positiv ist
             wenn nicht wird die Schleife nicht ausgeführt
             */
            if (target > 0){
                int i;
                int pos = 0;
                /* alleZahlen-Array wird initialisiert
                die Länge des Arrays wird über das target bestimmt
                */
                String[] alleZahlen = new String[target];

            // Schleife zählt bis zum target hoch
            for (i=1; i<=target; i++){

                // wenn target durch 3 und 5 teilbar, FizzBuzz
                if ((i % 5) == 0 && (i % 3) == 0){
                    alleZahlen[pos]= "FizzBuzz";
                    fb.setAlleZahlen(alleZahlen);
                    pos++;
                }
                // wenn target durch 3 teilbar, Fizz
                else if (i%3 == 0){
                    alleZahlen[pos]= "Fizz";
                    fb.setAlleZahlen(alleZahlen);
                    pos++;
                }
                // wenn target durch 5 teilbar, Buzz
                else if (i%5 == 0){
                    alleZahlen[pos]= "Buzz";
                    fb.setAlleZahlen(alleZahlen);
                    pos++;
                }
                else {
                    alleZahlen[pos]=String.valueOf(i);
                    fb.setAlleZahlen(alleZahlen);
                    pos++;
                }
            } 
        } 
        else {
            /* Ausgabe bei negativem target */
            String[] alleZahlen = new String[1];
            alleZahlen[0]= "Kein FizzBuzz mit negativem Input möglich.";
            fb.setAlleZahlen(alleZahlen);
            }
        return fb;   
    }

}
