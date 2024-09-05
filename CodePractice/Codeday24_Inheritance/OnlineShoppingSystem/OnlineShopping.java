package CodePractice.Codeday24_Inheritance.OnlineShoppingSystem;

 class Product {
    protected String name;
    protected double price;

    public Product(String name,double price) {
        this.name = name;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Electronics Details:");
        System.out.println("Product Name   "+name);
        System.out.println("Price  $"+price);
    }
    public double calculateTotalCost(int quantity){
     return quantity*price;
    }
}
class Electronics extends Product{
    private String brand;

     Electronics(String name, double price,String brand) {
        super(name, price);
        this.brand = brand;
    }
    @Override
    public void displayInfo(){
         //Product p1 = new Product();
        System.out.println("Electronics Details:");
        System.out.println("Name   "+name);
        System.out.println("Price  "+price);
        System.out.println("Brand  "+brand);
       // System.out.println("Total Cost for "+p1.calculateTotalCost());
    }

}
class Clothing extends Product{
    private String size;
    Clothing(String name, double price,String size) {
        super(name, price);
        this.size = size;
    }
    @Override
    public void displayInfo(){
        System.out.println("Clothing Details:");
        System.out.println("Name   "+name);
        System.out.println("Price  $"+price);

        System.out.println("Size  "+size);

    }
}
public class OnlineShopping{
    public static void main(String[] args){
        Electronics e1 = new Electronics("Laptop",1200,"Dell");

        e1.displayInfo();
        System.out.println(e1.calculateTotalCost(3));
        System.out.println();
        Clothing c1 = new Clothing("T-shirt",320,"Medium");

        c1.displayInfo();
        System.out.println("Total Cost for "+ c1.calculateTotalCost(2));
    }
}

