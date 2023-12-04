import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  /*
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  
   @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
   */

   /* DELETE THIS COMMENT BRACKET WHEN LAB IS DONE
  @Test 
	public void testReverseInPlaceA() {
    int[] input1 = { 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3}, input1);
	}
  @Test 
	public void testReverseInPlaceB() {
    int[] input1 = {7, 8, 9, 10 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 10, 9, 8, 7}, input1);
	}

  @Test
  public void testReversedA() {
    int[] input1 = { 1, 3, 5};
    assertArrayEquals(new int[]{ 5, 3, 1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedB() {
    int[] input1 = { 2, 4, 6, 8};
    assertArrayEquals(new int[]{ 8, 6, 4, 2}, ArrayExamples.reversed(input1));
  }
}

*/

//DELETE ALL BELOW AFTER FINISHED WITH LAB REPORT

//JUnit test with failing input from ArrayTests.java

@Test 
	public void testReverseInPlaceA() {
    int[] input1 = { 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3}, input1);
	}

  //JUnit test with passing input from ArrayTests.java

@Test 
	public void testReverseInPlaceB() {
    int[] input1 = {8};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{8}, input1);
	}

}