package Lesson1OOP.ClassFZ2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите Сторону AB: ");
        double ab = sc.nextDouble();
        System.out.print("Введите Сторону AC: ");
        double ac = sc.nextDouble();
        System.out.print("Введите Сторону BC: ");
        double bc = sc.nextDouble();

        Triangle triangleFirst = new Triangle(ab, ac, bc);
        System.out.println(String.format("Площадь: %.2f", triangleFirst.square()));

        System.out.print("Введите Сторону AB: ");
        ab = sc.nextDouble();
        System.out.print("Введите Сторону AC: ");
        ac = sc.nextDouble();
        System.out.print("Введите Сторону BC: ");
        bc = sc.nextDouble();

        Triangle triangleSecond = new Triangle(ab, ac, bc);
        System.out.println(String.format("Площадь: %.2f", triangleSecond.square()));
    }
}
