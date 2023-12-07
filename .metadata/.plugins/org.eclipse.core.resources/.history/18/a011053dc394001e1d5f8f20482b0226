package lab1;

public class Circle extends Shape {
	private int radius; // The radius of the circle.
	
	/**
	 * Constructor.
	 * 
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
	 * Overriding the abstract method from parent class Shape.
	 * 
	 * @return The area of the circle.
	 */
	@Override
	public int getArea() {
		int area = (int) (Math.PI * Math.pow(radius, 2));
		return area;
	}
	
	/**
	 * Sets the string representation of objects of Circle class.
	 * 
	 * @return A text that provides the area of the circle.
	 */
	@Override
	public String toString() {
		return "Area of the circle= " + getArea();
	}
}
