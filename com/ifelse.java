package learning.com;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        System.out.println("enter your name ");
        Scanner ya = new Scanner(System.in);
        String nam =ya.nextLine();
        System.out.println("please enter your sex\n'0' for gay\n'1' for male\n'2' for female");
        int sex =ya.nextInt();
        System.out.println(nam+"enter your subject marks((to check you are fail or not))");
        int num =ya.nextInt();
        if (num<32){
            System.out.println(nam + "sorry you are fail because your marks are bellow 32");
        }
        if (sex<=0) {
            System.out.println(nam+"amazing you are pass and also top in entire collage will done hejdha ");
        }
        if (sex>1 & sex<1){
            System.out.println("congratulations "+nam+" you are pass of your examination good luck londay for fourthcoming class ");
        }
        if (sex>=2) {
            System.out.println("congratulations "+nam+" you are pass of your examination good luck londeya for fourthcoming class");
        }
    }

}
