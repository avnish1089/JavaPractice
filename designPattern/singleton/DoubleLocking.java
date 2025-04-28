package designPattern.singleton;

public class DoubleLocking {
 private static DoubleLocking ob; 

 private DoubleLocking(){

 }
    
public static DoubleLocking getInstance(){

        if(ob == null) {
            synchronized(DoubleLocking.class){
                ob = new DoubleLocking();
            }
        }
        return ob;
    }
}