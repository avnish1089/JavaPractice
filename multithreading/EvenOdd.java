package multithreading;
// Create two threads:
// First prints even numbers from 2 to 10.
// Second prints odd numbers from 1 to 9. ➔ Start both threads together and observe interleaving of output.
public class EvenOdd{
    private int number = 0; // Shared state
    private final int LIMIT = 10;

   public synchronized void even(){
        while( number <= LIMIT){
            while (number % 2 != 0 ) {
                
            try {
                System.out.println(Thread.currentThread().getName() +" waiting");
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        System.out.println( Thread.currentThread().getName() + " " + number);
        number++;
        notifyAll();
        }
    }
    public synchronized void odd(){
         

        while (number <= LIMIT) {
            
        while( number % 2 == 0){

            try { 
                System.out.println(Thread.currentThread().getName() +" waiting");
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    
        System.out.println( Thread.currentThread().getName() + " " + number);
        number++;
        notifyAll();

}
}
}
