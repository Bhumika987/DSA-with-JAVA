import java.util.Arrays;

public class Vararchs {
    public static void main(String[] args) {
       //
        //fun(2,3,4,5,6,7,8);
        multiple(2,5,"hey","how","r","u");
//called via more then 0 or 0 arguments
    }

    static void multiple(int a, int b, String...v){

    }
    static  void  fun(int...v){//few integers__when you don;t know how many integers to pass
        System.out.println(Arrays.toString(v));

    }
}
