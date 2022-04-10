package ru.progwards.java1.lessons.wrappers;

public class StringConverter {
    public static String fromByte(byte number){
        return String.valueOf(number);
    }

    public static String fromShort(short number){
        return String.valueOf(number);
    }
    public static String fromInt(int number){
        return String.valueOf(number);
    }
    public static String fromLong(long number){
        return String.valueOf(number);
    }
    public static String fromFloat(float number){
        return String.valueOf(number);
    }
    public static String fromDouble(double number){
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        System.out.println(fromByte((byte) 3));
        System.out.println(fromShort((short) 3));
        System.out.println(fromInt(3));
        System.out.println(fromLong(3L));
        System.out.println(fromFloat(3.0F));
        System.out.println(fromDouble(3.0));
    }
}
