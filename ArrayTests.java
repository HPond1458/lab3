import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,3,5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,3,1 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1,3,5 };
    assertArrayEquals(new int[]{5,3,1 }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = {1,3,5,7 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{7,5,3,1 }, input1);
	}


  @Test
  public void testReversed1() {
    int[] input1 = {1,3,5,7 };
    assertArrayEquals(new int[]{7,5,3,1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverage() {
    double[] input1 = {1,3,5};
    double expect = 4;
    assertEquals(expect, ArrayExamples.averageWithoutLowest(input1),0.0001);
  }

  @Test
  public void testAverage1() {
    double[] input1 = {1};
    double expect = 0;
    assertEquals(expect, ArrayExamples.averageWithoutLowest(input1),0.0001);
  }

  @Test
  public void testAverage2() {
    double[] input1 = {};
    double expect = 0;
    assertEquals(expect, ArrayExamples.averageWithoutLowest(input1),0.0001);
  }

  @Test
  public void testAverage3() {
    double[] input1 = {1,1,2,3};
    double expect = 2;
    assertEquals(expect, ArrayExamples.averageWithoutLowest(input1),0.0001);
  }
}
