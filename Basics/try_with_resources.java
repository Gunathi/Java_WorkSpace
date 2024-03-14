import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        int num = 0;
        BufferedReader br = null;
        try {

            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally {
            br.close();
        }

//        this can be done simply

        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
//         this wll automatically close the resource which used
        }
    }
}