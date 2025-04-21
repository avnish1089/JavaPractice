package funtionalinterface;

public class implementfunctions {
    int a = 4; 
    int b = 5;
    
    public void invoke(){
// using implement method 
    // @Override
    // public int operation(int a, int b) {
    //     return a+b;
    // }     
    
    // using lambda exp
   calculator add = (x,y) -> x+y;


   // using annonyous class
   calculator sub = new calculator() {
    
    @Override
    public int operation(int a, int b){
        return a - b;
    }
   };
   
    System.out.println( add.operation(a, b));
    System.out.println(sub.operation(a,b));

    }
     
}
