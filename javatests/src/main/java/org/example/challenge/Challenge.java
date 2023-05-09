package org.example.challenge;

public class Challenge {
    public static String FizzBuzz(int number){
        String result = "";
        boolean divisible = false;

        if(number % 3 == 0) {
            result = "Fizz";
            divisible = true;
        }
        if(number % 5 == 0){
            result = "Buzz";
            divisible = true;
        }
        if((number % 5 == 0) & (number % 3 == 0)){
            result = "FizzBuzz";
            divisible = true;
        }

        return divisible ? result: ""+number;
    }

}
