package CodePractice.Codeday11_Methods;

import java.util.*;

public class Flipkart {
  static void deposit(String product, String companyName, int quantity, double price) {
    double total_amt = 0;
    double tp = price * quantity;
    total_amt = tp - (tp * 0.1);// finding discount here

    bill(product, companyName, quantity, total_amt);
  }

  public static void clothes(String product, String companyName, String type, int quantity) {
    type = type.toLowerCase();
    companyName = companyName.toLowerCase();
    if ((type.equals("tshirt") || type.equals("shoes")) && companyName.equals("nike")
        || companyName.equals("reebok")) {
      buyNowforClothes(product, companyName, type, quantity);
    } else {
      System.out.println("This product is not available now!!");
    }
  }

  static double buyNowforClothes(String product, String companyName, String type, int quantity) {
    double price = 0, total_amt = 0;
    System.out.println("\n---------------------Clothes Or Shoes---------------------\n");
    if (companyName.equals("nike")) {
      if (type.equals("shoes")) {// a
        price = 6000;
        System.out.println("The Cost of Shoes is\t\t\t" + price + "\nDiscount is\t\t\t\t\t\t10%");
        System.out.println("The type of the product\t\t\t" + type.toUpperCase());
        deposit(product, companyName, quantity, price);

      } else if (type.equals("tshirt")) {
        price = 4000;
        System.out.println("The Cost of T-shirt is\t\t\t" + price + "\nDiscount is\t\t\t\t\t\t20%");
        System.out.println("The type of the product\t\t\t" + type.toUpperCase());
        deposit(product, companyName, quantity, price);

      } else {
        System.out.println("This Product of nike brand is not available.");
      }

    } else if (companyName.equals("reebok")) {
      if ((type.equals("shoes")) || (type.equals("Shoes"))) {
        price = 8000;
        System.out.println("The Cost of Reebok Shoes is\t\t" + price + "\nDiscount is\t\t\t\t\t\t10%");
        System.out.println("The type of the product\t\t\t" + type.toUpperCase());
        deposit(product, companyName, quantity, price);

      } else if ((type.equals("tshirt")) || (type.equals("Tshirt"))) {
        price = 4000;
        System.out.println("The Cost of T-shirt is\t\t\t" + price + "\nDiscount is\t\t\t\t\t\t20%");
        System.out.println("The type of the product\t\t\t" + type.toUpperCase());

        deposit(product, companyName, quantity, price);
      } else {
        System.out.println("This Product of nike brand is not available.");
      }
    } else {
      System.out.println("Product is out of stock.");
    }
    return total_amt;
  }

  // phone Apple ..1
  public static void mobiles(String product, String companyName, int quantity) {
    if ((product.equals("phone") || product.equals("mobile")) && companyName.equals("apple")
        || companyName.equals("samsung")) {
      buyNowforMobile(product, companyName, quantity);
    } else {
      System.out.println("This product is not available now!!");
    }
  }

  static double buyNowforMobile(String product, String companyName, int quantity) {
    double price = 0, total_amt = 0;
    System.out.println("\n---------------------Phone---------------------\n");
    if (companyName.equals("apple")) {
      price = 60000;
      System.out.println("The Cost of Iphone is\t\t\t" + price + "\nDiscount is\t\t\t\t\t\t10%");
      deposit(product, companyName, quantity, price);
    } else if (companyName.equals("samsung")) {
      price = 30000;
      System.out.println("\nThe Cost of Samsung mobile is   30000\nDiscount is\t\t\t\t\t\t20%");
      deposit(product, companyName, quantity, price);

    } else {
      System.out.println("Product is out of stock.");
    }
    return total_amt;
  }

  static void bill(String product, String companyName, int quantity, double price) {

    System.out.println("The Product is                  " + product.toUpperCase());
    System.out.println("The Company Name is             " + companyName.toUpperCase());
    System.out.println("Product quantity is             " + quantity);
    System.out.println("price is                        " + "Rs. " + price + " only");
    System.out.println("\n***********************************************\n");
    System.out.println("\nThankyou for Shooping Hope you will like it.!!!\n");
    System.out.println("\n***********************************************\n");

  }

  public static void main(String[] args) {
    System.out.println("Welcome to flipcart World");
    System.out.println("We have two Products---------------------------\n1. Phone\n2. Clothes ");
    System.out.println("\nWhat you want to purchase Today?");
    Scanner sc = new Scanner(System.in);
    String product = sc.next().toLowerCase();

    if (product.equals("phone")) {
      System.out.println("\nWe are selling Phone like Apple and Samsung.\nWhich company Mobile you want to prefer?");
      String companyName = sc.next().toLowerCase();
      System.out.println("\nHow many Quantity you want to purchase?");
      int quantity = sc.nextInt();
      mobiles(product, companyName, quantity);

    } else if (product.equals("clothes")) {

      System.out.println(
          "\nWe are selling Brands like Nike and Reebok.\nWhich brands clothes or shoes you want to purchase?");
      String companyName = sc.next().toLowerCase();
      System.out.println("What you want to Buy Tshirt or Shoes?");
      String type = sc.next();
      System.out.println("\nHow many Quantity you want to purchase?");
      int quantity = sc.nextInt();
      clothes(product, companyName, type, quantity);
    } else {
      System.out.println("This product is not available now!!");
    }
    sc.close();
  }

}