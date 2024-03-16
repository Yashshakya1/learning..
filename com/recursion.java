package learning.com;
import java.util.Scanner;
public class recursion {
   int  fibonacci_num(int limit,int next){
       Scanner bc = new Scanner(System.in);
       System.out.println("the fibonacci series up to "+ limit );
       limit = 5;
       int a = 0; int b = 1;
       for (int i=2; i <limit; i++){
        next = a+b;
           System.out.print(next + " ");
           a = b;
           b = next;
       }
       return b;
   }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number to find the factorial");
        int n=sc.nextInt();
        System.out.println(factorial(n));
        recursion op = new recursion();
        int num = sc.nextInt();
        int a = 0; int b = 1;
        int next =a+b;
        int limit=4;
        op.fibonacci_num(limit,next);

    }
}
