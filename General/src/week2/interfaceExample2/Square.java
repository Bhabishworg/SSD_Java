package week2.interfaceExample2;

public class Square implements Shape{
	@Override
	public void getArea() {
		int length = 5;
		System.out.println("The area of the square is " + length * length);
	}
	
	@Override
	public void getSides() {
		System.out.println("4 sides");
	}
}
