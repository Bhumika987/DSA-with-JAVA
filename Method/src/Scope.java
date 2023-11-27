public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name= "bhumika";
        {
            //a=78;  already initialized outside the block so cant be initialized again
            a=34;//re-assign the original ref variable to some other variable
            System.out.println(a);
            int c=99;// if anything is initialized inside the box it can be initialized outside the box;
            name="Jass";
            System.out.println(name);
            //values initialized in this block will be there in this block and can't be used outside the block
        }
        //System.out.println(c);
        //System.out.println(a);
        System.out.println(name);
    }

    static void random(int marks){
        int sum=67;
        System.out.println(marks);
    }
}
