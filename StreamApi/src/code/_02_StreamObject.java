package code;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class _02_StreamObject {
    public static void main(String[] args) {
        //Stream API - collection process
        //collection/ group of object

        //1 blank
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> System.out.println(e));

        //2- array, object, collection
        String names[] = {"Pranshu", "Hrithik", "Chetan"};

       Stream<String> stream1 = Stream.of(names);

       stream1.forEach(e -> System.out.println(e));


       //3 builder method
        Stream<Object> streamBuilder = Stream.builder().build();

//there are lot many ways etc....................
    }
}
