import java.util.*;

class T2 implements Runnable {
    String name;
    private boolean exit = false;

    //Constructor
    public T2(final String s) {
        this.name = s;
        this.exit = false;
    }

    //Method to flag the thread to stop
    public void requestStop() {
        this.exit = true;
    }
    
    //Run method that will run when the thread is invoked
    public void run() {
        try {
            while (!exit) {
                Thread.sleep(1000);
                System.out.println(name);
            }
        } catch(final Exception e) {
            System.out.println(e);
        }
    }
}