package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {
    public static Integer[] threeDigits(Integer number){
        Integer[] numbers = new Integer[3];
        numbers[0] = number / 100;
        numbers[2] = number % 10;
        numbers[1] = ((number - numbers[0] * 100) - numbers[2]) / 10;
        return numbers;
    }
    public static Integer sumDigits(Integer number){
        Integer[] num = threeDigits(number);
        return Integer.sum(Integer.sum(num[0], num[1]), num[2]);
    }
    public static Integer mulDigits(Integer number){
        Integer[] num = threeDigits(number);
        return num[0] * num[1] * num[2];
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(mulDigits(423));
    }

}
