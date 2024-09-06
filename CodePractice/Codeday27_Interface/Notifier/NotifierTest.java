package CodePractice.Codeday27_Interface.Notifier;

public class NotifierTest {
    public static void main(String[] args) {
   User user = new User("Deep","abc@gmail.com");
   EmailNotifier em = new EmailNotifier();
  em.sendEmail(user);
    }
}
