package CodePractice.Codeday24_Inheritance.SimpleVehicleInheritance;

public class Vehicle {
     String make;
     String model;
     int year;

    public Vehicle() {
        this.make = "TATA";
        this.year = 2020;
        this.model = "cv10z";
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }
    public void displayDetails(){
        System.out.println("Vehicle Make   "+make);
        System.out.println("Vehicle Model  "+model);
        System.out.println("Year           "+year);
    }
}
