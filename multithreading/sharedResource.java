package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class sharedResource {
    Queue<Integer> queue;
    int bufferSize;
   public  sharedResource(){
  queue = new LinkedList<>();
  bufferSize =3;
    }
    public synchronized void addItem(int item){
      
        // if queue is full, then wait for the consumer
        while( queue.size() == bufferSize){
            try{
                System.out.println("Producer is waiting");
                wait();
            }catch(Exception e){

            }
            
        }
        queue.add(item);
        System.out.println(item + " is produced");
        notifyAll();
    }
   
    public synchronized void consumeItem(){
        
        // if queue is empty, then need to wait for producer to produce
        while (queue.isEmpty()) {
            try{
                System.out.println("consumer is waiting");
                 wait();
            }catch(Exception e){
                // Some exception
            }
        }
        System.out.println( queue.poll()  + " item is consumed ");
        notifyAll();
}

}