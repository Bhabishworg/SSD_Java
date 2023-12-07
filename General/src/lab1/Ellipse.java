package lab1;

public class Ellipse extends Rectangle{
	/**
	 * Constructor.
	 * 
	 */
	Ellipse(){
		setSides(0);
	}
	
	/**
	 * Overriding the abstract method from parent class Shape.
	 * 
	 * @return The area of the ellipse.
	 */
	@Override
	public int getArea() {
		int area = (int) (Math.PI * (super.getArea() / 4));
		return area;
	}
	
	/**
	 * Sets the string representation of objects of Ellipse class.
	 * 
	 * @return A text that provides the area of the ellipse.
	 */
	@Override
	public String toString() {
		return "Area of the ellipse= " + getArea();
	}
}