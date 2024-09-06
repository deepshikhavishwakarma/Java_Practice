package CodePractice.Codeday20_Constructor.EmployeeBonusTest;

public class Bonus {
    private double bonusAmount;
    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
    public double getBonusAmount() {
        return bonusAmount;
    }

public static Bonus calculateBonus(Employee employee){
        Bonus bonus = new Bonus();
        switch (employee.getPerformanceRating()){
            case 1:
               bonus.bonusAmount = 5;
               break;
            case 2:
                bonus.bonusAmount =10;
                break;
            case 3:
                bonus.bonusAmount = 15;
                break;
            case 4:
                bonus.bonusAmount = 20;
                break;
            case 5:
                bonus.bonusAmount = 25;
                break;
            default:
                bonus.bonusAmount = 0;
        }

        return bonus;
}



}
