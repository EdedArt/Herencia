package animal;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }

    public void display() {
        System.out.println("Animal Name: " + name);
    }
}
