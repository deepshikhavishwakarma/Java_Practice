package CodePractice.Codeday19_getter_Setter;

public class CarRentalCalculator {
  public static void main(String[] args) {
    CarRental obj = new CarRental();
    obj.setCarModel("Toyota");
    obj.setDailyRate(50.0);
    obj.setRentalDays(9);
    double totCost = obj.calculateTotalCose();
    System.out.println("Car Model        " + obj.getCarModel());
    System.out.println("Daily Rate       " + obj.getDailyRate());
    System.out.println("Rental Days      " + obj.getRentalDays());
    System.out.println("Total Cost      " + totCost);

  }
}

class CarRental {
  private String carModel;
  private int rentalDays;
  private double dailyRate;

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public void setDailyRate(double dailyRate) {
    this.dailyRate = dailyRate;
  }

  public void setRentalDays(int rentalDays) {
    this.rentalDays = rentalDays;
  }

  public String getCarModel() {
    return carModel;
  }

  public double getDailyRate() {
    return dailyRate;
  }

  public int getRentalDays() {
    return rentalDays;
  }

  public double calculateTotalCose() {
    double totalCost = rentalDays * dailyRate;
    System.out.println("---------" + totalCost);
    if (rentalDays > 7) {
      return (totalCost * 0.1);
    } else {
      return totalCost;
    }
  }
}