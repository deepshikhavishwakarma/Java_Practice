package PracticeBasicQuestions.practice_Solutions1;

public class Prog1 {
  public static void main(String[] args) {
    // ----------------solu 1-------------------

    // byte b1 = 10;
    // byte b2 = 20;
    // System.out.println(b1 + b2);

    // 30

    // -----------------solu 2 --------------------

    // byte b1 = 10;
    // byte b2 = 20;
    // byte result = b1 + b2;
    // System.out.println(b1+b2);

    // error: incompatible types: possible lossy conversion from int to byte

    // -----------------solu 3--------------------
    // byte b1 =
    // byte b2 =
    // byte result = (by te)b1 +
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to byte

    // -----------------solu 4--------------------

    // byte b1 = 10;
    // byte b2 = 20;
    // byte result = (byte) b1 + (byte) b2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to byte
    // -----------------solu 6--------------------

    // byte b1 = 10;
    // byte b2 = 20;
    // byte result = (byte)(b1 + b2);
    // System.out.println(result);

    // 30
    // -----------------solu 7--------------------

    // byte b1 = 10;
    // byte b2 = 20;
    // byte result = 10+20;
    // System.out.println(result);

    // 30

    // -----------------solu 8--------------------

    // byte b1 = 10;
    // byte b2 = 20;
    // byte result = 110+120;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to byte

    // -----------------solu 9 --------------------
    // byte b1 = 10;
    // byte b2 = 20;
    // byte result = 10+20;
    // System.out.println(result);

    // 30
    // -----------------solu 10--------------------

    // byte b1 = 10L;
    // byte b2 = 20;
    // byte result = b1+b2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from long to byte
    // byte b1 = 10L;
    // ^
    // Prog1.java:76: error: incompatible types: possible lossy conversion from int
    // to byte
    // byte result = b1+b2;
    // -----------------solu 11--------------------

    // byte b1 = (byte)10L;
    // byte b2 = 20;
    // byte result = b1+b2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to byte
    // byte result = b1+b2;
    // ^
    // 1 error
    // error: compilation failed

    // -----------------solu 12--------------------

    // byte b1 = (int)10L;
    // byte b2 = 20;
    // byte result = b1+b2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to byte
    // byte result = b1+b2;
    // ^
    // 1 error
    // error: compilation failed

    // -----------------solu 13--------------------

    // long b1 = 10L;
    // byte b2 = b1;
    // byte result = b1+b2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from long to byte
    // byte b2 = b1;
    // ^
    // Prog1.java:114: error: incompatible types: possible lossy conversion from
    // long to byte
    // byte result = b1+b2;
    // ^
    // 2 errors
    // error: compilation failed

    // -----------------solu 14--------------------

    // long b1 = 10L;
    // byte b2 = (byte)b1;
    // byte result = b1+b2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from long to byte
    // byte result = b1+b2;
    // ^
    // 1 error
    // error: compilation failed

    // -----------------solu 15--------------------

    // long b1 = 10L;
    // byte b2 = (int)b1;
    // byte result = b1+b2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to byte
    // byte b2 = (int)b1;
    // ^
    // Prog1.java:143: error: incompatible types: possible lossy conversion from
    // long to byte
    // byte result = b1+b2;
    // ^
    // 2 errors
    // error: compilation failed

    // -----------------solu 16--------------------

    // byte b1 = 10;
    // byte b2 = 20;
    // byte result = b1 + 20;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to byte
    // byte result = b1 + 20;
    // ^
    // 1 error
    // error: compilation failed

    // -----------------solu 17--------------------

    // final byte b1 = 10;
    // byte b2 = b1+10;
    // byte result = b2;
    // System.out.println(result);

    // 20
    // -----------------solu 18--------------------

    // final byte b1 = 10;
    // final byte b2 = 20;
    // byte result = b1 + b2;
    // System.out.println(result);

    // 30
    // -----------------solu 19--------------------

    // final byte b1;
    // final byte b2;
    // b1= 10;
    // b2= 20;
    // byte result = b1 + b2;
    // System.out.println(result);

    // error: incompatible types: possible lossy conversion from int to byte
    // byte result = b1 + b2;
    // ^
    // 1 error
    // error: compilation failed

    // -----------------solu 20--------------------

    // int i1 = 10;
    // int i2 = 20;
    // int result = i1+i2;
    // System.out.println(result);

    // 30
    // -----------------solu 21--------------------

    // int i1 = 10;
    // String i2 = "20";
    // int result = i1 + i2;
    // System.out.println(result);

    // error: incompatible types: String cannot be converted to int
    // int result = i1 + i2;
    // ^
    // 1 error
    // error: compilation failed

    // -----------------solu 22--------------------

    // int i1 = 10;
    // String i2 = "20";
    // String result = i1 + i2;
    // System.out.println(result);

    // 1020
    // -----------------solu 23--------------------

    // String i1 = "10" + "JB";
    // String i2 = "20";
    // String result = i1 + i2;
    // System.out.println(result);

    // 10JB20

    // -----------------solu 24--------------------

    // int i1 = "10";
    // String i2 = "20";
    // String result = i1+i2;
    // System.out.println(result);

    // error: incompatible types: String cannot be converted to int
    // int i1 = "10";
    // ^
    // 1 error
    // error: compilation failed
    // -----------------solu 25--------------------

    // int i1 = "10";
    // String i2 = "20";
    // String result = i1-i2;
    // System.out.println(result);

    // error: incompatible types: String cannot be converted to int
    // int i1 = "10";
    // ^
    // Prog1.java:255: error: bad operand types for binary operator '-'
    // String result = i1-i2;
    // ^
    // first type: int
    // second type: String
    // 2 errors
    // error: compilation failed

    // -----------------solu 26--------------------

    // String i1 = "10";
    // String i2 = "20";
    // String result = i1*i2;
    // System.out.println(result);

    // error: bad operand types for binary operator '*'
    // String result = i1*i2;
    // ^
    // first type: String
    // second type: String
    // 1 error
    // error: compilation failed

    // -----------------solu 27--------------------

    // String i1 = "10";
    // String i2 = "20";
    // String result = i1/i2;
    // System.out.println(result);

    // bad operand types for binary operator '/'
    // String result = i1/i2;
    
    // -----------------solu 28--------------------
    // String i1 = "10";
    //  String i2 = "20";
    //  String result = i1%i2;
    //  System.out.println(result);

    // error: bad operand types for binary operator '%'
    //    String result = i1%i2;
            
    // -----------------solu 29--------------------

    // char i1 = "10";
    //  String i2 = "20";
    //  String result = i1+i2;
    //  System.out.println(result);

    // error: incompatible types: String cannot be converted to char
    //   char i1 = "10";
                
    // -----------------solu 30--------------------

    //  char i1 = '10';
    //  String i2 = "20";
    //  String result = i1+i2;
    //  System.out.println(result);

    // error: unclosed character literal
    //    char i1 = '10';
    //              ^
    // Prog1.java:315: error: unclosed character literal
    //    char i1 = '10';

  }
}