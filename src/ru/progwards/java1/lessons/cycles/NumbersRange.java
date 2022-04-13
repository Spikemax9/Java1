package ru.progwards.java1.lessons.cycles;

public class NumbersRange {
    public static long sumNumbers(int start, int finish){
        long result = 0;
        for (int i = start; i <= finish; i++) {
            result += i;
        }
        return result;
    }
    public static long sumOdd(int start, int finish){
        long result = 0;
        for (int i = start; i <= finish; i++) {
            if(i % 2 == 0) result += i;
        }
        return result;
    }
    public static long sumEvenIdx(int start, int finish){
        long result = 0;
        for (int i = 1, j = start; j <= finish; i++, j++) {
            if(i % 2 != 0) {
                result += j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenIdx(23, 74));
    }
}
