class Calculator {

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, int b){
        return a+b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int r1 = obj.add(3, 5);
        int r2 = obj.add(2, 4, 7);
        double r3 = obj.add(32.12, 5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
