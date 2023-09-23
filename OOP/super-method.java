//just played with super method
import java.util.Scanner;

class A {
    public A(){
        super();
        System.out.println("In A");
    }

    public A(int n){
        super();
        System.out.println("In A Para");
    }
}

class B extends A{
    public B(){

        System.out.println("In B");
    }

    public B(int n){
        this();
        System.out.println("In B Para");
    }
}

public class Main {
    public static void main(String[] args) {

        B obj = new B(5);
        
        //getting input from user.
        //have to create scanner object first
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); //nextint() use to getting integer from user

        System.out.println(num);
    }
}
