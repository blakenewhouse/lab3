import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
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

  /*@Test
  public void testReverseInPlace2() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));
  }*/

  @Test
  public void lowestAverage() {
    double[] input1 = {};
    double[] input2 = {1,10,20,30};
    double[] input3 = {10,10,20,30};
    double[] input4 = {-10,-20,-30,-40};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
    assertEquals(20.0, ArrayExamples.averageWithoutLowest(input2), 0.0001);
    assertEquals(20.0, ArrayExamples.averageWithoutLowest(input3), 0.0001);
    assertEquals(-20.0, ArrayExamples.averageWithoutLowest(input4), 0.0001);
  }


}
