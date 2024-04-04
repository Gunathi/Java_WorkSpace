public class Main {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Current Thread: "+t);

        t.setName("My Thread");

        System.out.println("After change the name: " + t);

        for(int i = 0; i < 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}