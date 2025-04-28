package multithreading;
// Create a class that implements Runnable and 
// prints characters 'A', 'B', 'C' with a delay of 300ms between them.
public class RunnableAssign implements Runnable{

    @Override
    public void run() {

        for(int i = 65; i<= 67; i++){
            System.out.println( Thread.currentThread().getName()  + " " + (char)i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("exception occured" + e);
            }
        }
    }
    
}
