package designPattern.singleton;

public class synchronizedMethod {
    private static synchronizedMethod ob; 

    private synchronizedMethod(){

    }
   synchronized public static synchronizedMethod getInstance(){

        if(ob == null) {
            ob = new synchronizedMethod();
        }
        
        return ob;
    }
}
