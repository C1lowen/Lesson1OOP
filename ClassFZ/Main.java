package Lesson1OOP.ClassFZ;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ананас: ");
        Magazine ananas = new Magazine(20, "Большой", 200);
        System.out.println("Price: "+ ananas.getPrice() + "\nDescription: " + ananas.getDescription()+ "\nWeight: " + ananas.getWeight() + "\n");

        System.out.println("Яблоки: ");
        Magazine apple = new Magazine(30, "Много", 1300);
        System.out.println("Price: "+ apple.getPrice() + "\nDescription: " + apple.getDescription()+ "\nWeight: " + apple.getWeight() + "\n");
    }

}
