//To run multiple methods parallel we have to extends the method by Thread class.
class A extends Thread{

    //The method which should run parallel must name as run
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Hii");
        }

    }
}

class B extends Thread {
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Hello");
        }
    }
}

public class Multi_Thread {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); //Call the method run() using start() method
        obj2.start();
    }
}
