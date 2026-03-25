import person.Student;
import person.Teacher;
import animal.Dog;
import animal.Cat;
import shape.Rectangle;
import shape.Circle;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("        1. PERSON HIERARCHY");
        System.out.println("=====================================");
        Student student = new Student("Alice", 20, "S12345");
        Teacher teacher = new Teacher("Mr. Smith", 45, "Mathematics");
        
        student.display();
        teacher.display();

        System.out.println("\n=====================================");
        System.out.println("        2. ANIMAL HIERARCHY");
        System.out.println("=====================================");
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Whiskers");
        
        dog.display();
        dog.makeSound();
        
        cat.display();
        cat.makeSound();

        System.out.println("\n=====================================");
        System.out.println("   3. FIGURES (GEOMETRIC SHAPES)");
        System.out.println("=====================================");
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        Circle circle = new Circle(7.0);
        
        rectangle.display();
        circle.display();
    }
}
