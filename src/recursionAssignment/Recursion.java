package recursionAssignment;

public class Recursion{

   // Problem Set 1

  public static int count7(int n) {

    String strN = Integer.toString(n);
    int intTotal;
    int intCount7 = 0;
    char CharN;

    intTotal = strN.length() - 1;
    CharN = strN.charAt(intTotal);

    if (intTotal = 0) {

      if (CharN == '7') {
        intCount7++;
      }

      System.out.println("Reached the end.");
      return intCount7;
      
    }else{

      if (CharN == '7') {
        intCount7++;
      }

      count7(n/10);
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
      
    }else{
      if (strNew.equalsIgnoreCase("p")) {

        if (strNew2.equalsIgnoreCase("i")) {
          return Pi + changePi(strRead.substring(1, intNumLetter));
        }else{
          return changePi(strRead.substring(1, intNumLetter));
        }

      }
      return changePi(strRead.substring(1, intNumLetter));
    }
  }

  // Problem Set 3

  public static String stringClean(String strWord) {

    int intAll = strWord.length();

    if (intAll = 0) {
      return strWord;
    }else if 

  }
}
