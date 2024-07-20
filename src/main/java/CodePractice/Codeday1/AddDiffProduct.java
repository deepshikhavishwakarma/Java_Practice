public class AddDiffProduct{
  void addition(int num1,int num2){
    int sum = num1+num2;
    System.out.println("Sum of two numbers is "+sum);
  }
  void difference(int num1,int num2){
    int diff = num1-num2;
    System.out.println("Difference of two numbers is "+diff);
  }
  static void product(int num1,int num2){    
    int pro = num1*num2;
    System.out.println("Product of two numbers is "+pro);
  }
    public static void main(String[] args){
      AddDiffProduct dp = new AddDiffProduct();
      dp.addition(345,8976);
      dp.difference(763458,787);
      AddDiffProduct.product(32,78);
     
    }
}

//static methods calls using class name
//non static methods calls using class object
//variables store in heap memory
//methods store in stack memory
//class store in heap memory