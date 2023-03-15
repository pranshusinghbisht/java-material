package methodReference.constructorMethodReference;

public class Main {
    public static void main(String[] args) {

        System.out.println("Learning Constructor Reference");

        //using lambda
        Provider provider = () -> {
         return new Student();
        };

        Student student = provider.getStudent();
        student.display();

        //using constructor reference

        //className::new
        Provider p = Student::new;

        Student s = provider.getStudent();
        s.display();



    }
}
