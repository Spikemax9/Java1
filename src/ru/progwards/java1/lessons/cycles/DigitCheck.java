package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit){
        boolean flag = false;
        for (int i = 0; i < number; i++) {
            if(i == digit){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(5, 3));
    }
}
