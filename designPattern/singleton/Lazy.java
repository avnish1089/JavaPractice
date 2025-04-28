package designPattern.singleton;

// Lazy type
// problem with this is that, if two thread came at the same time, then two objects will be created.
public class Lazy {
    private static Lazy ob; 
    private Lazy(){

    }
    public static Lazy getLazyInstance(){
        if(ob == null){
            ob = new Lazy();
        }
        return ob;
    }
}
