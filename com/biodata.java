package learning.com;
import java.util.Scanner;

public class biodata{
    public static void main(String[] args){
        System.out.println("enter your name :-");
        Scanner op = new Scanner(System.in);
        String name = op.nextLine();
        System.out.println("enter your sex:-");
        String se =op.nextLine();
        System.out.println("enter your hobby:-");
        String ho = op.nextLine();
        System.out.println("enter your father name :-");
        String fa = op.nextLine();
        System.out.println("enter your mother name:-");
        String ma = op.nextLine();
        System.out.println("enter your address:-");
        String add = op.nextLine();
        System.out.println("please"+ "enter your phone number "+ name);
        long num = op.nextLong();
        System.out.println("requirment of wife:-");
        System.out.println("-----------------------------------------------");

        System.out.println("enter your wife nature:-");
        String na = op.nextLine();
        System.out.println("enter your wife colour");
        String co = op.next();
        System.out.println("enter your wife occupation ");
        String oc =op.nextLine();
        System.out.println("you are check your bio data layout so press\t=1");
        int sw =op.nextInt();

        switch (sw){
            case 1:{
                System.out.println("---------------------------bio data------------------------");
                System.out.println("name:-"+name);
                System.out.println("sex:-"+se);
                System.out.println("hobby:-"+ho);
                System.out.println("father name:-"+fa);
                System.out.println("mother name:-"+ma);
                System.out.println("address:-"+add);
                System.out.println("mobile number:-"+num);
                System.out.println("wife nature:-"+na);
                System.out.println("wife colour:-"+co);
                System.out.println("wife occupation:-"+oc);
                System.out.println("---------------------------********------------------------");
                break;
            }
            default:{
                System.out.println("its error because you enter a wrong key");
                break;
            }
        }
    }

}