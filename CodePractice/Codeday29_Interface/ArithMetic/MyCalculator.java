package CodePractice.Codeday29_Interface.ArithMetic;

public class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n){
        int sum = 0,temp=0;
        if(n<=0){
            System.out.println("Input must be a positive integer.");
        }else if(n==10){
            System.out.println("Invalid input. Please enter a valid positive integer.");
        }else {
            System.out.print("Divisors of " + n + " are ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    temp = i;
                    System.out.print(i + " ");
                    sum += i;
//                    System.out.print(temp+" ");
                }
               // int temp1 = temp;
                //if(temp1!=)

            }
        }
        return sum;
    }
}
