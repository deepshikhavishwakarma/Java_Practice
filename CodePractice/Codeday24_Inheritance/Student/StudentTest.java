package CodePractice.Codeday24_Inheritance.Student;

public class StudentTest {
    public static void main(String[] args) {
        ScienceStudent ss = new ScienceStudent("Sudha",114,89,78,90);
        ss.displayDetails();
        ArtsStudent as = new ArtsStudent("Nidhi",115,87,78,81);
        as.displayDetails();


        String s= new String("asddf");
        System.out.println(ss);


        System.out.println(s.toString());

    }
}
