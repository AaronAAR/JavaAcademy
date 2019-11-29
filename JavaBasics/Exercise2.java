/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. 
"Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"

*/

public class Exercise2 {
    public static void main( String[] args ) {
        String a = args[0];
        String b = args[1];

        System.out.println(a + b + b + a);

    }
}