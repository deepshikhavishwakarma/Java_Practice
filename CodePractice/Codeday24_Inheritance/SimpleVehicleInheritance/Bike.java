package CodePractice.Codeday24_Inheritance.SimpleVehicleInheritance;

public class Bike extends Vehicle{
    String type;

    public Bike() {
        super();
        this.type = "Pulsur";
    }

    public Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }


    public void displayDetails(){
        if(this.year>0) {
            System.out.println("Vehicle Make   " + make);
            System.out.println("Vehicle Model  " + model);
            System.out.println("Year           " + year);
            System.out.println("Bike type      " + type);
        }else {
            System.out.println("Error Invalid Input");
        }
    }

}
