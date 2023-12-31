package lab4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
	@ParameterizedTest
	@CsvSource({"30,20,20", "20,30,20", "20,20,30", "-20,-20,30", "20,20,-30"})
	public void isIsoscelesTest(int sideA, int sideB, int sideC) {
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		
		assertFalse(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertTrue(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10,10,10", "20,20,20", "30,30,30", "-10,-10,-10"})
	public void isEquilateralTest(int sideA, int sideB, int sideC) {
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		
		assertTrue(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertFalse(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10,20,30", "10,30,20", "20,10,30", "20,30,10", "-20,30,10"})
	public void isScaleneTest(int sideA, int sideB, int sideC) {
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		
		assertFalse(triangle.isEquilateral());
		assertTrue(triangle.isScalene());
		assertFalse(triangle.isIsosceles());
	}
	
	@Test
	public void constructorTest() {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(10);
		
		assertTrue(triangle1.isEquilateral());
		assertFalse(triangle1.isScalene());
		assertFalse(triangle1.isIsosceles());
		
		assertTrue(triangle2.isEquilateral());
		assertFalse(triangle2.isScalene());
		assertFalse(triangle2.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10,20,30", "10,30,20", "20,10,30", "-20,-30,-10"})
	public void setSidesTest(int sideA, int sideB, int sideC) {
		Triangle triangle = new Triangle();
		triangle.setSides(sideA, sideB, sideC);
		
		assertFalse(triangle.isEquilateral());
		assertTrue(triangle.isScalene());
		assertFalse(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10", "30", "20", "-40"})
	public void setSidesTest(int length) {
		Triangle triangle = new Triangle();
		triangle.setSides(length);
		
		assertTrue(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertFalse(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10,20", "20,10", "-10,-20"})
	public void setSidesTest(int length, int other) {
		Triangle triangle = new Triangle();
		triangle.setSides(length, other);
		
		assertFalse(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertTrue(triangle.isIsosceles());
	}
	
	@Test
	public void getPerimeterTest() {
		Triangle triangle1 = new Triangle(10,20,30);
		Triangle triangle2 = new Triangle(-10,-20,-30);
		
		assertEquals(60, triangle1.getPerimeter());
		assertEquals(60, triangle2.getPerimeter());
	}
	
	@Test
	public void getAverageLengthTest() {
		Triangle triangle1 = new Triangle(10,20,30);
		Triangle triangle2 = new Triangle(-10,-20,-30);
		
		assertEquals(20, triangle1.getAverageLength());		
		assertEquals(20, triangle2.getAverageLength());
	}
	
	@ParameterizedTest
	@CsvSource({"10,20,30","-10,-20,-30"})
	public void copyTest(int sideA, int sideB, int sideC) {
		Triangle triangle = new Triangle(sideA,sideB,sideC);
		Triangle copy = triangle.copy();
		
		assertTrue(copy instanceof Triangle);
		assertEquals(60, copy.getPerimeter());
		assertEquals(20, copy.getAverageLength());
	}
}
