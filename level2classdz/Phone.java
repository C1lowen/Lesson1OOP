package lesson1oop.level2classdz;

public class Phone {
    private String numberPhone;
    private Network network = new Network();

    Phone(String numberPhone){
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void saveToNetwork(String phone){
        network.registerNetwork(phone);
    }

    public void outgoingСall(String numberPhone){
       if(!(network.checkNumber(this.numberPhone))){
           System.out.println("Номер " + this.numberPhone + " не прошел регестрацию;");
           return;
        }
        if(!(network.checkNumber(numberPhone))){
            System.out.println("Номер " + numberPhone + " не прошел регестрацию;");
            return;
        }

        incomingCall(numberPhone);
    }

    public void incomingCall(String numberPhone){
        System.out.println(numberPhone + " вам звонит номер: " + this.numberPhone);
    }
}
