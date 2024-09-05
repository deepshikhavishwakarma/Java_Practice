package CodePractice.Codeday19_getter_Setter;

public class BookTester {
  public static void main(String[] args) {
    Book obj = new Book();
    obj.setTitle("The 3000 stiches");
    obj.setAuther("Sudha Murthy");
    obj.setIsbn("30djd3");
    obj.setPrice(300);
    obj.setDiscountPercentage(8);
    double finalPrice = obj.getFinalPrice();
    System.out.println("Title       "+obj.getTitle());
    System.out.println("Author      "+obj.getAuther());
    System.out.println("ISBB        "+obj.getIsbn());
    System.out.println("Price       "+obj.getPrice());
    System.out.println("Discount    "+obj.getDiscountPercentage());
    System.out.println("Final Cost  "+finalPrice);
  }
}

class Book {
  private String title;
  private String auther;
  private String isbn;
  private double price;
  private double discountPercentage;

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuther(String auther) {
    this.auther = auther;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setDiscountPercentage(double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public String getTitle() {
    return title;
  }

  public String getAuther() {
    return auther;
  }

  public String getIsbn() {
    return isbn;
  }

  public double getPrice() {
    return price;
  }

  public double getDiscountPercentage() {
    return discountPercentage;
  }
  public double getFinalPrice(){
    double finalPrice = price - (price * discountPercentage / 100);
    return finalPrice;
  }
}