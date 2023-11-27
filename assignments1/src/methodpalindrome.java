import java.util.Scanner;

public class methodpalindrome {
    public static void main(String[] args) {
        ispalindrome();
    }
    static void ispalindrome(){
        Scanner in = new Scanner(System.in);
        int r, sum=0, temp;
        System.out.print("Enter a number: ");
        int x= in.nextInt();

        //temp=x;
        //if(x>0){
          //  r=x%10;
            //sum=(sum*10)+r;
            //x=x/10;
        //}
        //if(temp==sum){
          //  System.out.println("NO. is palindrome");
        //}
        //else
          //  System.out.println("not a Palindrome");

        temp=x;
        while(x>0){
            r=x%10;  //getting remainder
            sum=(sum*10)+r;
            x=x/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}

