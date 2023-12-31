package lab1;

/**
 * Represents the shape of a geometric circle and extends the 
 * abstract Shape class.
 */
public class Circle extends Shape {
	private int radius;		// The radius of the circle.
	
	/**
	 * Constructs an instance of Circle class.
	 * It sets the no. of sides to 0.
	 */
	Circle() {
		super(0);
	}
	
	/**
	 * Gets the radius of the circle.
	 * 
	 * @return The radius of the circle.
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of the circle.
	 * 
	 * @param radius The radius of the circle.
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Gets the area of the circle.
	 * Overrides the getArea method from parent class Shape.
	 * 
	 * @return The area of the circle.
	 */
	@Override
	public int getArea() {
		int area = (int) (Math.PI * Math.pow(radius, 2));
		return area;
	}
	
	/**
	 * Sets the string representation of the Circle object.
	 * 
	 * @return A text that provides the area of the circle.
	 */
	@Override
	public String toString() {
		return "Area of the circle= " + getArea();
	}
}
