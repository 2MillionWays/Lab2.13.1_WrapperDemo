package com.brainacad.oop.testwrapper;


public class Main {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");

        System.out.println(x1 == x2);
        System.out.println(x1 == x3);
        System.out.println(x1 == x4);
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println("---\\_(O_o)_/---");

        Integer x5 = 322;
        Integer x6 = new Integer(322);
        Integer x7 = Integer.valueOf(322);
        Integer x8 = Integer.parseInt("322");

        System.out.println(x5 == x6);
        System.out.println(x5 == x7);
        System.out.println(x5 == x8);
        System.out.println(x5.equals(x6));
        System.out.println(x5.equals(x7));
        System.out.println(x5.equals(x8));
    }
}
