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

    if (n == 0) {
      return 0;
    } else if (n % 10 == 7) {
    
      return 1 + count7(n / 10);

    } else {
      
      return count7(n / 10);

    }
  }
  
  // Problem Set 2
  
  public static String changePi(String strRead) {
  
  /** public static String changePi(String str)
  * Given a string, compute recursively (no loops) a new string where * all appearances of "pi" have been replaced by "3.14".
  **/ 

    int intNumLetter = strRead.length();
    String Pi = "3.14";

    if ((strRead.substring(1)).equalsIgnoreCase("")) {

      return "";

    } else if ((strRead.substring(0)).equalsIgnoreCase("p") && (strRead.substring(1)).equalsIgnoreCase("i")) {
      
      return Pi + changePi(strRead.substring(0, intNumLetter - 1));

    } else {

      return changePi(strRead.substring(1, intNumLetter - 1));
    }
  }

  // Problem Set 3

  public static String stringClean(String strWord) {

    //Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

    int intAll = strWord.length();
    String strSub1 = strWord.charAt(0);
    String strSub2 = strWord.charAt(1);
    String strChar1;
    String strChar2;
    String strAll = "";

    if (intAll == 0) {

      return strWord;

    } else {

      if (Char1 == Char2) {

        strChar1 = Character.toString(Char1);

        return Char1 + stringClean(strWord.substring(2, intAll - 1));

      } else if (Char1 != Char2) {

        strChar1 = Character.toString(Char1);
        strChar2 = Character.toString(Char2);
        strAll = strAll + strChar1 + strChar2;

      }
    }
    return strAll + stringClean(strWord.substring(2, intAll - 1));
  }

  // The fact that I can't think of a solution for a recursive function without a base is killing me. If you look at my early commits (actually don't look at it), they're all wrong because I'm thinking of recursive like while and for loops. You said that recursive is like Inception, dream in a dream, my brain is throttling by processing that idea. I'm sorry but, I just can't.

  // I looked back at the recursive examples that you listed, it all make sense. But then I went on youtube to search for the answer to problem 1, then this random guy start talking about rewriting a while loop to recursive method, it just straight up fried my brain.
}
