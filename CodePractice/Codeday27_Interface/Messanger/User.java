package CodePractice.Codeday27_Interface.Messanger;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    User(String name){
        this.name = name;
    }
    public void displayMessage(String msg){
        System.out.println("Hi ..."+name);
    }
}
