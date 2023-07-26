package lesson1oop.classdz;

public class Magazine {
    private int price;
    private String description;
    private int weight;

    Magazine(int price, String description, int weight){
        this.price = price;
        this.description = description;
        this.weight = weight;
    }

    public Magazine() {}

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Magazine{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
}
