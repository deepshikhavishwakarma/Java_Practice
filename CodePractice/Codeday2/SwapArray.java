package CodePractice.Codeday2;

import java.util.Scanner;

public class SwapArray {
    void swap(int[] arr1,int[] arr2){

        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
        System.out.print("First array is:");
        for (int j : arr1) {
            System.out.print(" " + j);
        }
        System.out.println();
        System.out.print("Second array is:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(" "+arr2[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        SwapArray sa = new SwapArray();
        System.out.println("Enter size of array: ");
        int s = sc.nextInt();
        int[] a1=new int[s];
        int[] a2=new int[s];
        System.out.println("Enter first array elements");
        for(int i=0;i<s;i++) {
            a1[i] =  sc.nextInt();
        }
        System.out.println("Enter Second array elements");
        for(int i=0;i<s;i++) {
            a2[i] =  sc.nextInt();
        }
        sa.swap(a1, a2);
        sc.close();
    }
}
