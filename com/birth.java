package learning.com;

import java.util.Scanner;

public class birth{
    public static void main(String[]args){
        System.out.println("enter your nic name ");
        System.out.println("enter your date");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int a = sc.nextInt();
        System.out.println("enter your monuth ");
        int b = sc.nextInt();
        System.out.println("enter your year ");
        int c = sc.nextInt();
        int d = c-2023;
        System.out.println(d);
        System.out.println(name +" this is your birth age " + a +"-" + (b) +"-" + (c) );
        System.out.println(name +" this is your current age" + d);

    }
}
