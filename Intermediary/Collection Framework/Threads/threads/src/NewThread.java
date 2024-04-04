//Creating the second thread implementing runnable interface
public class NewThread implements Runnable{
    Thread t; //instantiate an object of type Thread

    //Constructor of NewThread class
    NewThread(){
        //Thread defines several constructors Thread(Runnable obj, threadName)
        t = new Thread(this, "New Thread"); //creating new thread
        System.out.println("Child Thread: " + t);
    }

    //Execution begins here
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Chlid thread: " + i);
            try {
                Thread.sleep(500); //Child thread should finish execution before main thread exit
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting child therad.");
    }
}
