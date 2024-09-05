package CodePractice.Codeday20_Constructor.ShippingFeeTest;

public class ShippingFee {

    private double feeAmount;
//    public void setFeeAmount(double feeAmount) {
//        this.feeAmount = feeAmount;
//    }
    public double getFeeAmount() {
        return feeAmount;
    }
    public static ShippingFee calculateFee(Package pkg){
        ShippingFee sf = new ShippingFee();
        if(pkg.getPackageWeight() <= 5) {
            if (pkg.getShippingDistance() <= 100) {
                sf.feeAmount = 5;
            } else {
                sf.feeAmount = 10;
            }
        }else if(pkg.getPackageWeight()>5 && pkg.getPackageWeight()<=20){
            if (pkg.getShippingDistance() <= 100) {
                sf.feeAmount = 10;
            } else {
                sf.feeAmount = 20;
            }
        }else{
            if (pkg.getShippingDistance() <= 100) {
                sf.feeAmount = 20;
            } else {
                sf.feeAmount = 40;
            }
        }

        return sf;
    }



}
