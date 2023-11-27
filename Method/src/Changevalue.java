import java.lang.reflect.Array;
import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,2,3,4};
        change( arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
        /*if you make any changes to the object with the help of the reference
        variable same object will be changed */

    }
}
