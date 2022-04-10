package ru.progwards.java1.lessons.custing;

public class Figures {
    static final double PI = 3.14;

    public static double circle(double d){
        return 4 * PI * Math.pow(d, 2);
    }
    public static double square(double n){
        return n * n;
    }
    public static Double triangle(double k){
        double p = (k*3)/2;
        return Math.sqrt(p * (p - k) * (p-k) * (p*k));
    }
    public static double squareVsTraiange(double p){
        return square(p) / triangle(p);
    }
    public static double squareVsCircle(double p){
        return square(p) / circle(p);
    }
    public static double triangleVsCircle(double p){
        return triangle(p) / circle(p);
    }

    public static void main(String[] args) {
        System.out.println(squareVsTraiange(5.4));
        System.out.println(squareVsCircle(5.4));
        System.out.println(triangleVsCircle(5.4));
    }
}
