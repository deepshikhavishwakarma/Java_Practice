package CodePractice.Codeday7_Methods_NoReturnType;

public class StudentDetails {

    public static void printStudentDetails(String name, long rollNo, float hindi, float eng, float math) {

        float tot, avg;
        tot = hindi + eng + math;
        avg = tot / 3;
        System.out.println("\nName : " + name + "\n" + "Roll No :" + rollNo);
        System.out.println("-------------Marks Obtained-------------\n");
        System.out.println("Hindi : " + hindi + "\n" + "English : " + eng + "\nMaths : " + math);
        System.out.println("---------------Result------------------\n");
        System.out.println("Total Marks : " + tot + "\n" + "Average : " + avg);
    }

    public static void main(String[] args) {
        String name = args[0];
        long rollNo = Long.parseLong(args[1]);
        float hindi = Float.parseFloat(args[2]);
        float eng = Float.parseFloat(args[3]);
        float math = Float.parseFloat(args[4]);
        printStudentDetails(name, rollNo, hindi, eng, math);

    }

}