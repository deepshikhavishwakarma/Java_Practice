import java.util.Random;
import java.util.Scanner;

public class FacebookAccount {
    static Scanner sc = new Scanner(System.in);
    private String uid;
    private String pwd;
    private String name;
    private String mail;
    private int age;
    private long mobileNo;
    private char gender;

    // FacebookAccount() {

    // }

    // FacebookAccount(String uid, String pwd, String name, String mail, int age,
    // long mobileNo, char gender) {
    // this.uid = uid;
    // this.pwd = pwd;
    // this.name = name;
    // this.mail = mail;
    // this.age = age;
    // this.mobileNo = mobileNo;
    // this.gender = gender;
    // }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setPassword(String pwd) {
        this.pwd = pwd;
    }

    public String getPassword() {
        return pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public static FacebookAccount createAccount() {
        FacebookAccount fb = new FacebookAccount();

        boolean pass, gmail, ag, mob;
        System.out.println("-------------------------------------------");
        System.out.println("----------CREATE FACEBOOK ACCOUNT----------");
        System.out.println("-------------------------------------------\n");

        System.out.println("Enter UserId");
        String uid = sc.next();
        fb.setUid(uid);
        System.out.println(
                "Enter Password\nPassword should be 8 to 15 characters and must include at least 1 special character, digit, uppercase letter, and lowercase letter.");
        String pwd = sc.next();
        fb.setPassword(pwd);
        pass = checkPassword(pwd);

        System.out.println("Enter Name");
        String name = sc.next();
        fb.setName(name);

        System.out.println("Enter Mail");
        String mail = sc.next();
        fb.setMail(mail);

        gmail = checkGmail(mail);

        System.out.println("Enter Age");
        int age = sc.nextInt();
        fb.setAge(age);

        if (age > 18) {
            System.out.println("Valid Age");
            ag = true;
        } else {
            System.out.println("Invalid Age. You must be over 18.");
            ag = false;
        }

        System.out.println("Enter Mobile No");
        long mobileNo = sc.nextLong();
        fb.setMobileNo(mobileNo);

        mob = checkMobileNumber(mobileNo);
        sc.nextLine();

        System.out.println("Enter Gender (M/F)");
        char gender = sc.nextLine().charAt(0);
        fb.setGender(gender);

        if (pass && gmail && ag && mob) {
            int verifyNum = verifyMail();
            System.out.println("Verification Code: " + verifyNum);
            System.out.println("Enter Verification Code");
            int verNum = sc.nextInt();
            if (verNum == verifyNum) {
                System.out.println("Account Successfully Created.");
                return fb;
            } else {
                System.out.println("Incorrect Verification Code.");
                return null;
            }
        } else {
            System.out.println("Please enter valid information.");
            return null;
        }
    }

    public void displayDetails() {
        System.out.println("User ID: " + getUid());
        System.out.println("Password: " + getPassword());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getMail());
        System.out.println("Age: " + getAge());
        System.out.println("Mobile No: " + getMobileNo());
        System.out.println("Gender: " + getGender());
    }

    public static FacebookAccount loginAccount(FacebookAccount fb) {
        System.out.println("-------------------------------------------");
        System.out.println("----------LOGIN FACEBOOK ACCOUNT----------");
        System.out.println("-------------------------------------------");

        System.out.println(fb.getUid());
        System.out.println(fb.getPassword());
        System.out.println("Enter UserId");
        String uid = sc.next();
        if (uid.equalsIgnoreCase(fb.getUid())) {
            System.out.println("Enter Password");
            String pwd = sc.next();
            if (pwd.equals(fb.getPassword())) {
                System.out.println("Login Successfully");
                return fb;
            } else {
                System.out.println("Wrong Password.");
                return null;
            }

        } else {
            System.out.println("Invalid UserId");
            return null;
        }

    }

    public static FacebookAccount forgetPassword(FacebookAccount fb) {
        System.out.println("-------------------------------------------");
        System.out.println("--------------FORGET PASSWORD--------------");
        System.out.println("-------------------------------------------");
        System.out.println("Your current password is: " + fb.getPassword());
        System.out.println("Enter UserId:");
        String uid = sc.next();
        if (uid.equals(fb.getUid())) {
            System.out.println("Enter new password:");
            String newPassword = sc.next();
            if (fb.getPassword().equals(newPassword)) {
                System.out.println("\nNew password should not be same as old password");
            } else {

                if (checkPassword(newPassword)) {
                    fb.setPassword(newPassword);
                    System.out.println("\nPassword successfully reset.");
                }
            }
        } else {
            System.out.println("Invalid User Id");
        }

        return fb;
    }

    public static FacebookAccount updateDetails(FacebookAccount fb) {
        System.out.println("-------------------------------------------");
        System.out.println("--------------UPDATE DETAILS--------------");
        System.out.println("-------------------------------------------\n\n");
        System.out.println("Your current Mobile No is: " + fb.getMobileNo());
        System.out.println("Your current Mail ID is: " + fb.getMail());

        System.out.println("Enter mail/Mobile No");
        System.out.println("\n1 - Select Mail Id\n2 - Select Mobile No");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter Mail Id");
                String gmail = sc.next();
                if (gmail.equals(fb.getMail())) {
                    System.out.println("Updated fields Successfully");
                } else {
                    System.out.println("Account Not Found.");
                }

                break;

            default:
                System.out.println("Enter Mobile No");
                long contact = sc.nextLong();
                if (contact == fb.getMobileNo()) {
                    System.out.println("Update remaining fields");
                } else {
                    System.out.println("Account Not Found.");
                }
                break;
        }

        return fb;
    }

    public static boolean checkMobileNumber(long mobileNo) {
        String mobileStr = String.valueOf(mobileNo);
        if (mobileStr.length() == 10) {
            System.out.println("Valid mobile number.");
            return true;
        } else {
            System.err.println("Invalid mobile number.");
            return false;
        }
    }

    public static boolean checkGmail(String mail) {
        if (mail.endsWith("@gmail.com")) {
            System.out.println("Valid email address.");
            return true;
        } else {
            System.err.println("Invalid email address. Must end with '@gmail.com'.");
            return false;
        }
    }

    public static boolean checkPassword(String pwd) {
        if (pwd.length() < 7 || pwd.length() > 15) {
            System.out.println("Password length should be between 8 and 15 characters.");
            return false;
        }
        boolean upper = false, lower = false, digit = false, special = false;
        for (char ch : pwd.toCharArray()) {
            if (Character.isUpperCase(ch))
                upper = true;
            else if (Character.isLowerCase(ch))
                lower = true;
            else if (Character.isDigit(ch))
                digit = true;
            else
                special = true;
        }
        if (upper && lower && digit && special) {
            return true;
        } else {
            if (!upper)
                System.out.println("Missing uppercase character in password.");
            if (!lower)
                System.out.println("Missing lowercase character in password.");
            if (!digit)
                System.out.println("Missing digit in password.");
            if (!special)
                System.out.println("Missing special character in password.");
            return false;
        }
    }

    public static int verifyMail() {
        Random rc = new Random();
        return rc.nextInt(9000) + 1000;
    }
}