package ru.progwards.java1.lessons.classes1;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    @Override
    public String toString(){
        String hours = String.valueOf(this.hours);
        String minutes = String.valueOf(this.minutes);
        String seconds = String.valueOf(this.seconds);
        if(this.hours < 10){
            hours = "0" + hours;
        }
        if(this.minutes < 10){
            minutes = "0" + minutes;
        }
        if(this.seconds < 10){
            seconds = "0" + seconds;
        }
        return hours+":"+minutes+":"+seconds;
    }
    public int toSeconds(){
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }
    public int secondsBetween(Time time){
        return this.toSeconds() - time.toSeconds();
    }

    public static void main(String[] args) {
        Time time = new Time(5,25, 25);
        System.out.println(time);
        System.out.println(time.secondsBetween(new Time(2,2,2)));
    }
}
