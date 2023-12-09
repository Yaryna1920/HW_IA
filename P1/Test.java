package P1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Umka");
        Cat cat = new Cat("Bianka");

        System.out.println("Number of paws of the dog: " + dog.numberOfPaws());
        cat.sleep();
    }
}