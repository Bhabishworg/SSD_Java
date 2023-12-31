package lab1;

import java.util.Scanner;

/**
 * Serves as the entry point for the program showing the functionality of Circle, 
 * Ellipse, Rectangle and Shape classes.
 */
public class Driver {
	public final static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 	   // To allow the user to input data.
		
		// Asks for shape to calculate the area of.
		System.out.print("Shape: ");
		String shape = scan.nextLine();
		
		// To calculate area for each different shapes.
		switch (shape.toLowerCase()) {
		case "rectangle":
			// Asks and stores length of the rectangle.
			System.out.print("Enter a length: ");
			int length = scan.nextInt();
			
			// Asks and stores width of the rectangle.
			System.out.print("Enter a width: ");
			int width = scan.nextInt();
			
			// Creates rectangle object of length and width provided by user.
			Rectangle rect = new Rectangle();
			rect.setLength(length);
			rect.setWidth(width);
			
			System.out.println(rect);               // Outputs the area of the rectangle.
			break;
		case "ellipse":
			// Asks and stores length of the ellipse.
			System.out.print("Enter a length: ");
			length = scan.nextInt();
			
			// Asks and stores width of the ellipse.
			System.out.print("Enter a width: ");
			width = scan.nextInt();
			
			// Creates ellipse object of length and width provided by user.
			Ellipse elli = new Ellipse();
			elli.setLength(length);
			elli.setWidth(width);
			
			System.out.println(elli);				 // Outputs the area of the ellipse.
			break;
		case "circle":
			// Asks and stores radius of the circle.
			System.out.print("Enter the radius: ");
			int radius = scan.nextInt();
			
			// Creates circle object of radius provided by user.
			Circle circ = new Circle();
			circ.setRadius(radius);
			
			System.out.println(circ);				  // Outputs the area of the circle.
			break;
		default:
			// If none of the given shapes are input.
			System.out.println(shape + "'s area cannot be calculated."); 
		}
		
		scan.close();
	}
}
