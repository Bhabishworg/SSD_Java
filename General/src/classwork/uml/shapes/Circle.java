package classwork.uml.shapes;

import java.awt.Point;

public class Circle extends Shape{
	private double radius;
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public Circle(Point org, double rad){
		super.setOrigin(org);
		radius = rad;
	}
	
	public Circle(){
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
}
