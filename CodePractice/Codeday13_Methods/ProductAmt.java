// WAP to input unit price and quantity of a product. Calculate total cost, discount
// 20% if the total purchase is more than Rs20000 otherwise discount is 10%.
// Also find the net price to be paid.

package CodePractice.Codeday13_Methods;

public class ProductAmt {
  static void checkProduct(double product, int quantity) {
    double totCost = product * quantity;
    double discount;
    if (totCost >= 20000) {
      discount = 20;
      totCost = totCost - (totCost * discount / 100);
      dispBill(product, quantity, discount, totCost);
    } else {
      discount = 10;
      totCost = totCost - (totCost * discount / 100);
      dispBill(product, quantity, discount, totCost);
    }
  }

  static void dispBill(double product, int quantity, double discount, double totCost) {
    System.out.println("Product Cost\t\t\t" + product);
    System.out.println("Product Quantity\t\t" + quantity);
    System.out.println("Discount\t\t\t\t" + discount);
    System.out.println("Total Cost\t\t\t\t" + totCost);
  }

  public static void main(String[] args) {
    double product = Double.parseDouble(args[0]);
    int quantity = Integer.parseInt(args[1]);
    checkProduct(product, quantity);
  }
}
