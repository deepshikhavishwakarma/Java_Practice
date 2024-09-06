package CodePractice.Codeday15_Methods;

import java.util.*;

public class TestCar {
   public static void main(String[] args) {
      Car c1 = new Car();
      c1.setCarDetails();
   }
}

class Car {
   public String company;
   public String model;
   public int year;
   public String mileage;

   public void setCarDetails() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Company name :  ");
      company = sc.nextLine();
      System.out.print("Enter Model name :  ");
      model = sc.nextLine();
      System.out.print("Enter year name :  ");
      year = sc.nextInt();
      System.out.print("Enter mileage  :  ");
      mileage = sc.next();

      setCarDetails(company, model, year, mileage);
      sc.close();
   }

   public static void setCarDetails(String company, String model, int year, String mileage) {
      System.out.println("Company name \t" + company);
      System.out.println("Car Model \t " + model);
      System.out.println("Year\t\t " + year);
      System.out.println("Mileage \t" + mileage);

   }

}