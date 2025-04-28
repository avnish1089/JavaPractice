package multithreading;

// Create a simple Java class that extends Thread and prints numbers from 1 to 5
//  with a 500ms sleep between each number.
public class Assignment extends Thread{
    
    @Override
    public void run() {
        for(int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getName()  + " " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        } 
    }
}
