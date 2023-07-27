package lesson1oop.level2classdz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Network network = new Network();

        Phone phoneOne = new Phone("+38073123888");
        Phone phoneTwo = new Phone("+380670105858");
        Phone phoneTree = new Phone("+380731111111");

        phoneOne.registerInNetwork(network);
        phoneTwo.registerInNetwork(network);
        phoneTree.registerInNetwork(network);

        phoneOne.outgoingСall(phoneTwo.getNumberPhone());
        phoneOne.outgoingСall(phoneTree.getNumberPhone());
        phoneTwo.outgoingСall(phoneTree.getNumberPhone());




    }
}
