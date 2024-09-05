package CodePractice.Codeday27_Interface.Messanger;

public class InstagramChat implements Messanger {
    @Override
    public void sendMessage(User user) {
        if(user instanceof InstagramUser)
        {
            InstagramUser iuser=(InstagramUser) user;// down casting
            iuser.sendDirectMessage();
        }
        else{
            System.out.println("user is not an Instagram User");
        }
    }
}
