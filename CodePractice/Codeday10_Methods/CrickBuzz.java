package CodePractice.Codeday10_Methods;

public class CrickBuzz {
  public static void assignDetail(String name, int totalRun, int jersyNo, int matches, String sportsName,
      String countryName) {
    int average;
    CrickBuzz obj1 = new CrickBuzz();
    if (totalRun > 0 && jersyNo > 0 && sportsName.equals("Cricket")) {
      average = totalRun / matches;
      obj1.displayDetail(name, totalRun, jersyNo, matches, average);
    } else {
      System.out.println("This app is for showing the cricket player details");
    }

  }

  public void displayDetail(String name, int totalRun, int jersyNo, int matches, int average) {
    System.out.println("The name of the player :" + name);
    System.out.println("The totalRun of the player :" + totalRun);
    System.out.println("The jesryNo of the player :" + jersyNo);
    System.out.println("The matches played :" + matches);
    System.out.println("The avergae of the player :" + average);
  }

  public static void main(String[] args) {
    //CrickBuzz obj = new CrickBuzz();
    assignDetail("virat", 400, 18, 5, "Cricket", "India");
  }

}
