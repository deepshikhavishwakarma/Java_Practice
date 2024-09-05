package CodePractice.Codeday30_HasA.ChangeTheDriver;

public class MainTest {
    public static void main(String[] args) {
        Driver driver1 = new Driver("John", 30);
        Car car1 = new Car("Hyundai", "Creta", 2020, driver1);
        Driver driver2 = new Driver("Logan", 35);
        System.out.println("Original Car Details:");
        System.out.println(car1);
        System.out.println("\nCopied Car Details:");
        System.out.println(car1);
        System.out.println("\nOriginal Car Details after Changing Driver:");
        Car car2 = new Car("Hyundai", "Creta", 2020, driver2);
        System.out.println(car2);
        System.out.println("\nCopied Car Details after Changing Driver in Original Car:");
        System.out.println(car1);


    }
}
