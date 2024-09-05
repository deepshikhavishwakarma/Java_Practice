package CodePractice.Codeday26_Constructor;

public class Zomatao {
    public static void main(String[] args) {
        OrderCake zomato = new OrderCake();
zomato.showCake();

OrderCake zomato1 = new OrderCake("Vanilla","Square",2);
        zomato1.showCake();
OrderCake zomato2 = new OrderCake("Buttur Scotch","Round",1,"Birthday Cake");
        zomato2.showCake();
    }
}
