package org.example.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChallengeTest {
    @Test
    public void return_fizz_if_divisible_by_three() {
        assertEquals("Fizz", Challenge.FizzBuzz(3));
        assertEquals("Fizz", Challenge.FizzBuzz(6));
        assertEquals("Fizz", Challenge.FizzBuzz(9));
    }
    @Test
    public void return_buzz_if_divisible_by_five() {
        assertEquals("Buzz", Challenge.FizzBuzz(10));
        assertEquals("Buzz", Challenge.FizzBuzz(20));
    }

    @Test
    public void return_fizzbuzz_if_divisible_by_five_and_three() {
        assertEquals("FizzBuzz", Challenge.FizzBuzz(15));
    }

    @Test
    public void return_number_if_not_divisible() {
        assertEquals("43", Challenge.FizzBuzz(43));
    }
}