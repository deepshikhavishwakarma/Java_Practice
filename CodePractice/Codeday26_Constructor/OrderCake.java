package CodePractice.Codeday26_Constructor;

public class OrderCake extends Cake{


    private String message;
    public OrderCake(String message) {
        this.message = message;
    }
    protected String getmessage() {
        return "Happy Birthday";
    }
    OrderCake(){
        super();
    }
    public OrderCake(String shape,String flavour,int qty){
        super(shape,flavour,qty);
    }
    public OrderCake(String shape,String flavour,int qty,String message){
        super(shape,flavour,qty);
        this.message = message;
    }

    @Override
    public void showCake(){
        if(message==null){
            super.showCake();
        }else{
            System.out.println("A Round "+super.getFlavour()+" Cake is "+super.getShape()+"and have quantity is "+super.getQty()+"kg/kg's ready with  the message of is "+getmessage()+"@"+super.getQty()*getPrice());
        }

    }


}
