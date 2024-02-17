package learning.com;

import java.util.Scanner;

public class expresion {
    public static void main(String[] args) {

        // Resulting data types //
//        int a = 45 + 4;
//        float b = 14.4f + 5;
//        System.out.println(b);
//        System.out.println(a);
//
        // increment operator & decrement operator //
//
//        int i = 74;
//        int b = ++i;
//        System.out.println(b);
//
        // quick quiz //
        // Q. try increament & decrement operator in java variable !
        //  first use the value and then increament (a++)
        //  secand use the value and then decrement (++a)

        Scanner op = new Scanner(System.in);
        System.out.println("enter your age ");
        int i =op.nextInt();
        int b = i++;
        System.out.println(b);

        System.out.println("enter your year of birth");
        int k =op.nextInt();
        int c = ++k;
        System.out.println(c);

    }
}