package recursionAssignment;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

import com.sun.source.tree.AssertTree;

import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.Before;
// import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
  /**
  * An initial test
  */
  @Test
  public void TestCount7(){
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE); 
    // assertTrue(TESTBOOLEAN);
    assertEquals(2, Recursion.count7(787));
  }

  @Test
  public void stringClean(){
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE); 
    // assertTrue(TESTBOOLEAN);
    assertEquals("STSdsTS", Recursion.stringClean("SSSTSdsTS"));
  }

  @Test
  public void stringClean2(){
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE); 
    // assertTrue(TESTBOOLEAN);
    assertEquals("STSdsTS", Recursion.stringClean("SSSTSdsTTTS"));
  }

  @Test
  public void TestPairStar(){
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE); 
    // assertTrue(TESTBOOLEAN);
    assertEquals("no*onecan*not", Recursion.pairStar("noonecannot"));
  }
}
