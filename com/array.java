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

    }
}
