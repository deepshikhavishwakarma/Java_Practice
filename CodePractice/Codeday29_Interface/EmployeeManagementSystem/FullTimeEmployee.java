package CodePractice.Codeday29_Interface.EmployeeManagementSystem;

public class FullTimeEmployee implements Employee{
    private int employeeId;
    private String employeeName;
    private double monthlySalary;
    private double benefits;

    public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
        this.benefits = benefits;
    }

    @Override
    public double calculateSalary(){
        double pkg=0;
        if(monthlySalary<0){
            System.out.println("Monthly salary cannot be negative.");
        } else if (employeeName.isEmpty()) {
            System.out.println("Employee name cannot be empty.");
        }else{
             pkg = monthlySalary*12;
        }
        return pkg;
    }
    @Override
    public void generatePayroll(){
        System.out.println("Employee ID      "+employeeId);
        System.out.println("Employee name    "+employeeName);
        System.out.println("Employee Package "+calculateSalary());
        System.out.println("Benifits         "+(monthlySalary+benefits));
    }

    public static void main(String[] args) {
        FullTimeEmployee fm =new FullTimeEmployee(1234,"Deep",34000,2500);
        fm.generatePayroll();
    }
}
