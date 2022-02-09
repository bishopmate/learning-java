import java.util.*;

class Processor extends Thread{
    private volatile Boolean running = true;// prevents the thread from caching the value if it is not changed in the run method(can be useful when any other thread may try to change it's value by calling shutdown function)
    public void run(){

        while(running){
            
            System.out.println("Hello");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }

    }

    public void shutdown(){
        running = false;
    }
}
public class App {
    public static void main(String[] args) {
        Processor processor1 = new Processor();
        processor1.start();

        System.out.println("Press enter to stop... " );
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        processor1.shutdown();

    }
}
