package com.example.FizzBuzz;

import java.util.Arrays;

public class FizzBuzzService {

    // prüft das target gegen dieFizzBuzz Logik 
    public static String getFizzBuzzNumbers(Integer target) {
            int i;
            int pos = 0;
            int n = target;
            String[] alleZahlen = new String[n];
            // Schleife zählt bis zum target hoch
            for (i=1; i<=target; i++){
                // wenn durch 3 und 5 teilbar, FizzBuzz
                if ((i % 5) == 0 && (i % 3) == 0){
                    alleZahlen[pos]= "FizzBuzz";
                    pos++;
                }
                // wenn durch 3 teilbar, Fizz
                else if (i%3 == 0){
                    alleZahlen[pos]= "Fizz";
                    pos++;
                }
                // wenn durch 5 teilbar, Buzz
                else if (i%5 == 0){
                    alleZahlen[pos]= "Buzz";
                    pos++;
                }
                else {
                    alleZahlen[pos]= String.valueOf(i);
                    //alleZahlen[pos]= Integer.toString(i);
                    pos++;
                }
            }
            //System.out.println(Arrays.toString(alleZahlen));

            return Arrays.toString(alleZahlen);
    }
    
}
