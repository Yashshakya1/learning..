package learning.com;

public class array_2d {
    public static void main(String[] args) {
        // this is a 2d array //
        int[][] flats = new int[3][3];
        flats [0][0] = 10;
        flats [0][1] = 20;
        flats [0][2] = 30;

        flats [1][0] = 40;
        flats [1][1] = 50;
        flats [1][2] = 60;

        flats [2][0] = 70;
        flats [2][1] = 80;
        flats [2][2] = 90;

        // displaying the 2d array for using loop

        for(int i=0;i< flats.length;i++){
            for(int k=0;k< flats.length;k++){
                System.out.print(flats[i][k]);
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }
}
