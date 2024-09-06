package CodePractice.Codeday2;
import java.util.*;

public class LargestEleArr{
    void largeEle(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Largest Element is :" + arr[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LargestEleArr ae = new LargestEleArr();
        System.out.println("Enter size of array: ");
        int s = sc.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        ae.largeEle(a);
        sc.close();
    }
}
