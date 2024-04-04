public class Main {
    public static void main(String[] args) {

        NewThread nt = new NewThread();
        nt.start();

        for(int i = 0; i < 5; i++){
            System.out.println("Parent thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting Parent Thread.");
    }
}