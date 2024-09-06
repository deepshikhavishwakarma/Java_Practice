package CodePractice.Codeday28_Interface;

interface SubInterface{
   public void m1();
   public void m2();
}
abstract class SubInter implements SubInterface{
    abstract public void m1();
    abstract public void m2();

}
class SubInterClass extends SubInter{
    @Override
    public void m1(){
        System.out.println("M1 Implemented");
    }
    @Override
    public void m2(){
        System.out.println("M2 Implemented");
    }

}

public class SubInterFaceTest {
    public static void main(String[] args) {
        SubInterClass sb = new SubInterClass();
        sb.m1();
        sb.m2();
    }
}

//wrraping tha data and method into single unit is known as Encapsulation.It is a combination of Data hiding and Abstraction
//we can achieve encapsulation by write a private variable and public getter and setter with proper validation
//why private variable - to control the accessibilty of the variables
//why getter and setter -
