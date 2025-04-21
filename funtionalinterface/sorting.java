package funtionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting{

public void checkingSort()
{
    List<Integer> list = new ArrayList<>();
   
    for(int i=10; i>=0; i--)  list.add(i);
    

    // using anaonymouys class method
    // Comparator<Integer> ob = new Comparator<>() {
    //     @Override
    //    public int compare(Integer a, Integer b){
    //         if( a > b)
    //             return 1;
    //         else if ( a<b)
    //             return -1;
    //         else
    //              return 0;
    //     }
    // };
   
   // Comparator<Integer> comp = (a,b) -> a-b;

   // using lamda expressions
    Collections.sort(list, (a,b) -> a-b);
    
    for( int j : list) System.out.println(j) ;
}
    
}
