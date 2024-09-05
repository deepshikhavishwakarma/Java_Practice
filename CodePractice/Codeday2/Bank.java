package CodePractice.Codeday2;
import java.util.*;

public class Bank {
    int initial_balance = 2000;

    void deposit(int amt){
        if(amt > 0){
            initial_balance += amt;
            System.out.println("Deposited: " + amt);
            System.out.println("New balance: " + initial_balance);
        } else {
            System.out.println("Invalid amount to deposit");
        }
    }

    void withdraw(int amt){
        if(amt > 0 && amt <= initial_balance){
            initial_balance -= amt;
            System.out.println("Withdrawn: " + amt);
            System.out.println("New balance: " + initial_balance);
        } else if(amt <= 0){
            System.out.println("Invalid amount to withdraw");
        } else {
            System.out.println("Insufficient funds to withdraw");
        }
    }

    public static void main(String[] args) {
        Bank sc = new Bank();
        Scanner nc = new Scanner(System.in);
        System.out.println("Enter amount to deposit:");
        int depositAmount = nc.nextInt();
        sc.deposit(depositAmount);
        System.out.println("Enter amount to withdraw:");
        int withdrawAmount = nc.nextInt();
        sc.withdraw(withdrawAmount);
        nc.close();
    }
}
