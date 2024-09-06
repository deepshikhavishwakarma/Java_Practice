package CodePractice.Codeday19_getter_Setter;

public class Main {
  public static void main(String[] args) {
    HelloWorld obj = new HelloWorld(2, 3);
    obj.a = 20;
    obj.b = 30;
    System.out.println(obj.a);
    System.out.println(obj.b);
  }
}

class HelloWorld {

  int a;
  int b;

  HelloWorld(int a, int b) {
    this.a = a;
    this.b = b;
  }
}
