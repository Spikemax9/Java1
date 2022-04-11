package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = true;
        if(a + b <= c || a + c <= b || c + b <= a){
            result = false;
        }
        return result;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        boolean result = false;
        if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a){
            result = true;
        }
        return result;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result = false;
        if(a == b || b == c || c == a){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isRightTriangle(2,2,3));
        System.out.println(isRightTriangle(3, 3, 6));
        System.out.println(isRightTriangle(3, 2, 5));
        System.out.println(isRightTriangle(2, 3, 6));
        System.out.println(isRightTriangle(3, 3, 9));
    }
}
