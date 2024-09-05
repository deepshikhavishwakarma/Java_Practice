package CodePractice.Codeday24_Inheritance.SimpleVehicleInheritance;

class Car extends Vehicle{
int numberOfDoors;

    public Car() {
       // super();
        this.numberOfDoors = 4;
    }

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayDetails(){
        if(this.numberOfDoors>0){
        System.out.println("Vehicle Make   "+make);
        System.out.println("Vehicle Model  "+model);
        System.out.println("Year           "+year);
        System.out.println("Number of doors "+numberOfDoors);
        }else{
            System.out.println("Error Invalid Input");
        }
    }
}
