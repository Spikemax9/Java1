package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {
    public static int fiboNumber(int n){
        int one = 0, two = 1;

        for (int i = 0; i < n -1; i++) {
            int temp = two;
            two = one + two;
            one = temp;
        }
        return two;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){
        boolean flag = false;
        if (a == b || b == c || c == a){
            double check = 0.0;
            if(a == b){
                check = (double)a / (double)c;
            }
            if(a == c){
                check = (double)a / (double)b;
            }
            if(b == c){
                check = (double)c / (double)a;
            }
            if(check > 1.61703 && check < 1.61903){
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    int a = fiboNumber(i);
                    int b = fiboNumber(j);
                    int c = fiboNumber(k);
                    if(a < 100 && b < 100 && c < 100){
                        if (isGoldenTriangle(a, b, c)){
                            System.out.println(a + " " + b +" " + c);
                        }

                    }

                }
            }

        }

    }
}
