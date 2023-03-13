package code;

import java.util.List;
import java.util.stream.Collectors;

public class _03_ImportantStreamMethods {
    public static void main(String[] args) {
        //filer(Predicate)
        //predicate means boolean value function
        // lambda : e -> {return boolean}
 //******************************************************

        //map(Function) //return value
        /*
        each element operation

        [2,3,4] noraml list
        [4,9,16] square of value

         */

        //eg

        //filter
        List<String> names = List.of("Aman","Pranshu","Prem","Hrithik");
      List<String> newList =  names.stream().filter(e->e.startsWith("P")).collect(Collectors.toList());
        System.out.println(newList);


//map
        List<Integer> nums = List.of(23,4,3,5,3);
       List<Integer> newNums = nums.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(newNums);


        //sorted

        nums.stream().sorted().forEach(System.out::println);


        // min
       Integer integer = nums.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println(integer);

        // max
        Integer integer2 = nums.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println(integer2);

        //when many objects then we can use collect otherwise for single result get();


    }
}
