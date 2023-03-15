import java.util.Optional;

public class Main {
    public static void main(String[] args) {
  /*       String str = null;
      if(str == null){
           System.out.println("this is null value");
       }else{
           System.out.println(str.length());
       }
    }*/

        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
        System.out.println(optional.orElse("No value"));

    }
}