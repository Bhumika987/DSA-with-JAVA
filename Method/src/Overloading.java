public class Overloading {
    //happens at compile time
    //1. no. of arguments should be different
    //2. type of argument should be different
    public static void main(String[] args) {
        //fun(67);
        //fun("Hello");
        int ans = sum(6,8,9);
        System.out.println(ans);

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    /*static void fun(int a){
        System.out.println(a);

    }
    static  void fun(String name){
        System.out.println(name);
    }

     */
}
