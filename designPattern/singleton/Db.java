package designPattern.singleton;

// this pattern is used when we want object only one time,
// for example when we want a object of a db. 

// Below is called using Eager method 
public class Db {
    private static Db ob = new Db(); 
    private Db(){

    }
    public static Db getInstDb(){
        return ob;
    }
}
