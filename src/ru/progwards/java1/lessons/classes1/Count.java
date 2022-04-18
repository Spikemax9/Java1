package ru.progwards.java1.lessons.classes1;

public class Count {
    int count;

    public Count() {
        this.count = 0;
    }
    public Count(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }
    public void inc(){
        this.count++;
    }
    public boolean dec(){
        this.count--;
        return this.count<1;
    }
    public static void main(String[] args){
        Count count = new Count(10);
        while (true){
            if(count.dec()) {
                System.out.println("count равен 0");
                break;
            }
            count.dec();
        }
    }
}
