package person;

public class Person {

//    properties in class
   private int age;
   private String name;

   // constructor method

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public String personIntro()
    {
        return this.name + " is " + this.age + " years old !";
    }

    public String owner()
    {
        return this.name;
    }

    public static void main(String[] args) {
        Person person = new Person(25,"Arpit Mishra");
        System.out.println(person.personIntro());
    }

}
