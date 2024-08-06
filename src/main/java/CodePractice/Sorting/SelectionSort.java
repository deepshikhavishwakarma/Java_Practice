package CodePractice.Sorting;

import java.util.*;

public class SelectionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers you want to sort?");
    int num = sc.nextInt();
    System.out.println("Enter " + num + " for sorting.");
    int[] arr = new int[num];
    System.out.println("Before Sorting : ");
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt(); // taking input from user
    }

    // sorthing
    for (int i = 0; i < num - 1; i++) {
      for (int j = i + 1; j < num; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }

      }
    }
    System.out.println("After Sorting : ");
    // printing
    for (int i = 0; i < num; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();
  }
}

// Time Complexity Analysis of Selection Sort:
//Best-case,Average case,Worst case O(n2)

// The Selection sort algorithm has a time complexity of O(n^2) and a space complexity of O(1) since it does not require any additional memory space apart from a temporary variable used for swapping.