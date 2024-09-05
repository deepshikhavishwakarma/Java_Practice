package CodePractice.Codeday30_HasA.ChangeTheDriver;

public class Car {
    private String brand;
    private String model;
    private int year ;
    private Driver driver;

    public Car(String brand, String model, int year, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car brand  =  " + brand +"\nCar model  =  " + model +"\nyear  =  " + year +"\ndriver " + driver;
    }
}
