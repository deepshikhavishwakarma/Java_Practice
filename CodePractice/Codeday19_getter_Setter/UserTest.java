package CodePractice.Codeday19_getter_Setter;

public class UserTest {
  public static void main(String[] args) {
    User obj = new User();
    obj.setUserName("Bob");
    obj.setPurchaseAmount(600);
    obj.setMembershipStatus("Gold");
    obj.displayDiscount();
   // Discount disc = new Discount();
    Discount discobj = Discount.getDiscount(obj);
    obj.applyDiscount(discobj);

  }
}

class User {
  private String userName;
  private double purchaseAmount;
  private String membershipStatus;

  public void setUserName(String name) {
    this.userName = name;
  }

  public void setPurchaseAmount(double amount) {
    this.purchaseAmount = amount;
  }

  public void setMembershipStatus(String status) {
    this.membershipStatus = status;
  }

  public String getUserName() {
    return userName;
  }

  public double getPurchaseAmount() {
    return purchaseAmount;
  }

  public String getMembershipStatus() {
    return membershipStatus;
  }

  public void displayDiscount() {
    System.out.println("Name    " + userName);
    System.out.println("Purchase Amount    " + purchaseAmount);
    System.out.println("Membership Status    " + membershipStatus);
  }

  public void applyDiscount(Discount discount) {

    System.out.println("Discount " + discount.getDiscountPercentage());
    double finalPrice = purchaseAmount - (purchaseAmount * (discount.getDiscountPercentage() / 100));
    System.out.println("Final Price " + finalPrice);
  }

}

class Discount {
  private double discountPercentage;

  public double getDiscountPercentage() {
    return discountPercentage;
  }

  static Discount getDiscount(User user) {
    Discount discount = new Discount();
    if (user.getMembershipStatus().equals("regular")) {
      if (user.getPurchaseAmount() < 100) {
        discount.discountPercentage = 5;
      } else if (user.getPurchaseAmount() >= 100 && user.getPurchaseAmount() <= 500) {
        discount.discountPercentage = 10;
      } else {
        discount.discountPercentage = 15;
      }
    } else if (user.getMembershipStatus().equals("Silver")) {
      if (user.getPurchaseAmount() < 100) {
        discount.discountPercentage = 10;
      } else if (user.getPurchaseAmount() >= 100 && user.getPurchaseAmount() <= 500) {
        discount.discountPercentage = 15;
      } else {
        discount.discountPercentage = 20;
      }
    } else if (user.getMembershipStatus().equals("Gold")) {
      if (user.getPurchaseAmount() < 100) {
        discount.discountPercentage = 15;
      } else if (user.getPurchaseAmount() >= 100 && user.getPurchaseAmount() <= 500) {
        discount.discountPercentage = 20;
      } else {
        discount.discountPercentage = 25;
      }
    }
    return discount;
  }

}