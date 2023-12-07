package week2.interfaceExample2;

public interface Shape {
	/** 
	 *  Prints the area of the shape.
	 */
	void getArea();
	
	/** default method is only allowed in interfaces.
	 *  default methods have implementation.
	 *  
	 *  Prints the number of sides.
	 */
	default void getSides() {
		System.out.println("Size details");
	}
}
