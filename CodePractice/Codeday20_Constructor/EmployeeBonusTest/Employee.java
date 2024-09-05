package CodePractice.Codeday20_Constructor.EmployeeBonusTest;

public class Employee {
    private String employeeName;
    private double basicSalary;
    private int performanceRating;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }



    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }



    public void displayEmployeeDetails(){
        System.out.println("Employee name      "+employeeName);
        System.out.println("Basic Salary       "+basicSalary);
        System.out.println("Performance Rating "+performanceRating);
    }

}
