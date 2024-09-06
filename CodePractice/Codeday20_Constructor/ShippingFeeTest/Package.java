package CodePractice.Codeday20_Constructor.ShippingFeeTest;

public class Package {
    private double packageWeight;
    private int shippingDistance;


    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }
    public double getPackageWeight() {
        return packageWeight;
    }
    public void setShippingDistance(int shippingDistance) {
        this.shippingDistance = shippingDistance;
    }
    public int getShippingDistance() {
        return shippingDistance;
    }
    public void displayPackageDetails(){
        System.out.println("Weight = "+packageWeight+"kg");
        System.out.println("Distance = "+shippingDistance+"km");
    }

}
