public class Main {
    public static void main(String[] args) {

        A obj = (i) -> System.out.println("in show " + i);

        obj.show(5);

        B sum = (a, b) -> a+b; //this will return a+b 

        System.out.println(sum.add(3,7));
    }
}
@FunctionalInterface
interface A{
    void show(int i);
}

interface B {
    int add(int a, int b);
}
