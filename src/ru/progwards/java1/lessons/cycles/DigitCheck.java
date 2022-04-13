package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit){
        boolean flag = false;
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            int check = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i)));
            if(check == digit) flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(0, 0));
    }
}
