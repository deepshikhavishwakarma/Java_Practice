package CodePractice.Codeday24_Inheritance.Student;

public class ScienceStudent extends Student{
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;

    public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
        super(name, rollNumber);
        if(physicsMarks >=0 && chemistryMarks >=0 && mathMarks >=0){
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathMarks = mathMarks;
        }else{
            System.out.println("Error Invalid Input");
        }
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Physics Marks    :"+physicsMarks);
        System.out.println("Chemistry Marks  :"+chemistryMarks);
        System.out.println("Maths Marks      :"+mathMarks);
        System.out.println("Percentage       :"+calculatePercentage());
    }
    @Override
    public double calculatePercentage(){
        double percentage;
        percentage = (double) (physicsMarks + chemistryMarks + mathMarks) /3;
        return percentage;
    }

    @Override
    public String toString() {
        return "ScienceStudent{" +
                "physicsMarks=" + physicsMarks +
                ", chemistryMarks=" + chemistryMarks +
                ", mathMarks=" + mathMarks +
                '}';
    }



}
