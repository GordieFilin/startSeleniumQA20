package org.example;

public class CastingBaseExample {

    public static void main(String[] args) {
        Integer i = 77;
        System.out.println(i.getClass()); // class java.lang.Integer
        String istr = String.valueOf(i);
        System.out.println(istr.getClass()); // class java.lang.String
        System.out.println(i+10);
        System.out.println(istr+10);
        Integer j = Integer.parseInt(istr);
        System.out.println(j+i);
    }
}
