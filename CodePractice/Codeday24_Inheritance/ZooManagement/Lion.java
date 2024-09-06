package CodePractice.Codeday24_Inheritance.ZooManagement;

public class Lion extends Animal{
    private int maneLength;
    Lion(String name,int age,int maneLength){
        super(name, age);
        if(maneLength>0){
            this.maneLength = maneLength;
        }else{
            System.out.println("Invalid value");
        }
    }
    @Override
    public void makeSound(){
        System.out.println("The lion roars loudly");
    }

    public void displayManeLength(){

        System.out.println("ManeLength  "+maneLength);
    }
    public void displayInfo(){
    super.displayInfo();
        //System.out.println("Name  "+name+"\nAge   "+age);
    }
}