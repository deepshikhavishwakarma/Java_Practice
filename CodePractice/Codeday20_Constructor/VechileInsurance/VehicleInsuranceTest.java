package CodePractice.Codeday20_Constructor.VechileInsurance;
class Vehicle{
    private String vehicleType;
    private int vehicleAge;

    public void setVehicleType(String type){
        this.vehicleType = type;
    }
    public void setVehicleAge(int age){
        this.vehicleAge = age;
    }
    public String getVehicleType(){
        return vehicleType;
    }
    public int getVehicleAge(){
        return vehicleAge;
    }
    public void displayDetails(){
        System.out.println("Vehicle type: "+vehicleType);
        System.out.println("Vehicle type: "+vehicleAge);
    }
}
class InsurancePremium{
   private double premiumAmount;
    public void setPremiumAmount(double premiumAmount){
        this.premiumAmount = premiumAmount;
    }
   public double getPremiumAmount(){
       return premiumAmount;
   }
   public static InsurancePremium calculatePremium(Vehicle vehicle) {
       InsurancePremium ip = new InsurancePremium();
       if(vehicle.getVehicleType().equals("Car")){
           if (vehicle.getVehicleAge() < 5) {
               ip.setPremiumAmount(5);
           }else if (vehicle.getVehicleAge() >= 5 && vehicle.getVehicleAge() <= 10) {
               ip.setPremiumAmount(7);
           }else{
               ip.setPremiumAmount(10);
           }
       }else if(vehicle.getVehicleType().equals("Motorcycle")){
           if (vehicle.getVehicleAge() < 3) {
               ip.setPremiumAmount(3);
           }else if (vehicle.getVehicleAge() >= 3 && vehicle.getVehicleAge() <= 8) {
               ip.setPremiumAmount(5);
           }else{
               ip.setPremiumAmount(8);
           }
       }else if(vehicle.getVehicleType().equals("Truck")){
           if (vehicle.getVehicleAge() < 5) {
               ip.setPremiumAmount(6);
           }else if (vehicle.getVehicleAge() >= 5 && vehicle.getVehicleAge() <= 10) {
               ip.setPremiumAmount(8);
           }else{
               ip.setPremiumAmount(12);
           }
       }else {
           System.out.printf("Invalid Vehicle Type");
       }
       return ip;
   }
}
public class VehicleInsuranceTest {
    public static void main(String[] args) {
        Vehicle vh = new Vehicle();

        vh.setVehicleType("Car");
        vh.setVehicleAge(6);
        vh.displayDetails();
        System.out.println(InsurancePremium.calculatePremium(vh));
        InsurancePremium ip =  InsurancePremium.calculatePremium(vh);
        System.out.println("Premium ="+ip.getPremiumAmount()+"% of vehicle value");

    }

}
