package classwork.uml.shapes;

import java.awt.Point;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	@Override
	public double area() {
		return height * width;
	}
	
	public double getH() {
		return height;
	}
	
	public double getW() {
		return width;
	}
	
	@Override
	public double perimeter() {
		return 2 * (height + width);
	}
	
	public Rectangle(Point org, double h, double w) {
		super.setOrigin(org);
		height = h;
		width = w;
	}
	
	public Rectangle() {
		
	}
	
	public void setHW(double h, double w) {
		height = h;
		width = w;
	}
}
