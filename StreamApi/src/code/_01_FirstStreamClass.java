package code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _01_FirstStreamClass {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////////////
        //*)create a list and filter all even numbers from list

      List<Integer> list1 =  List.of(2,4,50,21,22,67); // immutable list

        //List,Integer> list = Arrays.asList(23,23,24,25,34) // another way to create list

        //without stream

        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if(i%2 == 0){
                listEven.add(i);
            }
        }
        System.out.println(listEven); // this will return llist of even numbers


        ////////////////////////////////////////////////////////////////////////////////////////////

        // using stream api

       Stream<Integer> stream = list1.stream();
//      List<Integer> newList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(newList);


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //*)create a list and filter all the number greater than 50

        List<Integer> newList1 = list1.stream().filter(i -> i>50).collect(Collectors.toList());
        System.out.println(newList1);

    }
}
