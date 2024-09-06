package CodePractice.Codeday24_Inheritance.Student;

public class ArtsStudent extends Student{
    private int historyMarks;
    private int geographyMarks;
    private int englishMarks;

    public ArtsStudent(String name,int rollNumber,int historyMarks, int geographyMarks, int englishMarks) {
        super(name, rollNumber);
        this.historyMarks = historyMarks;
        this.geographyMarks = geographyMarks;
        this.englishMarks = englishMarks;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("History Marks    :"+historyMarks);
        System.out.println("Geography Marks  :"+geographyMarks);
        System.out.println("English Marks    :"+englishMarks);
        System.out.println("Percentage       :"+calculatePercentage());
    }
    @Override
    public double calculatePercentage(){
        double percentage;
        percentage = (double) (englishMarks + geographyMarks + historyMarks) /3;
        return percentage;
    }
}
