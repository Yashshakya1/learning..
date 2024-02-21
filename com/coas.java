package learning.com;
import java.util.Scanner;

public class coas{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------this is calculator for shapes and normal calculation------------");
        System.out.println("this is instractions for using this programe\n1.calculate for perimeter of rectangal:--\n2.calculate for discriment\n3.calculate for tringle\n4.calculate for surface area of cuboid\n5.calculate for area of circle\n6.calculate for volume of cylinder");
        System.out.println("enter your number");
        int mamo = sc.nextInt();

        switch (mamo){

            case 1: {
                System.out.println("enter your lenght:-");
                int ln = sc.nextInt();
                System.out.println("enter your width:-");
                int wi = sc.nextInt();
                int re =2*(ln*wi);
                System.out.println(re);
                break;
            }
            case 2:{
                System.out.println("enter your b value");
                int b = sc.nextInt();
                System.out.println("enter your a value");
                int a1 = sc.nextInt();
                System.out.println("enter your c value");
                int c1 = sc.nextInt();
                int sum2 = b*b-4*(a1*c1);
                System.out.println("this is your discremet\n"+sum2);
                break;
            }
            case 3:{
                System.out.println("enter your lenght");
                float l2 = sc.nextInt();
                System.out.println("enter your width");
                float b2 = sc.nextInt();
                float sum3 = (l2*b2)*1/2;
                System.out.println("this is your area of tringle\n"+sum3);
                break;
            }
            case 4:{
                System.out.println("enter your length");
                int l3 = sc.nextInt();
                System.out.println("enter your height");
                int h3 = sc.nextInt();
                System.out.println("enter your width");
                int w3 = sc.nextInt();
                int sum4 = 2*(l3*w3)+(w3*h3)+(h3*l3);
                System.out.println("this is your area of cuboid\n"+sum4);
                break;
            }
            case 5:{
                System.out.println("enter your r");
                int r = sc.nextInt();
                float pi = 3.14f;
                float sum5 = pi*r*r;
                System.out.println("this is your area of circle\n"+sum5);
                break;
            }
            case 6:{
                System.out.println("enter your r");
                int r2 = sc.nextInt();
                System.out.println("enter your height");
                int h6 = sc.nextInt();
                float pi2 =3.14f;
                float sum6 = pi2*r2*r2*h6;
                System.out.println("this is your volume of cylinder\n"+sum6);
                break;
            }



        }
    }
}