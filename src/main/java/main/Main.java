package main;
import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;
import university.Student;
import university.Course;
import university.Enrollment;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Books",1000);
//        System.out.println(product1.getProductName());

        Inventory inventory1 = new Inventory(1,new String[]{"Books","Pens","Stationary Items"},500);
//        for(String product : inventory1.getProducts())
//        {
//            System.out.println(product);
//        }

        Warehouse warehouse1 = new Warehouse(1,"Hadquarter",new String[]{"Hathwara","Civilines"});
//        for(String warehouse : warehouse1.getInventories())
//        {
//            System.out.println(warehouse);
//        }

        Student student1 = new Student(256,"Arpit Mishra");
//        System.out.print(student1.getStudentName());

        Course course1 = new Course(566,"Engineering");
//        course1.getCourseName();

        Enrollment enrollment1 = new Enrollment(student1, course1);
        enrollment1.getStudentName();
        enrollment1.getCourseName();
    }
}
