package CodePractice.Codeday22_Inheritance;


class Student{
    int studentId;
    String name;
    double examFee;

    public Student(int studentId, String name, double examFee) {
        this.studentId = studentId;
        this.name = name;
        this.examFee = examFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", examFee=" + examFee +
                '}';
    }
    public String displayDetails(double payFee){
        return "";
    }
    public double payFee(double amount) {
        double remainingAmount = amount - examFee;
        return remainingAmount;
    }
}
class DayScholar extends Student{
    double transportFee;

    public DayScholar(int studentId, String name, double examFee, double transportFee) {
        super(studentId, name, examFee);
        this.transportFee = transportFee;
    }
    public String displayDetails(){
        return "DayScholar{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", examFee= " + examFee +
                ",TransportFee= " +transportFee+
                '}';
    }
    public double payFee(double amount) {
        double totalFee = examFee + transportFee;
        double remainingAmount = -amount + totalFee;
        return remainingAmount;
    }
}
class Hosteller extends Student{
    double hostelFee;

    public Hosteller(int studentId, String name, double examFee, double hostelFee) {
        super(studentId, name, examFee);
        this.hostelFee = hostelFee;
    }

    public String displayDetails(){
        return "Hosteller{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", examFee=" + examFee +
                ", HostelFee=" + hostelFee +
                '}';
    }
    @Override
    public double payFee(double amount) {
        double totalFee = examFee + hostelFee;
        double remainingAmount = -amount + totalFee;
        return remainingAmount;
    }
}
public class TesterProg3 {
    public static void main(String[] args) {
      Student s1 = new Student(1,"John Smith",25000);
        System.out.println(s1);
        DayScholar d1 =new DayScholar(2,"Brian Lara",25000,5000);
        System.out.println(d1.displayDetails());
        double remainingAmt = d1.payFee(18000.0);
        System.out.println("Remaining amount to pay is: " +remainingAmt);
        Hosteller h1 = new Hosteller(3,"Virat Kohli",25000,8000);
        remainingAmt = h1.payFee(33000);
        if(remainingAmt==0){
            System.out.println("All Fees are Clear.");
        }else{
        System.out.println("Remaining fee is: "+ remainingAmt);
    }
    }
}
