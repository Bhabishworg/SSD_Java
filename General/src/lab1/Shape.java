package lab1;

/**
 * Serves as the base class for various geometric shapes.
 * Subclasses (Circle, Rectangle) extend this class to implement specific shapes.
 */
abstract class Shape {
	private int sides;		// The number of sides of the shape
	
	/**
	 * Constructs an instance of Circle class with given no. of sides.
	 * 
	 * @param sides The number of sides of the shape.
	 */
	Shape(int sides){
		this.sides = sides;
	}
	
	/**
	 * Gets the area of the shapes.
	 * 
	 * @return The area of the shapes.
	 */
	abstract public int getArea();
	
	/**
	 * Gets the number of sides of the shapes.
	 * 
	 * @return The number of sides of the shapes.
	 */
	public int getSides() {
		return sides;
	}
	
	/**
	 * Sets the number of sides of the shapes.
	 * 
	 * @param sides The number of sides of the shape.
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	/**
	 * Sets the string representation of the Shape object.
	 * 
	 * @return A text that provides the area of the shape.
	 */
	@Override
	public String toString() {
		return "Area of the shape= " + getArea();
	}
}
