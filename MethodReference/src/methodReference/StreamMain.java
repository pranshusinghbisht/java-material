package methodReference;

import java.util.List;

//eg of constructor method reference using stream
public class StreamMain {
    public static void main(String[] args) {
       List<Integer> list = List.of(14,12,32,65,76);

//       list.stream().forEach(e -> {
//           System.out.println(e);
//       });

        list.stream().forEach(System.out::println);

    }
}
