package CodePractice.Sorting;

public class QuickSort {
  static void quickSort(int arr[], int l, int h) {
    if (l < h) {
      int pi = partition(arr, l, h);
      quickSort(arr, l, pi - 1);
      quickSort(arr, pi + 1, h);
    }

  }

  static int partition(int arr[], int l, int h) {
    int pivot = arr[h];
    int i = l - 1;
    for (int j = l; j <= h; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
        // i = j;
        // j = pivot;
      }
    }
    swap(arr, i + 1, h);
    return i + 1;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 4, 8, 6, 9, 2, 7 };
    int l = 0;
    int h = arr.length - 1;
    System.out.println(h);
    quickSort(arr, l, h);
    System.out.println("After Sorting");
    printArr(arr);
  }
}