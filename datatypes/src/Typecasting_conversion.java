import java.util.Scanner;

public class Typecasting_conversion {
    public static void main(String[] args) {
        /* one type of data that is assigned to another type of variable and automatic conversion will
        take place it meets the following requirements */
        Scanner input = new Scanner(System.in);
        //float num= input.nextFloat();
        //int num= input.nextShort();
        //int num= input.nextByte();
        //System.out.println(num);

        //type casting
            //int num = (int)(78.56);
            //System.out.println(num);

        //automatic type promotion in expression
           // int a= 514;
           // byte b=(byte)(a);//514%257=2
           // System.out.println(b);

       // byte a= 40;
       // byte b= 50;
       // byte c= 100;
       // int d = (a*b)/c;
       // System.out.println(d);

        // int number= 'A';//ascii value
        // System.out.println(number);

        byte b =42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d*s);
        //float+int-double= double
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);





    }
}
