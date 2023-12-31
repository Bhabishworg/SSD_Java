package lab1;

/**
 * Represents the shape of a geometric ellipse and extends the Rectangle 
 * class.
 */
public class Ellipse extends Rectangle {
	/**
	 * Constructs an instance of Ellipse class.
	 * It sets the no. of sides to 0.
	 */
	Ellipse(){
		setSides(0);
	}
	
	/**
	 * Gets the area of the ellipse.
	 * Overrides the getArea method from class Shape parent to parent 
	 * class Rectangle.
	 * 
	 * @return The area of the ellipse.
	 */
	@Override
	public int getArea() {
		int area = (int) (Math.PI * (super.getArea() / 4));
		return area;
	}
	
	/**
	 * Sets the string representation of the Ellipse object.
	 * 
	 * @return A text that provides the area of the ellipse.
	 */
	@Override
	public String toString() {
		return "Area of the ellipse= " + getArea();
	}
}
