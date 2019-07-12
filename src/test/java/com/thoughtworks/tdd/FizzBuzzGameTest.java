package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

public class FizzBuzzGameTest {


//    @Test
//    public void should_return_0_when_call_number_given_0() {
//        assert "0".equals(Game.number(0));
//    }

    @Test
    public void should_return_Fizz_when_call_number_given_13() {
        assert "Fizz".equals(Game.number(13));
    }

    @Test
    public void should_return_Fizz_when_call_number_given_3() {
        assert "Fizz".equals(Game.number(3));
    }

    @Test
    public void should_return_Buzz_when_call_number_given_5() {
        assert "Buzz".equals(Game.number(5));
    }

    @Test
    public void should_return_Whizz_when_call_number_given_7() {
        assert "Whizz".equals(Game.number(7));
    }

    @Test
    public void should_return_BuzzWhizz_when_call_number_given_35() {
        assert "BuzzWhizz".equals(Game.number(35));
    }

    @Test
    public void should_return_FizzWhizz_when_call_number_given_21() {
        assert "FizzWhizz".equals(Game.number(21));
    }

    @Test
    public void should_return_FizzBuzz_when_call_number_given_15() {
        assert "FizzBuzz".equals(Game.number(15));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_call_number_given_105() {
        assert "FizzBuzzWhizz".equals(Game.number(105));
    }


}
