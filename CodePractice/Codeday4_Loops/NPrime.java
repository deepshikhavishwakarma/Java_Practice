package CodePractice.Codeday4_Loops;

import java.util.*;

public class NPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
              count = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i+" ");
            }
        }
       sc.close();
    }
}