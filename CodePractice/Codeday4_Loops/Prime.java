package CodePractice.Codeday4_Loops;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1, count = 0;
        while (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;

        }
        if (count == 2) {
            System.out.println("The number is the prime number ");
        } else {
            System.out.println("The number is the not a prime number ");
        }
        sc.close();
    }
}