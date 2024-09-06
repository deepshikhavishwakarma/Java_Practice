package CodePractice.Codeday27_Interface.Caluculator;

public class SimpleCalculator implements Calculator{

    @Override
    public void calculateSum(double... nums){
        int sum=0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }
}
