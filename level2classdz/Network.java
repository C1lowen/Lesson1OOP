package lesson1oop.level2classdz;

public class Network {
    private static String[] numbers = new String[100];

    Network() {
    }

    public boolean registerNetwork(String numberPhone) {

        if (checkNumber(numberPhone)){
            System.out.println("Номер "+ numberPhone +" уже зарегестрирован!");
            return true;
        }

        boolean result = saveToNetwork(numberPhone);

        return result;
    }

    public boolean checkNumber(String numberPhone){
        for (int i = 0; i < numbers.length; i++) {
            if(numberPhone == numbers[i]){
             return true;
            }
        }
        return false;
    }

    private boolean saveToNetwork(String numberPhone){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == null){
                numbers[i] = numberPhone;
                System.out.println("Номер "+ numberPhone + " зарегестрирован, можете использовать!");
                return true;
            }
        }
        return false;
    }

}
