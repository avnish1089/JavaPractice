package multithreading;
import java.util.concurrent.locks.*;

public class LearnLock {
    private int counter = 0;
    private ReentrantLock l;
    public LearnLock(ReentrantLock l){
        this.l = l;
    }
    public void incrementCounter(){
         l.lock();
        try{
           
            System.out.println(Thread.currentThread().getName()  +" " + counter);
            counter++;
        }
        catch(Exception e){
            System.out.println(Thread.currentThread().getName()  +" " +  e);
        }
        finally{
            l.unlock();
        }
    }
}
