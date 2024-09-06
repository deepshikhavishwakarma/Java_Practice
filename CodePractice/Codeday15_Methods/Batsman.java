package CodePractice.Codeday15_Methods;

import java.util.*;

public class Batsman {
  String name;
  int runs, matches;
  float batting_avg;

  // computeBattingAverage(name, runs, matches, batting_avg);
  // // sc.close();
  // }

  void computeBattingAverage(String name, int runs, int matches, float batting_avg) {
    // System.out.println("Name123 " + name);
    // System.out.println("Runs 123 " + runs);
    // System.out.println("Matches123 " + matches);
    // System.out.println("Batting average123 " + batting_avg);

    if ((runs < 0 && matches < 0) || (runs > 0 && matches == 0)) {
      System.out.println("Error");
    }
    getStatistics(name, runs, matches, batting_avg);
  }

  void getStatistics(String name, int runs, int matches, float batting_avg) {
    System.out.println("Name    " + name);
    System.out.println("Runs    " + runs);
    System.out.println("Matches " + matches);
    System.out.println("Batting average  " + batting_avg);
  }

  void setBatsmanValues() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Name: ");
    // Batsman b1 = new Batsman();
    name = sc.next();
    System.out.print("Enter runs: ");
    runs = sc.nextInt();
    System.out.print("Enter matches: ");
    matches = sc.nextInt();
    System.out.print("Enter th bating ave: ");

    batting_avg = (float) (runs / matches);

    this.computeBattingAverage(name, runs, matches, batting_avg);
    sc.close();
  }

  public static void main(String[] args) {
    Batsman b1 = new Batsman();
    b1.setBatsmanValues();
  }

}