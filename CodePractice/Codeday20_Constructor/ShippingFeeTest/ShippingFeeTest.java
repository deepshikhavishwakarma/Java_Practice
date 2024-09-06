package CodePractice.Codeday20_Constructor.ShippingFeeTest;

public class ShippingFeeTest {
    public static void main(String[] args){
        Package pkg = new Package();
        pkg.setPackageWeight(10);
        pkg.setShippingDistance(150);
        pkg.displayPackageDetails();
        ShippingFee sp = ShippingFee.calculateFee(pkg);
        System.out.println("Shipping Fee: "+sp.getFeeAmount());
    }

}
