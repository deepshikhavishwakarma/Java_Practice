package CodePractice.Codeday24_Inheritance.ZooManagement;

public class Elephant extends Animal{
    private float tuskLength;
    Elephant(String name,int age,float tuskLength){
        super(name,age);
        this.tuskLength =tuskLength;
    }
    @Override
    public void makeSound(){

        System.out.println("The elephant trumpets.");
    }
    public void displayInfo(String name,int age){
        super.displayInfo();
       // System.out.println("Name  "+name+"\nAge   "+age);
    }
    public void displayTuskLength(){

        System.out.println("Tusk Length  "+tuskLength);
    }

}
