import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.get(3)); //get the value of index 3
        System.out.println(nums.indexOf(5)); //get the index of value 5

        //print all the values of array list
        for(int n : nums) {
            System.out.println(n);
        }
    }
}
