package recursionAssignment;

import com.sun.org.apache.xml.internal.utils.res.IntArrayWrapper;

public class Recursion{

   // Problem Set 1

  public static int count7(int n) {

    String strN = n;
    int intTotal;
    int intCount7 = 0;
    char CharN;

    intTotal = strN.length();
    if (intTotal < 1)
    CharN = strN.charAt(intTotal - 1);

    if (CharN == '7') {

      intCount7++;

    }
    return intCount7 + count7(n/10);
  }
  
  // Problem Set 2
  
  public static String changePi(String strRead) {
  
  /** public static String changePi(String str)
  * Given a string, compute recursively (no loops) a new string where * all appearances of "pi" have been replaced by "3.14".
  **/

    String strPart1;
    String strPart2;
    int intNumLetter = strRead.length();
    int intCount;

    if (intCount == intNumLetter) {

      return strTotal;

    }else{
      
      Char = 

    }

  }
    
}
