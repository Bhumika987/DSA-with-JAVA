import java.util.Scanner;

public class voteeligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(vote(age));
    }

    static boolean vote(int age){
        if(age>=18){
            return true;
        }
        else {
            return false;
        }
    }
}
