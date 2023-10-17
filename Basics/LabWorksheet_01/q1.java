import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an odd length word: ");

        String str = scanner.next();

        int mid = str.length()/2;

        if(str.length() % 2 == 0){
            System.out.println("Please enter odd length word!");
        }else {
            System.out.println(str.charAt(mid));
        }
    }
}
