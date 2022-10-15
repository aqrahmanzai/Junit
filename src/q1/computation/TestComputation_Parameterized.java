package q1.computation;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import p1.computation.Computation;

@RunWith(Parameterized.class)
public class TestComputation_Parameterized {
   int mInput1, mInput2, mExpected;
   

   @Parameters
   public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { //
    	   { 100, 1, 20 }, // 1st input, 2nd input, expected value
           { 104,22, 2 }, //
           { 200, 33, 3 } });
   }

   public TestComputation_Parameterized(int input1, int input2, int expected) {
	   
	   	  this.mInput1 = input1;
	      this.mInput2 = input2;
	      this.mExpected = expected;
   }

   @Test
   public void testGetDiscount() throws Exception {
	   Computation com = new Computation();
	   int input1 = 100; int input2 = 2; int expected = 30;
	 	  int actualResult = com.getDiscount(input1, input2);
	    Assert.assertEquals(expected, actualResult);
	    
	   }
}
