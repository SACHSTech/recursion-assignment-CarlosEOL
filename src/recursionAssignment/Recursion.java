package recursionAssignment;

public class Recursion{

   // Problem Set 1

  public static int count7(int n) {

    //given: 727
    // 72(7)
    // 7(2)
    // (7)
    // 0

    // while (n > 0) {
    // 
    //  if (strN.substring(length - 1) == "7"){
    //    intCount7++;
    //  }
    //  n/10
    // } print intCount7;

    String strN = Integer.toString(n);
    int intN = strN.length();
    char CharN = strN.charAt(intN - 1);

    if (n == 0) {
      return intCount7;
    } else {
      if (Char == '7') {
        intCount7++;
      }
      return count7(n/10);
    }
  }
  
  // Problem Set 2
  
  public static String changePi(String strRead) {
  
  /** public static String changePi(String str)
  * Given a string, compute recursively (no loops) a new string where * all appearances of "pi" have been replaced by "3.14".
  **/ 

    String strNew = strRead.substring(0);
    String strNew2 = strRead.substring(1);
    String Pi = "3.14";
    int intNumLetter = strRead.length() - 1;

    System.out.print(intNumLetter);

    if (intNumLetter == 0) {

      return strRead;
      
    } else {
      if (strNew.equalsIgnoreCase("p")) {

        if (strNew2.equalsIgnoreCase("i")) {
          return Pi + changePi(strRead.substring(1, intNumLetter));
        } else {
          return changePi(strRead.substring(1, intNumLetter));
        }

      }
      return changePi(strRead.substring(1, intNumLetter));
    }
  }

  // Problem Set 3

  public static String stringClean(String strWord) {

    //Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

    int intAll = strWord.length();
    char Char1 = strWord.charAt(0);
    char Char2 = strWord.charAt(1);
    String strChar1;
    String strChar2;
    String strAll = "";

    if (intAll == 0) {

      return strWord;

    } else {

      if (Char1 == Char2) {

        strChar1 = Character.toString(Char1);

        return Char1 + stringClean(strWord.substring(2, intAll));

      } else if (Char1 != Char2) {

        strChar1 = Character.toString(Char1);
        strChar2 = Character.toString(Char2);
        strAll = strAll + strChar1 + strChar2;

      }
    }
    return strAll + stringClean(strWord.substring(2, intAll));
  }
  
  public static int triangle (int intRows) {
    
    if (intRows == 0) {
      return 0;
    } else {
      return intRows + triangle(intRows - 1);
    }
  }
}
