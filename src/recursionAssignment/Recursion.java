package recursionAssignment;

public class Recursion{

   // Problem Set 1

  public static int count7(int n) {

    //given: 727
    // 72(7) + 1
    // 7(2) skip
    // (7) + 1
    // 0 skip

    //= 2

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

  public static String pairStar(String strPair) {

    if (strPair.length() <= 1) {

      return strPair.substring(0);

    } else if ((strPair.substring(1, 2)).equalsIgnoreCase(strPair.substring(0, 1))) {

      return strPair.substring(0, 1) + "*" + pairStar(strPair.substring(1));

    } else {
      return strPair.substring(0, 1) + pairStar(strPair.substring(1));
    }
  }

  // Problem Set 3

  public static String stringClean(String strWord) {

    //Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

    if (strWord.length() <= 1) return strWord;

    if (strWord.substring(1, 2).equalsIgnoreCase(strWord.substring(0, 1))) {

      return stringClean(strWord.substring(1));

    } else {
      return strWord.substring(0, 1) + (strWord.substring(1));
    }
  }
  
  // I looked back at the recursive examples that you listed, it all make sense. But then I went on youtube to search for the answer to problem 1, then this random guy start talking about rewriting a while loop to recursive method, it just straight up fried my brain.
}
