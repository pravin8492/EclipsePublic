package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Student;
import resource.Jconcig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Jconcig.class);
        Student std = context.getBean(Student.class);
        
        // Call a method on std (assuming there's a method in Student class)
        std.display();  // Replace 'display()' with an actual method from Student class
    }
}
