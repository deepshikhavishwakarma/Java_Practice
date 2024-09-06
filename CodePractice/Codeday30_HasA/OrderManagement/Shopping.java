package CodePractice.Codeday30_HasA.OrderManagement;

public class Shopping {
    public static void main(String[] args) {
        Order or = new Order("Z123","T-shirt");
        Customer obj = new Customer("Deepshikha","xyz@gmail.com",or);
        System.out.println(obj);
    }
}
