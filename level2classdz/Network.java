package lesson1oop.level2classdz;

import java.util.Arrays;

public class Network {
    private Phone[] numbers = new Phone[10];


    public Network(Phone[] numbers) {
        this.numbers = numbers;
    }

    public Network() {
    }

    public Phone[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Phone[] numbers) {
        this.numbers = numbers;
    }

    public void saveToNetwork(Phone phone) {
        if (this.searchPhone(phone.getNumberPhone()) == null) {
            for (int i = 0; i < numbers.length; i++) {
                if (this.numbers[i] == null) {
                    this.numbers[i] = phone;
                    break;
                }
            }
        }

    }

    public Phone searchPhone(String number) {
        for (int i = 0; i < numbers.length; i++) {
            if (this.numbers[i] != null && this.numbers[i].getNumberPhone().equals(number)) {
                return this.numbers[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Network{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
