package learning.com;

public class array  {
    public static void main (String[]args){

        // mainly used 2 method to use the array //

        /* fist method
          declare and allocation in same line */

        int [] marks = new int[6];
        marks[0] = 45;
        marks[1] = 65;
        marks[2] = 90;
        marks[3] = 78;
        marks[4] = 98;
        marks[5] = 38;
        System.out.println(marks[0]);


       char[] latters = new char[6];
        latters[0] ='a';
        latters[1] ='b';
        latters[2] ='c';
        latters[3] ='d';
        latters[4] ='e';
        latters[5] ='f';
        System.out.println(latters[4]);

        /* secand  method
          declare and Initialize in same line */

        String[] name = {"yash","niha","suraj","armaan",};
        System.out.println(name[3]);

        /* array hava a length property which gives a length of the array //
           for example */

        float[] percentage ={45,78,94,75,94,9,15,46};
        System.out.println(percentage.length);

        // array can be display for using for loop //

        int[] numbers = {1, 2, 3, 4, 5};

        // Using a for loop to iterate through the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
            // 2nd example of array in for loop //

            System.out.println("the success keywards ");
            String[] dream = {"passinate","determenation","dadication","hard work","never give up"};
            for(int d = 0; d<dream.length; d++){
                   System.out.println(dream[d]);
            }

        System.out.println("this is a key of success to achieve your not a dream it's aim your life ");

            // in reverse order array in loop //

          String[] sweets ={"1.cake","2.choclate","3.Ladoo"};
          for(int a = sweets.length -1; a>=0; a-- ){
              System.out.println(sweets[a]);
          }

           // each loop in java for displaying the array //

          for(String element:sweets){
              System.out.println(element);
          }

          /*
            this loop is usefull when you need only array element.
             whenever you used the array travrsal.

             { array travrsal used when
             you need the element of the array
              and value of i }

            */

            // this is a question to more strong commend in the all types of array //

           // q1 Write a Java program to sum values of an array.

           // Declare and initialize a variable to store the sum.
            int sum =0;
           // Iterate over each element of the array using an enhanced for loop.

            int[] arraysum ={1,2,3,4,5,6,7,8,9,10};
            for(int op: arraysum ){
               sum+=op;
            }
              System.out.println("the sum of the array is " + sum );


    }
}
