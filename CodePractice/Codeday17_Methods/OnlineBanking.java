package CodePractice.Codeday17_Methods;

import java.util.*;

public class OnlineBanking {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount();
    Scanner sc = new Scanner(System.in);
    
    b1.setDetails("ICICI", "Vijay Kumar", "Ameerpet", "ICICI00012", 324333323333L, 3000.00);

    System.out.println(
        "Enter 1 for balance enquiry\n\nEnter 2 for withdraw amount\n\nEnter 3 for deposit\n\nEnter 4 for display customer details");
    
    int num = sc.nextInt();
    switch (num) {
      case 1: {
        b1.currentBalance();
        break;
      }
      case 2: {
        System.out.println("Enter  Withdrawl Amount");
        double amount = sc.nextDouble();
        b1.withdraw(amount);
        break;
      }
      case 3: {
        System.out.println("Enter  deposit Amount");
        double amount = sc.nextDouble();
        b1.deposit(amount);
        break;
      }
      case 4: {
        System.out.println(b1.displayDetails());
        break;
      }
      default:
        System.out.println("Invalid Number");
    }
    sc.close();
  }
}

  class BankAccount {
    private String bankName;
    private String bankCustomerName;
    private String bankAddress;
    private String bankIFSCCode;
    private long customerAccountNumber;
    private double currentBalance;

  public void setDetails(String bName,String bCustomerName,String bAddress,String bIFSCCode,long customerAccNum,double currBal){
    bankName = bName;
    bankCustomerName = bCustomerName;
    bankAddress = bAddress;
    bankIFSCCode = bIFSCCode;
    customerAccountNumber = customerAccNum;
    currentBalance = currBal;
  }
    public void currentBalance() {
    System.out.println("Your Current Balance is: "+currentBalance);
    }
    public void withdraw(double amount) {
     if(currentBalance <=1000){
       System.out.println("Insufficient Balance");
     }else if((currentBalance-amount)<=1000){
       System.out.println("Maintain MinimumBalance");
     }else{
       currentBalance -= amount;
       System.out.println("Available Balance : Rs."+currentBalance);
     }
    }

    public void deposit(double amount) {
      currentBalance += amount;
      System.out.println("Available Balance : Rs."+currentBalance);
    }

   

    public String displayDetails() {
     System.out.println("Bank Name:       "+bankName);
     System.out.println("Customer Name:   "+bankCustomerName);
     System.out.println("Address:         "+bankAddress);
     System.out.println("IFSC:            "+bankIFSCCode);
     System.out.println("Account Number:  "+customerAccountNumber);
     System.out.println("Balance:         "+currentBalance);
      return "";
    }
}
