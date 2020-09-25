import java.util.*;

public class main {

    //Metod för att pausa tråden i fem sekunder
    public static void sleepFiveSeconds() {
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(final String[] args) {
        
        //Create and run first thread
        System.out.println("Startar tråd 1.\n");
        final T1 t1obj = new T1("Tråd 1");
        final Thread t1 = t1obj;
        t1.start();
        
        //Pause main thread for five seconds
        sleepFiveSeconds();  

        //Invoke second thread
        System.out.println("Startar tråd 2.\n");
        final T2 t2obj = new T2("Tråd 2");
        final Thread t2 = new Thread(t2obj);
        t2.start();
        
        //Pause main thread for five seconds
        sleepFiveSeconds();

        //Stop first thread
        System.out.println("Stoppar tråd 1.\n");
        t1obj.requestStop();

        //Pause main thread for five seconds
        sleepFiveSeconds();

        //Stop second thread
        System.out.println("Stoppar tråd 2.\n");
        t2obj.requestStop();
    }
}