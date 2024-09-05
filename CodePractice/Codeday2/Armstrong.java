package CodePractice.Codeday2;
public class Armstrong {
    void isArmstrong(){
        int sum, rem,l;
       for(int i=100;i<=10000;i++){
       int n=i;
       sum=0;l=0;
       while(n!=0){//10334
          // n=n%10;
           n=n/10;
           l++;

       }
      // System.out.println("Length is: "+l);
           n=i;
       while(n!=0){
         rem = n%10;
//       cube = rem*rem*rem;//not working in 4 digit  that's why we first we will count digits of number then find power.

         sum += Math.pow(rem,l);
         n=n/10;
       }
       if(sum==i){
           System.out.println(i);
       }

       }
    }
    public static void main(String[] args){
     Armstrong sc = new Armstrong();
     sc.isArmstrong();
    }
}
