package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int one = ((number % 100) % 10) * 100;
        int two = ((number % 100) / 10) * 10;
        int three = number / 100;
        int result = one + two + three;
        return result;

    }


}
