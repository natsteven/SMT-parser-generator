package edu.boisestate.cs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple.smt2 App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // just for debugging purposes
    @Test
    public void testMain() {
        String[] args = {"/home/nat/Repos/string-constraint-counting/graphs/real/cleaned"};
//		utils.MainDot.main(args);
//        MainJSON.main(args);
		MainSMT.main(args);

        assertTrue(true); // Placeholder assertion
    }
}
