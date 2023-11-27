import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        /*String msg = great();
        System.out.println(msg);
    }
    static String great(){
        String string = "Welcome to java!";
        return string;
        }

         */

        Scanner in= new Scanner(System.in);
        System.out.print("the name is: ");
        String name= in.next();
        String sr = in.next();
        String a=hello(name, sr);
        System.out.println(a);
    }

    static String hello(String name, String sr){
        String msg = "Hello " + name + " "+sr;
        return (msg);

    }

}
