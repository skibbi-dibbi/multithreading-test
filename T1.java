import java.util.*;

class T1 extends Thread {
    String name;
    private boolean exit;

    //Constructor
    public T1(final String s) {
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
            while (!this.exit) {
                Thread.sleep(1000);
                System.out.println(name);
            }
        } catch (final Exception e) {
            System.out.println(e);
        }
    }
}