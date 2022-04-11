package ru.progwards.java1.lessons.compare;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }
    public static int minSide(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        return (a == b & b == c);
    }

    public static void main(String[] args) {
        System.out.println(isEquilateralTriangle(2, 2, 3));
        System.out.println(isEquilateralTriangle(2, 3, 2));
        System.out.println(isEquilateralTriangle(3, 2, 2));
        System.out.println(isEquilateralTriangle(2,2,2));
        System.out.println(isEquilateralTriangle(3,3,3));
    }
}
