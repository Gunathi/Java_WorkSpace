public class NewThread extends Thread{

    Thread t;

    NewThread(){
        super("Child Thread");
        System.out.println("Child Thread: " + this);
    }

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting Child Thread.");
    }
}
