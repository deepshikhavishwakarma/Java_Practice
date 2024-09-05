package CodePractice.Codeday26_Constructor;

public abstract class Cake {
    private String shape;
    private String flavour;
    private int qty;
    private static float price=400;

    Cake(){
        this.shape = "round";
        this.flavour="Vanilla";
        this.qty = 1;
    }
    protected Cake(String shape,String flavour,int qty){
//        super();
        this.shape = shape;
        this.flavour = flavour;
        this.qty = qty;
    }
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public static float getPrice() {
        return price;
    }

    public static void setPrice(float price) {
        Cake.price = price;
    }

//    public Cake(String shape, String flavour, int qty) {
//        this.shape = shape;
//    }
    protected void showCake(){

        System.out.println("A "+shape+" "+flavour+" "+qty+"Price "+price*qty);
    }


}
