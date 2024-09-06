package CodePractice.Codeday27_Interface.Messanger;

public class InstagramChatTest {
    public static void main(String[] args) {
    InstagramChat chat=new InstagramChat();

    User user=new InstagramUser("deeepu");//upcasting

    User user2=new User("abcd");

    chat.sendMessage(user2);
    }
}
