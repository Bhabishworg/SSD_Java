package week2.interfaceExample2;

public class Rectangle implements Shape{
	@Override
	public void getArea() {
		int length = 5;
		int breadth = 5;
		System.out.println("The area of the rectangle is " + length * breadth);
	}
	
	@Override
	public void getSides() {
		System.out.println("4 sides");
	}
}
