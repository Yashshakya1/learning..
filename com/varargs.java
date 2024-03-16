package learning.com;

public class varargs {
   /* static int sum(int a,int b){
        return a+b;                          // this is waste your
                                                  time so i used varargs //
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }*/
    /* static int sum(int...arr){ // this is a int type of array
        int result =0;                // this is a right way
        for(int element:arr){         // to safe your time
            result += element;
        }
        return result;
    }*/
   static int sum(int x,int...arr){
       int result =x;
       for(int element:arr){
           result += element;
       }
       return result;
   }
    public static void main(String[] args) {
        System.out.println("the sum of 2 numbers are "+(sum(0)) );                     // you are not use the empty
        System.out.println("the sum of 2 numbers are "+(sum(5,4)) );        // because i put one more integer in
        System.out.println("the sum of 3 numbers are "+(sum(5,4,5)) );      // perimeters
        System.out.println("the sum of 8 numbers are "+(sum(5,4,8,7,9,7,5,45)) );
    }
}
