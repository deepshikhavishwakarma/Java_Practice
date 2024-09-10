package CodePractice.Codeday21_Methods.Train;

public class CheckTrain {
    public static void main(String[] args) {
     NagavalliExpress n1 = new NagavalliExpress();
        System.out.println("Train Detains");
        System.out.println("-------Nagavalli-------\nBoarding station Secunderabad");
     n1.nagavalli();
        System.out.println("\n-------Shatabdi-------\nBoarding station Secunderabad");
     n1.shatabdi();
        System.out.println("\n-------VandeBharatExpress-------\nBoarding station Secunderabad");
     VandeBharatExpress.vande();
    }
}
