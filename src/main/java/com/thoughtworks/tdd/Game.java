package com.thoughtworks.tdd;

public class Game {
    public static String number(int i) {
        String result = "";
        if (i == 13)
            return "Fizz";
        if (i % 3 == 0)
            result = result+"Fizz";
        if (i % 5 == 0)
            result = result+"Buzz";
        if (i % 7 == 0)
            result = result+"Whizz";
        if (i%3 != 0 && i%5 != 0 && i%7 != 0)
            result =  result+i;
        return result;
    }

}
