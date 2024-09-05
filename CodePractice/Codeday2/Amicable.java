package CodePractice.Codeday2;


public class Amicable {
    void pairAmicable() {
        for (int z = 100; z <= 10000; z++) {

            int divisor1 = 0, divisor2 = 0;
            int num = z;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    divisor1 += i;
                }
            }
            // System.out.println(divisor1);
            for (int i = 1; i <= divisor1 / 2; i++) {
                if (divisor1 % i == 0) {
                    divisor2 += i;
                }
            }
            // System.out.println(divisor2);

            if (num == divisor2) {
                if(num!=divisor1){
                System.out.println("amicable number  " + num + "   " + divisor1);}
            }

        }
    }

    public static void main(String[] args) {

        Amicable am = new Amicable();
        am.pairAmicable();

    }
}
