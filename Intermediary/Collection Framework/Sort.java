import java.util.*;

public class Sort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            nums.add(num);
        }

        //sort according to the second number of each number
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Collections.sort(nums, com);
        System.out.println(nums);

    }
}
