package lab4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

public class TriangleTest {
	@ParameterizedTest
	@CsvSource({"30,20,20", "20,30,20", "20,20,30"})
	void isIsoscelesTest(int sideA, int sideB, int sideC) {
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		
		assertFalse(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertTrue(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10,10,10", "20,20,20", "30,30,30"})
	void isEquilateralTest(int sideA, int sideB, int sideC) {
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		
		assertTrue(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertFalse(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10,20,30", "10,30,20", "20,10,30", "20,30,10"})
	void isScaleneTest(int sideA, int sideB, int sideC) {
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
	@CsvSource({"10,20,30", "10,30,20", "20,10,30", "20,30,10"})
	void setSidesTest(int sideA, int sideB, int sideC) {
		Triangle triangle = new Triangle();
		triangle.setSides(sideA, sideB, sideC);
		
		assertFalse(triangle.isEquilateral());
		assertTrue(triangle.isScalene());
		assertFalse(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10", "30", "20"})
	void setSidesTest(int length) {
		Triangle triangle = new Triangle();
		triangle.setSides(length);
		
		assertTrue(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertFalse(triangle.isIsosceles());
	}
	
	@ParameterizedTest
	@CsvSource({"10,20", "20,10"})
	void setSidesTest(int length, int other) {
		Triangle triangle = new Triangle();
		triangle.setSides(length, other);
		
		assertFalse(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
		assertTrue(triangle.isIsosceles());
	}
	
}