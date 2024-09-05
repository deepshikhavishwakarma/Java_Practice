package CodePractice.Codeday27_Interface.Messanger;

public class InstagramUser extends User{
    InstagramUser(String name){
        super(name);
    }
    public void sendDirectMessage(){
        System.out.println("welcome to insta  "+getName());
    }
}
