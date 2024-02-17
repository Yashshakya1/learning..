package learning.com;

import java.util.Scanner;

public class Stringnm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name for check the lenght\nor you can also change the latters in the upper case ");
        // this is first method for string that is length //
        String name =sc.nextLine();
        int nm =name.length();
        System.out.println(nm);

        // 2 one is upper case //
        String upper =name.toUpperCase();
        System.out.println(upper);

        // 3 one is lower case //
        String lower = name.toLowerCase();
        System.out.println(lower);

        // 4 one is trim method //
        String space =name.trim();
        System.out.println(space);

        // 5 one is substract method //

        String parts = name.substring(3);
        System.out.println(parts);

        // 6 one is substract method in (advance version);  //

        String parts2 = name.substring(1,3);
        System.out.println(parts2);

        // 7 one is replace method //

        System.out.println(name.replace("g","t"));

        // 8 one is startswith and endswith //

        System.out.println("this is false because they not start with ys");
        boolean st = name.startsWith("ys");
        System.out.println(st);
        System.out.println("this is true because that ends is hA");
        System.out.println(name.endsWith("hA"));

        // 10 one is chacAt method //

        System.out.println(name.charAt(3));
        System.out.println(name.charAt(2));

        // 11 one is  indexof method //

        System.out.println("this is the index of s");
        System.out.println(name.indexOf('s'));
        System.out.println("this is the index of a");
        System.out.println(name.indexOf('a'));

        // 12 one is  indexof starting method  //

    //    System.out.println(name.indexOf("pa",3));

        // 13 one is  lastindexof method //

        System.out.println(name.lastIndexOf("ya",9));

        // 14 one is equal method //

        System.out.println(name.equals("yash"));

        // but you can print the string with ignoring which is
        // the method is equalignoring case method //

        System.out.println(name.equalsIgnoreCase("YaSh"));

        // escape characters //

        System.out.println("i am\r yash\f and\' in period\\ i was\b study in\t b.tech in cs");





    }
}