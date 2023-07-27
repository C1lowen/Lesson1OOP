package lesson1oop.level2classdz;

public class Phone {
    private String numberPhone;

    private Network network;

    Phone(String numberPhone){
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }



    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }


    public void registerInNetwork(Network nwk) {
        this.setNetwork(nwk);
        nwk.saveToNetwork(this);
    }

    public void outgoingСall(String numberPhoneCall){
       if(network != null && network.searchPhone(numberPhone) != null) {
            if (network.searchPhone(numberPhoneCall) != null) {
                Phone outcome = network.searchPhone(numberPhoneCall);
                outcome.incomingCall(numberPhone);
            }else{
                System.out.println("Номер на который вы хотите позвонить не зарегистрирован в сети!");
            }
        }else{
           System.out.println("Ваш номер не зарегистрирован в сети!");
       }
    }

    public void incomingCall(String numberPhoneCall){
        System.out.println(numberPhoneCall + " вам звонит номер: " + this.numberPhone);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "numberPhone='" + numberPhone + '\'' +
                ", network=" + network +
                '}';
    }
}
