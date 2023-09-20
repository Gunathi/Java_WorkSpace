import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //One dimensional array

        int arr[] = {1,2,3,4}; //array declaration and initialization

        int numbers[] = new int[4]; //dynamically create an array
        System.out.println("One dimensional array......");
        //insert values to array
        System.out.println("Enter elements: ");
        for(int i = 0; i < 4; i++){
            Scanner sc = new Scanner(System.in);
            numbers[i] = sc.nextInt();
        }

        //access elements of array
        for(int i = 0; i < 4; i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Two dimensional array......");

        //Two dimensional array

        int nums[][] = new int[3][4];

        //assign random integers to two dimensional array
        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 4; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        //accessing two dimensional array
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //access elements of array in enhansing method
        System.out.println("Access in enhansing method....");
        for(int n[]: nums){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
