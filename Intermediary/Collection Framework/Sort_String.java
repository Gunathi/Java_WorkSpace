import java.util.*;

public class Sort_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.print("Enter name: ");
            String name = scanner.next();
            names.add(name);
        }

        //sort names according to the length.
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Collections.sort(names, com);
        System.out.println(names);
    }
}
