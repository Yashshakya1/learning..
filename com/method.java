package learning.com;

public class method {


     int mycal(int a,int b){
         int c=0;
         if(a>b){
             c=a+b;
         }
         else {
             c=a*b;
         }


        return c;
    }


    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c;
        // this call use when you used a static
       // c = mycal(a,b);
        // when without used the static so you can call with create a object like
        //  below in the
        method op = new method();
        c =op.mycal(a,b);
        int x = 8;
        int y =3;
        int xy = op.mycal(a,b);
        if (y < x) {
            xy = xy*x+y;
        }
        else {
            xy =0;
        }


        System.out.println(xy);
        System.out.println(c);
    }
}

