import java.util.*;

public class FbMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Facebook app.\n");
        Scanner sc = new Scanner(System.in);
        FacebookAccount fb = null;
        boolean continueRun = true;
        while (continueRun) {
            System.out.println("Features\n1 - Create Account\n2 - Login\n3 - Forget Password.\n4 - Update Details");
            System.out.print("Enter your choice - ");
            int num = sc.nextInt();
            switch (num) {
                case 1: {
                    fb = FacebookAccount.createAccount();
                    System.out.println(fb.getPassword());
                    if (fb != null) {
                        fb.displayDetails();
                    }
                    break;

                }
                case 2: {
                    // FacebookAccount fb1 = FacebookAccount.loginAccount(fb);
                    if (fb == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        fb = FacebookAccount.loginAccount(fb);
                        if (fb != null) {
                            fb.displayDetails();
                        }
                    }
                    // break;
                }
                case 3: {
                    // FacebookAccount fb1 = FacebookAccount.loginAccount(fb);
                    if (fb == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        FacebookAccount.forgetPassword(fb);
                    }
                }
                case 4: {
                    // FacebookAccount fb1 = FacebookAccount.loginAccount(fb);
                    if (fb == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        FacebookAccount.updateDetails(fb);
                    }
                }
            }
            System.out.println("Do you want to continue? (y/n)");
            char ans = sc.next().charAt(0);
            if (ans == 'N' || ans == 'n') {
                continueRun = false;
            }

        }
        sc.close();
    }
}
