package CodePractice.Codeday30_HasA.CarHasAEngine;

public class CarHasAEngine {
    public static void main(String[] args) {
        Engine e1 = new Engine("Camry");
        Car c1 = new Car("Toyota","Camry",e1);
        System.out.println(c1);
    }
}
