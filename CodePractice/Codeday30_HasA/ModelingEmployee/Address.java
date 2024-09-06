package CodePractice.Codeday30_HasA.ModelingEmployee;

public class Address {
    private String street;
    private String state;
    private String city;
    private long pinCode;

    public Address(String street ,String state,String city,long pinCode){
        this.street = street;
        if((state.isEmpty() && state.contains("#")) ||(city.isEmpty() && city.contains("123")) || (pinCode == 0))
        {
            System.out.println("Invalid Input");
        }
        else{
            this.state = state;
            this.city = city;
            this.pinCode = pinCode;
        }
    }
    @Override
    public String toString(){
      return "Street   "+street+"\nState  "+state+"\nCity   "+city+"Pincode  "+pinCode;
    }
}
