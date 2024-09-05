package CodePractice.Codeday16_Methods;


public class Test {
  public static void main(String[] args) {
    A obj1 = new A();
    A obj2 = obj1;
    A obj3 = new A();

    obj1.value = 20;
    obj2.value = 30;
    obj3.value = 40;

    obj1 = obj3;
    obj1.value = 50;

    System.out.println("obj1.value: " + obj1.value);
    System.out.println("obj2.value: " + obj2.value);
    System.out.println("obj3.value: " + obj3.value);
  }
}

class A {
  int value;
}
