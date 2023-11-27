public class Shadowing {
    // the practice of using 2 variables with same name within the scope that overlaps*/
    static int x=90;//shadowed at line at 7
    public static void main(String[] args) {
        System.out.println(x);//90
        int x=40;
        System.out.println(x);//40
        fun();

    }
    static void fun(){
        System.out.println(x);//90 scope same
    }
}
