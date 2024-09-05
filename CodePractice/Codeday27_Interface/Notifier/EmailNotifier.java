package CodePractice.Codeday27_Interface.Notifier;

public class EmailNotifier implements Notifier{
    @Override
    public  void notifyUsers(String... str){
        System.out.println("Sending email to"+str[0]+" , i.e. "+str[1]);
    }
    public void sendEmail(User user){
        notifyUsers(user.getName(),user.getEmail());

    }
}
