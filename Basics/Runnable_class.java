class AB implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hi");
        }
    }
}

class BC implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello");
        }
    }
}

public class Runnable_class {
    public static void main(String[] args) {

//        Runnable obj1 = new AB();
//        Runnable obj2 = new BC();

        //create Runnable objects using lambda function because runnable is a functionalInterface
        Runnable obj1 = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };

        Runnable obj2 = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
