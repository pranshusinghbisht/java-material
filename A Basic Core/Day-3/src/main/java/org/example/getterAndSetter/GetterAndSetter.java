package org.example.getterAndSetter;

public class GetterAndSetter {
    private int age;
    private String name;

    //default construcor / no param constructor
    public GetterAndSetter() {
    }

    //parameterised constructor
    public GetterAndSetter(int age, String name) {  //int age, String name these are parameter
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GetterAndSetter{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        GetterAndSetter x = new GetterAndSetter();
        x.setName("Pranshu");
        x.setAge(27);

        System.out.println(x.getName());
        System.out.println(x.getAge());


        GetterAndSetter x2 = new GetterAndSetter(27,"pranshu");
        System.out.println(x2);





    }
}
