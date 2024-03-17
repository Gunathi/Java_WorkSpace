import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> students = new HashMap<>();

        for(int i = 0; i < 4; i++){
            System.out.print("Enter student name: ");
            String name = scanner.next();

            System.out.print("Enter student mark: ");
            int mark = scanner.nextInt();

            students.put(name, mark);
        }

        System.out.println(students.keySet());

        for(String name : students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }
        System.out.println(students);


    }
}
