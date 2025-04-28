package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    
    public static void main(String[] args) {
        // Assignment ob = new Assignment();
        // ob.start();
        // RunnableAssign ob = new RunnableAssign();
        // Thread t1 = new Thread(ob);
        // t1.start();
        // EvenOdd ob = new EvenOdd();
        // Thread t2 = new Thread( () ->{
        //         ob.even();
        // } );
        // Thread t3 = new Thread(() ->{
            
        //         ob.odd();
        // } );

        // t2.start();
        // t3.start();

        ReentrantLock lock = new ReentrantLock();
        LearnLock ob = new LearnLock(lock);
        Thread t4 = new Thread( () ->{

            for(int i=0; i< 5; i++)
                ob.incrementCounter();
        } );
        Thread t5 = new Thread(() ->{
            
             for(int i=0; i< 5; i++)
                ob.incrementCounter();
        } );

        t4.start();
        t5.start();
       


    }
}
