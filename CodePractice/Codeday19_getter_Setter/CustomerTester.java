package CodePractice.Codeday19_getter_Setter;

public class CustomerTester {
  public static void main(String[] args) {
    Customer obj = new Customer();
    obj.setCustomerName("Seema");
    obj.setMonthlySpending(80000);
    CardType cd = CardType.getCardTypes(obj);
    System.out.println("Customer name    " + obj.getCustomerName());
    System.out.println("Monthly Spending " + obj.getMonthlySpending());
    System.out.println("Card Type        " + cd.getCardName());
  }
}

class Customer {
  private String customerName;
  private double monthlySpending;

  public void setCustomerName(String name) {
    this.customerName = name;
  }

  public void setMonthlySpending(double spending) {
    this.monthlySpending = spending;
  }

  public String getCustomerName() {
    return customerName;
  }

  public double getMonthlySpending() {
    return monthlySpending;
  }

  public void displayDetails() {
    System.out.println("Name             " + customerName);
    System.out.println("Monthly spending " + monthlySpending);
  }
}

class CardType {
  private String cardName;// null

  public String getCardName() {
    return cardName;
  }

  public static CardType getCardTypes(Customer customer) {
    CardType card = new CardType();
    if (customer.getMonthlySpending() < 10000) {
      card.cardName = "Sliver";
    } else if (customer.getMonthlySpending() >= 10000 && customer.getMonthlySpending() >= 50000) {
      card.cardName = "Gold";
    } else {
      card.cardName = "Platinum";
    }

    return card;
  }
}