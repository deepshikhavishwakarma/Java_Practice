package PracticeBasicQuestions.practice_Solutions1;

public class Prog2 {
  public static void main(String[] args) {
    // ------------------sol 32------------------------
    // char i1 = 'A';
    // String i2 = "20";
    // String result = i1+i2;
    // System.out.println(result);

    // A20
    // ------------------sol 33------------------------
    // char i1 = 'A';
    // char i2 = "A";
    // String result = i1+i2;
    // System.out.println(result);

    // error: incompatible types: String cannot be converted to char
    // char i2 = "A";
    // ^
    // Prog2.java:14: error: incompatible types: int cannot be converted to String
    // String result = i1+i2;

    // ------------------sol 34------------------------
    // char i1 = 'J';
    // char i2 = 'B';
    // char result = i1+i2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to char
    // char result = i1+i2;
    // ------------------sol 35------------------------

    // char i1 = 'J';
    // char i2 = 'B';
    // String result = i1 + i2;
    // System.out.println(result);

    // error: incompatible types: int cannot be converted to String
    //   String result = i1 + i2;

    // ------------------sol 36------------------------

    // char i1 = (char)"J";
    //  char i2 = 'B';
    //  char result = i1+i2;
    //  System.out.println(result);

    // error: incompatible types: String cannot be converted to char
    //   char i1 = (char)"J";

    
    // ------------------sol 37------------------------

    // char i1 = (char)"J";
    //  char i2 = (char)"B";
    //  char result = i1+i2;
    //  System.out.println(result);
    // error: incompatible types: String cannot be converted to char
    //   //   char i1 = (char)"J";
    
    // ------------------sol 38------------------------

    // char i1 = (char)'J';
    //  char i2 = (char)'B';
    //  char result = i1+i2;
    //  System.out.println(result);

    // ------------------sol 39------------------------
    // char i1 = (int)'J';
    //  char i2 = (int)'B';
    //  char result = i1+i2;
    //  System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to char
    //    char result = i1+i2;
    
    //-----------------------sol 40------------------------

    // char i1 = (int)'J';
    //  char i2 = (int)'B';
    //  int result = i1+i2;
    //  System.out.println(result);

    //140

    //-------------------------sol 41-------------------------

    // char i1 = (int)'J';
    //  char i2 = (int)'B';
    //  char result = (int)(i1+i2);
    //  System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to char
    //    char result = (int)(i1+i2);

    
    //-------------------------sol 42-------------------------

    // char i1 = ()'J';
    //  char i2 = ()'B';
    //  char result = i1+i2;
    //  System.out.println(result);

    // error: -> expected
    //   char i1 = ()'J';
    //               ^
    // Prog2.java:101: error: -> expected
    //    char i2 = ()'B';
    //-------------------------sol 43-------------------------

    // char i1 = ()'J';
    //  char i2 = ()'B';
    //  int result = (char)i1+i2;
    //  System.out.println(result);


    // error: -> expected
    //   char i1 = ()'J';
    //               ^
    // Prog2.java:113: error: -> expected
    //    char i2 = ()'B';
    
    //-------------------------sol 44-------------------------

    //  char i1 = 65;
    //  char i2 = 65;
    //  char result = i1+i2;
    //  System.out.println(result);


    // error: incompatible types: possible lossy conversion from int to char
    //    char result = i1+i2;
    
    //-------------------------sol 45-------------------------

    // char i1 = 65;
    //  char i2 = 65;
    //  char result = i1+i2;
    //  System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to char
    //    char result = i1+i2;
    //-------------------------sol 46-------------------------

    // char i1 = 'a';
    //  char i2 = 'b';
    //  char result = (char)(i1+i2);
    //  System.out.println(result);

    // Ã

    
    //-------------------------sol 47-------------------------

    // char i1 = 65;
    //  char i2 = 65;
    //  char result = i1+i2;
    //  System.out.println((int)result);

    // error: incompatible types: possible lossy conversion from int to char
    //    char result = i1+i2;
    
    //-------------------------sol 48-------------------------

    // char i1 = 65;
    //  char i2 = 65;
    //  char result = i1+i2;
    //  System.out.println(result);

    // java Prog2.java
    // Prog2.java:168: error: incompatible types: possible lossy conversion from int to char
    //      char result = i1+i2;
    //-------------------------sol 49-------------------------

     // String i1 = "";
     // char i2 = 65;
     // System.out.println(i1+i2);

     //A
    //-------------------------sol 50-------------------------
    // String i1 = "";
    //  String i2 = ""+10+20+'A';
    //  System.out.println(i1+i2);

    // 1020A

    //-------------------------sol 51-------------------------

    // String s1 = 10+20;
    //  String s2 = "";
    //  String result = s1+s2;
    //  System.out.println(result);

    // error: incompatible types: int cannot be converted to String
    //   String s1 = 10+20;
    //-------------------------sol 52-------------------------
    String s1 = 10+20+"";
     String s2 = "";
     String result = s1+s2;
     System.out.println(result);
    
    //-------------------------sol 53-------------------------
    //-------------------------sol 54-------------------------
    //-------------------------sol 55-------------------------
    //-------------------------sol 56-------------------------
    //-------------------------sol 57-------------------------
    //-------------------------sol 58-------------------------
    //-------------------------sol 59-------------------------
    //-------------------------sol 60-------------------------
  }

}