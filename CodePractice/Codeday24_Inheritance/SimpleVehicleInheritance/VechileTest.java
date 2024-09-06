package CodePractice.Codeday24_Inheritance.SimpleVehicleInheritance;

public class VechileTest {
    public static void main(String[] args) {
        System.out.println("Default constructor");
        System.out.println("Car details");
        Car car = new Car();
        car.displayDetails();
        System.out.println();

        System.out.println("Bike Details");
        Bike bike = new Bike();
        bike.displayDetails();

        System.out.println();
        System.out.println();
        System.out.println("Parameterized constructor\n");
        System.out.println("Car details");
        Car car1 = new Car("Creta","z10",2021,0);
        car1.displayDetails();

        System.out.println("\nBike Details");
        Bike bike1 = new Bike("Honda","5qt",0,"Honda 6G");
        bike1.displayDetails();
    }
}
