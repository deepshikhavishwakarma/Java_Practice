package CodePractice.Codeday12_Methods;

public class GenerateSalary {
  public void calculateAndPrintGrossSalary(String name, int id, String address, long adharNumber, String citizenShip,
      double basicSalary) {
    GenerateSalary obj = new GenerateSalary();
    boolean adhar = obj.countAdharDigit(adharNumber);
    if ((citizenShip.equals("Indian")) && (adhar) && (address.equals("hyderabad"))) {
      obj.calculateSalary(name, id, address, adharNumber, citizenShip, basicSalary);
    } else {
      System.out.println("invalid input");
    }
  }

  public boolean countAdharDigit(long adharNumber) {
    int count = 0;
    while (adharNumber != 0) {

      count++;
      adharNumber /= 10;
    }
    if (count == 13) {
      return true;
    } else {
      return false;
    }
  }

  public void calculateSalary(String name, int id, String address, long adharNumber, String citizenShip,
      double basicSalary) {
    double hra = 0, da = 0, grossSalary;
    if (basicSalary <= 10000) {
      hra = basicSalary * 0.20;
      da = basicSalary * 0.80;
      // grossSalary = basicSalary+hra+da;
    } else if (basicSalary <= 20000) {
      hra = basicSalary * 0.25;
      da = basicSalary * 0.90;
    } else {
      hra = basicSalary * 0.30;
      da = basicSalary * 0.95;
    }
    grossSalary = basicSalary + hra + da;

    System.out.println("\nName			" + name + "\nEmp_Id			" + id + "\nAddress		        " + address
        + "\nAdhar		        "
        + adharNumber + "\nCitizenShip		" + citizenShip + "\nBasic Salary		" + basicSalary
        + "\nHRA			" + hra
        + "\nDA			" + da + "\nGross Salary		" + grossSalary);

  }

  public static void main(String[] args) {
    String name = args[0];
    int id = Integer.parseInt(args[1]);
    String address = args[2];
    long adharNumber = Long.parseLong(args[3]);
    String citizenShip = args[4];
    double basicSalary = Double.parseDouble(args[5]);
    GenerateSalary obj = new GenerateSalary();
    obj.calculateAndPrintGrossSalary(name, id, address, adharNumber, citizenShip, basicSalary);
  }
}