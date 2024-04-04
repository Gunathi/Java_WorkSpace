public class ParentThread {
    public static void main(String[] args) {

        NewThread nt = new NewThread(); //Creating new child thread
        nt.t.start(); //start the execution of child thread

        for(int i = 0; i < 5; i++){
            System.out.println("Parent thread: " + i);
            try {
                Thread.sleep(1000); //Ensures exiting of main thread after child thread exit
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Main Thread is exiting. ");
    }
}
