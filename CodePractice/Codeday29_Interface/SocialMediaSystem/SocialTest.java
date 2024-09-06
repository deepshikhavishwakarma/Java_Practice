package CodePractice.Codeday29_Interface.SocialMediaSystem;

public class SocialTest {
    String id;

    public SocialTest(String id) {
        this.id = id;
    }
    public  void  m1(){
        System.out.println("m1....");
    }



    public static void main(String[] args) {



//        String str="";
//        System.out.println(str.length());
//        String s=null;
//        System.out.println(s.length());


        SocialTest t=null;
//        System.out.println(t.id);//exception
       String s=t.id;
        System.out.println(s.length());
    }
}
