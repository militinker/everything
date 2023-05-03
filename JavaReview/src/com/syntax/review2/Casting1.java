package com.syntax.review2;

public class Casting1 {
    public static void main(String[] args) {

        double d=5; //widening
        System.out.println(d);

        int i=(int)5.0; //narrowing
        System.out.println(i);

        byte b=(byte)128;
        System.out.println(b);

        /*
        casting - convert 1 datatype into another
    1. widening/implicit or automatic
    (byte -> short -> int -> long -> float -> double)
    2. narrow/explicit or manual
    (double -> float -> long -> int -> short -> byte)
         */
    }
}
