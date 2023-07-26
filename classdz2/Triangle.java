package lesson1oop.classdz2;

public class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    Triangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    Triangle() {}

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double square(){
        if(!(firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide)){
            System.out.println("Треугольник неправильный");
            return 0;
        }

        double p = (firstSide + secondSide + thirdSide)/2;
        double s = (Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide)));

        return s;
    }
}
