package CodePractice.Codeday2;
public class SumArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,60,70,80,90,100};
        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum +=arr[i];
//        }
        for(int k: arr){  //For Each loop
            sum+=k;
        }
        System.out.println("Sum of Array element is: "+sum);
    }
}
