import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Streams {
    
    public void calculateEven(){

        List<Integer> list = new ArrayList<>();
        for(int i =0; i< 10; i++)
            list.add(i);
        
        List<Integer> evenNumbers = list.stream().filter( (n)-> n % 2 == 0 ).toList();

        System.out.println(evenNumbers);
    
    }
    public void convertUpparCase(){
        List<String> names = Arrays.asList("avinash", "ravi", "deepak");

        List<String> upperCaseString = names.stream()
        .map(String :: toUpperCase)
        .collect(Collectors.toList());
        // String :: toUpperCase is same as str -> str.toUpperCase() , it is just a shortcut for lamda exp. 
        System.out.println(upperCaseString);
    }
    public void sumOfAllNumbers(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream().reduce(0, (a,b) -> a+b);

        System.out.println(sum);
    }
    public void sortList(){
        List<Integer> numbers = Arrays.asList(5, 2, 1, 4, 3);

        List<Integer> sortedList = numbers.stream()
        .sorted((a,b)-> b-a  )
        .collect(Collectors.toList());

        System.out.println(sortedList);
    }
    public void assignment1(){
        // Given a list of integers [10, 15, 8, 49, 25, 98, 32], 
        //filter numbers greater than 30 and sort them.
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        List<Integer> ans = numbers
        .stream()
        .filter( n -> n>30)
        .sorted()
        .toList();

        System.out.println(ans);

    }
    public void assignment2(){
        // Given a list of strings [“apple”, “banana”, “mango”, “grapes”], 
        // filter words that start with the letter 'a' and convert them to uppercase.
        List<String > list = Arrays.asList("apple", "banana", "mango", "grapes", "amrood" );

        List<String> ans = list.stream()
        .filter( (n) -> n.startsWith("a"))
        .map( n -> n.toUpperCase())
        .toList();

        System.out.println(ans);
    }
    public void assignment3(){
        // Given a list of integers [1,2,2,3,4,4,5], 
        // find distinct elements and count how many distinct numbers are there.
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);

        long totalDistinct = list.stream().distinct().count();
        System.out.println(totalDistinct);
    }
    public void assignment4(){
        // Given a list of strings [“java”, “stream”, “api”], 
        // join them into a single string separated by commas.
        List<String> list = Arrays.asList("java", "stream", "api");
        String ans = list.stream()
        .reduce("", (a,b) -> a.concat(b).concat(","));

        System.out.println(ans);
    }
    public void assignment5(){
        // Sum of squares of all odd numbers
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sum =  list.stream()
        .filter( a -> a%2 !=0 )
        .map( n -> n*n)
        .reduce(0, (a,b) -> a+b);
        

        System.out.println(sum);
    }
        public void assignment6(){
        // Find the second highest number in a list

        List<Integer> list = Arrays.asList(1,20,10,4,8,4,7,5,9);

        int secondHighest = list.stream()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElseThrow();
        System.out.println(secondHighest);
    }
    public void assignment7(){
    // Assignment 3: Group strings by their first character

    //    List<String> list = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");

    //    List<String> ans = list.stream().Collectors.groupingBy( a->))
    }
    public void assignment8(){
        // First Non-Repeated Character in a String
        // eg swiss ----> o/p w. 
        String str = "swiss";

        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        str.chars()
        .forEach(
            (n)-> hm.put( (char)n,  hm.getOrDefault((char)n, 0)+1)
         );

         hm.entrySet()
         .stream()
         .filter( (n) -> n.getValue() == 1)
         .findFirst()
         .ifPresent((entry) -> System.out.println( entry.getKey()));
         
        //  System.out.println(hm);
    }

}
