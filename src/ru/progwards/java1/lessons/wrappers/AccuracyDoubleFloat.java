package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    static final double R = 6371.2;
    static final double PI = 3.14;

    public static Double volumeBallDouble(Double radius){
        return (4 * (PI * Math.pow(radius, 3))) / 3;
    }

    public static Float volumeBallFloat(Float radius){
        return (float)((4 *  (PI * Math.pow(radius, 3))) / 3);
    }
    public static Double calculateAccuracy(Double radius){
        return volumeBallDouble(radius) - volumeBallFloat(radius.floatValue());
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(R));
        System.out.println(volumeBallFloat((float) R));
        System.out.println(calculateAccuracy(R));
    }
}
