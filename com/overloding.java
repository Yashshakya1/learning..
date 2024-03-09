package learning.com;


import java.util.Scanner;

public class overloding {
    /* this is a void type
      it is used for the
      when you don't need
      of any return type
    */
    static void joke  (){
        System.out.println("this is my joke i am yash shakya and i fully follished person");
    }
    static void joke(int a){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        joke();
        joke(a);
    }
}
