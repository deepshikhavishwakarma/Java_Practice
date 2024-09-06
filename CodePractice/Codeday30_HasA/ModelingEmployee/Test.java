package CodePractice.Codeday30_HasA.ModelingEmployee;

public class Test {
    public static void main(String[] args) {
        Address ad = new Address("123 Elm Street","Telangana ","Hyderabad",500016);
        Person p1 = new Person("John Doe",ad);
        System.out.println(p1);
    }
}
