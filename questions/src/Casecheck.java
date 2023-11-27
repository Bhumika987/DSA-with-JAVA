import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        //String word ="hello";
        //System.out.println(ch);
        // &&=both T
        // ||= one T

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
