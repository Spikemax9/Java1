package ru.progwards.java1.lessons.basics;

public class Astronomy {
    static final double PI = 3.14;

    public static double sphereSquare(double r){
        return 4 * PI * Math.pow(r, 2);
    }
    public static double earthSquare(){
        return sphereSquare(6371.2);
    }
    public static double mercurySquare(){
        return sphereSquare(2439.7);
    }
    public static double jupiterSquare(){
        return sphereSquare(71492);
    }
    public static double earthVsMercury(){
        return earthSquare() - mercurySquare();
    }
    public static double earthVsJupiter(){
        return earthSquare() - jupiterSquare();
    }


}
