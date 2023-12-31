package lab1;

/**
 * Represents the shape of a geometric Rectangle and extends the abstract 
 * Shape class.
 */
public class Rectangle extends Shape {
	private int length; 	// The length of the rectangle.
	private int width;  	// The width of the rectangle.
	
	/**
	 * Constructs an instance of Rectangle class.
	 * It sets the no. of sides to 4.
	 */
	Rectangle(){
		super(4);
	}
	
	/**
	 * Gets the length of the rectangle.
	 * 
	 * @return The length of the rectangle.
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * Sets the length of the rectangle.
	 * 
	 * @param length The length of the rectangle.
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * Gets the width of the rectangle.
	 * 
	 * @return The width of the rectangle.
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of the rectangle.
	 * 
	 * @param width The width of the rectangle.
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Gets the area of the rectangle.
	 * Overrides the getArea method from parent class Shape.
	 * 
	 * @return The area of the rectangle.
	 */
	@Override
	public int getArea() {
		return length * width;
	}
	
	/**
	 * Sets the string representation of the Rectangle object.
	 * 
	 * @return A text that provides the area of the rectangle.
	 */
	@Override
	public String toString() {
		return "Area of the rectangle= " + getArea();
	}
}
