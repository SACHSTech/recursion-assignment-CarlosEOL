package recursionAssignment;

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
  public void Test1(){
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE); 
    // assertTrue(TESTBOOLEAN);
    assertEquals(2, Recursion.count7(787));

    Recursion.count7(7997);
  }

  @Test
  public void Test2(){
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE); 
    // assertTrue(TESTBOOLEAN);
    assertEquals("IJustLove3.14", Recursion.changePi("IJustLovePi"));
  }

  @Test
  public void Test3(){
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE); 
    // assertTrue(TESTBOOLEAN);
    assertEquals("STSdsTS", Recursion.stringClean("SSSTSdsTTTS"));
  }
}
