package car;

import person.Person;

public class Car {

    String modelNumber;
    Person owner;

    public static void main(String[] args) {

        Person person = new Person(38,"John doe");

        Car car = new Car();
        car.modelNumber = "LWERT-78545";
        car.owner = person;

        System.out.println("Model number of car is: " + car.modelNumber + " which is owned by: " + car.owner.owner());

    }
}
