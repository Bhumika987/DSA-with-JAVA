import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //CIRCLE
        /*System.out.print("radius is; ");
        int r= input.nextInt();
        double pi=3.14;
        double area=pi*r*r;
        System.out.println("Area of circle is: " + area);

         */

        //TRIANGLE  &&  //ISOSCELES TRIANGLE  &&  //RHOMBUS(D1,D2)
        /*System.out.print("base: ");
        int b= input.nextInt();
        System.out.print("height: ");
        int h= input.nextInt();
        int area=(b*h)*1/2;
        System.out.println("area of triangle: "+area);

         */

        //RECTANGLE  && PARALLELOGRAM
        /*System.out.print("length: ");
        int l= input.nextInt();
        System.out.print("breadth: ");
        int b= input.nextInt();
        int area=l*b;
        System.out.println("area of rectangle: "+area);

         */

        //EQUILATERAL TRIANGLE
        /*float a = 5f ;
        double area = ( 1.73 * a*a) / 4 ;
        System.out.println("Area of Equilateral Triangle is:"+area);

         */

        //Surface area of CYLINDER
        /*System.out.print("radius: ");
        int r= input.nextInt();
        System.out.print("height: ");
        int h= input.nextInt();
        double pi=3.14;
        double area=2*(pi*r*h);
        System.out.println("area of rectangle: "+area);

         */

        //TOTAL surface area of CUBE
        System.out.print("a: ");
        float a = input.nextFloat(); ;
        double area = 6*(a*a);
        System.out.println("Area of Equilateral Triangle is:"+area);
    }
}
