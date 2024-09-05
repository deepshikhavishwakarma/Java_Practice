package CodePractice.Codeday4_Loops;

import java.util.*;

public class LeftRightSumDiff {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        for (int i = 1; i < n; i++) {
            leftsum[i] = leftsum[i - 1] + nums[i - 1];
        }
        int[] rightsum = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            rightsum[i] = rightsum[i + 1] + nums[i + 1];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values you want to store in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter arrays values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LeftRightSumDiff lr = new LeftRightSumDiff();
        int[] result = lr.leftRightDifference(arr);
        for (int val : result) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}