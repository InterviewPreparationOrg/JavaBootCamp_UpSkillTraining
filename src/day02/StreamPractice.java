package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

       list = list.stream().map( e ->  e*3  ).collect(Collectors.toList());

        System.out.println(list);

        // add 5 to every single odd numbers in the list
        list = list.stream().map( e -> { if(e%2!=0) return e +5; return e; }).collect(Collectors.toList());

        System.out.println(list);

        System.out.println("---------------------------------------------------");

        List<Integer> numbers = list.stream().filter( p ->  p %3 ==0 ).map( n -> n*2 ).collect(Collectors.toList());

        System.out.println(numbers);

        System.out.println("----------------------------------------------------");

        List<String> students = new ArrayList<>();
        students.addAll( Arrays.asList("John", "Jimmy", "James", "Breanna", "Shay", "Josh") );

        students.stream().skip(3).map(s -> s.toUpperCase() ).map( s -> s.charAt(0)+""+s.charAt(s.length()-1)).forEach( x -> System.out.println(x)  );

        System.out.println(students);

        System.out.println("----------------------------------------------------------------");

        Integer[] array = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,5,5,5,6,6,6,6};
         array = Arrays.asList(array).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);

        System.out.println(Arrays.toString(array) );

        System.out.println("---------------------------------------------");

        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10));

        nums = nums.stream().limit(7).collect(Collectors.toList());

        System.out.println(nums);


        System.out.println("------------------------------");

        List<Integer>  list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        int result = list2.stream().filter( p -> p %2!=0).reduce(0, (x,y) -> x+y  );
        System.out.println(result);

        System.out.println("-------------------------------");

        List<String> words = new ArrayList<>(Arrays.asList("Java", "Java", "Anna", "Level", "Kayak", "Python", "Bob"));
       String palindromes = words.stream().filter( p ->   new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) )
                .reduce("",  (x,y) -> x+" "+y );

        System.out.println(palindromes);

        System.out.println("---------------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

       boolean allEven =  list3.stream().allMatch( p -> p%2 == 0);
       boolean allLessThan11 = list3.stream().allMatch( p -> p < 11);
       boolean eitherOddOrEven =  list3.stream().allMatch( p -> p %2==0 || p%2!= 0);

        System.out.println(allEven);
        System.out.println(allLessThan11);
        System.out.println(eitherOddOrEven);

        System.out.println("------------------------------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean t1 = list4.stream().anyMatch( p -> p >5 && p < 9);

        System.out.println(t1);


        System.out.println("---------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Cybertek", "School", "James", "Anna", "Python", "Cava"));

       String str1 = names.stream().filter( p -> p.toLowerCase().contains("a")).reduce("", (x, y)-> x+" "+y );

        System.out.println(str1);














    }


}
