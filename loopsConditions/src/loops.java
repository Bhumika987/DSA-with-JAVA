import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    //FOR LOOP
        //Q; to print numbers from 1 to 5
            /*Syntax of for loops:
             for(initialization;condition;increment/decrement){
                           //body
                 }*/

                    /*for(int n=1; n<=5;n+=1){
                        System.out.println(n);
            }*/


        //Q; to print no. from 1 to n
                /*int num=input.nextInt();//initialize num or upto how many times it will run
                for(int n=1;n<=num;n++){//n<=n, for infinity
                    System.out.println(n + " Hello World");
                    System.out.println(" Hello World");
                }*/


    //WHILE LOOP
        /*Syntax of while loops:
             while(condition){
                           //body
                 }*/

        /*int num=1;
        while(num<=5){
            System.out.println(num);
            num++;
        }

         */


    //DO-WHILE LOOP
        /*Syntax of for loops:
             do{
             //body
             }
             while(condition)
            */
        int num=1;
        do {
            System.out.println(num);
            num++;
        }
        while(num<=5);
    }
}
