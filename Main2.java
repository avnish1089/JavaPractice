import funtionalinterface.*;
import multithreading.sharedResource;

public class Main2 {
    public static void main(String[] args) {
        // functionInterfaceLamda();
        // multiThreadProducerConsumer();
        learnStreams();
    }
    public static void learnStreams(){
         Streams ob = new Streams();
        ob.calculateEven();
    }
  
  public static void  multiThreadProducerConsumer(){
        sharedResource sharedResourceObj = new sharedResource();

        Thread threadProduce = new Thread( ()->{
           
            for(int i =0 ; i< 6; i++){
                sharedResourceObj.addItem(i);
            }
            
        });

        Thread threadConsume = new Thread(()->{
            for(int i =0 ; i< 6; i++){
             sharedResourceObj.consumeItem();
            }
        } );

        threadProduce.start();
        threadConsume.start();
    }
      public static void functionInterfaceLamda(){
         implementfunctions ob = new implementfunctions();
        ob.invoke();
        System.out.println("FI completed with lamdda exmp");

        sorting ob2 = new sorting();
        ob2.checkingSort();
    }
}