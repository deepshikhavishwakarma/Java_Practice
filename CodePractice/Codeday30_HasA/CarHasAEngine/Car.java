package CodePractice.Codeday30_HasA.CarHasAEngine;

public class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {

        this.make = make;
        if(model.isEmpty() || model.contains("-") || model.startsWith("0")){
            System.out.println("Invalid Model");
        }else{
            this.model = model;
        }

        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

}
