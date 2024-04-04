public class NewThread implements Runnable{

    String name;
    Thread t;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread " + t);
    }

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Name: " + t.getName() + " " + i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting Thread " + t.getName());
    }
}
