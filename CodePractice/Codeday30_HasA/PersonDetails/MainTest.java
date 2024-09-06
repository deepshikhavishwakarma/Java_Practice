package CodePractice.Codeday30_HasA.PersonDetails;

public class MainTest {
    public static void main(String[] args) {
    Address a1 = new Address("Near Ameerpet","Telangana","Hyderabad",500016l);
    Person p1 = new Person("Deepshikha ",24,a1);//passing ref of Address as a input
        System.out.println(p1);
    }
}
