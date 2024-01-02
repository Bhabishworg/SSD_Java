package classwork.uml.shapes;

import java.awt.*;

public abstract class Shape {
	private Color color;
	private Point origin;
	
	public abstract double area();
	
	public Color getColor() {
		return color;
	}
	
	public Point getOrigin() {
		return origin;
	}
	
	public abstract double perimeter();
	
	public void setColor(Color col) {
		color = col;
	}
	
	public void setOrigin(Point org) {
		origin = org;
	}
	
	Shape(Color col, Point org){
		color = col;
		origin = org;
	}
	
	Shape(){
		
	}
	
	Shape(Point org){
		origin = org;
	}
}
