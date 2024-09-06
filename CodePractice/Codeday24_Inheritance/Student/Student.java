package CodePractice.Codeday24_Inheritance.Student;

public class Student {
    protected String name;
    protected int rollNumber;


    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void displayDetails(){
        System.out.println("Name             :"+name);
        System.out.println("Roll Number      :"+rollNumber);
    }
    public double calculatePercentage(){
//        double percentage=0.0;
        return 0.0;
    }
}
