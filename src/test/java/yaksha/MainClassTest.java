package yaksha;



import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import yaksha.*;

public class MainClassTest {

	@Test
	public void testSymmetric_One() throws ParseException, IOException {

		int[] a = { 12, 24, 7, 36, 14 };

		int[] b = { 11, 26, 7, 14 };

		int[] c = { 11, 12, 24, 26, 36 };

	//	Assertions.assertArrayEquals(c, MainClass.getSymmetricDifference(a, b));
		
		TestUtils.yakshaAssert(TestUtils.currentTest(),Arrays.equals(c, MainClass.getSymmetricDifference(a, b))==true ?"true":"false",TestUtils.businessTestFile);
		
		


	}

	@Test
	public void testSymmetric_two() throws ParseException, IOException {

	
		int[] a1 = { 11, 5, 14, 26, 3 };

		int[] b1 = { 5, 3, 1 };

		int[] c1 = { 1, 11, 14, 26 };

	//	Assertions.assertArrayEquals(c1, MainClass.getSymmetricDifference(a1, b1));
		TestUtils.yakshaAssert(TestUtils.currentTest(),Arrays.equals(c1, MainClass.getSymmetricDifference(a1, b1))==true ?"true":"false",TestUtils.businessTestFile);
		

	}
}
