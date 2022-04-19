package ru.progwards.java1.lessons.classes1;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString(){
        return a + " + " + b + "i";
    }

    public ComplexNum add(ComplexNum num){
        num.a += this.a;
        num.b += this.b;
        return num;
    }
    public ComplexNum sub(ComplexNum num){
        num.a -= this.a;
        num.b -= this.b;
        return num;
    }
    public ComplexNum mul(ComplexNum num){
        num.a *= this.a;
        num.b *= this.b;
        return num;
    }
    public ComplexNum div(ComplexNum num){
        num.a /= this.a;
        num.b /= this.b;
        return num;
    }
}
