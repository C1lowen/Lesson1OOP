package lesson1oop.level2classdz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Введите текущий номер: ");
        String numberCurrent = sc.nextLine();
        System.out.print("Введите номер на который звонить: ");
        String numberCall = sc.nextLine();

        Phone phoneOne = new Phone(numberCurrent);
        Phone phoneTwo = new Phone(numberCall);
        phoneOne.saveToNetwork(numberCurrent);
        phoneTwo.saveToNetwork(numberCall);


        phoneOne.outgoingСall(numberCall);


    }
}
