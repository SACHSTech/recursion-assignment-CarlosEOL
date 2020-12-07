package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // Problem set 1: count 7

      // some steps to perform before tests are run
      // First, initialize the n value, insert the expected value in the 
    }
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);

        assertEquals(2, Recursion.count7(1274297));
    }
    
    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
