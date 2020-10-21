import java.util.Scanner;

import Model.Circle;
import Model.Square;
import Model.Triangle;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	Square square = new Square();
	Triangle triangle = new Triangle();
	Circle circle = new Circle();
	
	String nama = "";
	
	public Main() {
		
		int choose = 0;
		do {
			do {
				viewCurrShape();
				viewMenu();
				choose = scan.nextInt();
				scan.nextLine();
			} while (choose < 1 || choose > 4);
			
			switch (choose) {
				case 1:
					createShape();
					break;
				case 2:
					calculateArea();
					break;
				case 3:
					calculateCircumference();
					break;
			}
		} while (choose != 4);
		
	}
	
	
	public void viewMenu() {
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("1. Create Shape");
		System.out.println("2. Calculate Area");
		System.out.println("3. Calculate Circumference");
		System.out.println("4. Exit");
		System.out.print("Choose: ");
	}
	
	public void viewCurrShape() {
		System.out.println("Current Shape");
		System.out.println("=============");
		
		if (nama == "") {
			System.out.println("Shape : -");
			System.out.println("Attribute : -");
			System.out.println();
		} else if (nama.equals("Square")) {
			System.out.println("Shape : Square");
			System.out.println("Attribute :");
			System.out.println("- Side : " + square.getSide());
			System.out.println();
		} else if (nama.equals("Triangle")) {
			System.out.println("Shape : Triangle");
			System.out.println("Attribute :");
			System.out.println("- Base : " + triangle.getBase());
			System.out.println("- Height : " + triangle.getHeight());
			System.out.println();
		} else if (nama.equals("Circle")) {
			System.out.println("Shape : Circle");
			System.out.println("Attribute :");
			System.out.println("- Diameter : " + circle.getDiameter());
			System.out.println();
		}
		
		
		
	}
	
	public void createShape() {
		int attr1 = 0;
		int attr2 = 0;
		
		do {
			System.out.print("Input shape [Square | Triangle | Circle]: ");
			nama = scan.nextLine();
		} while (!nama.equals("Square") && !nama.equals("Triangle") && !nama.equals("Circle"));
		
		if (nama.equals("Square")) {
			do {
				System.out.print("Input side [1-100]: ");
				attr1 = scan.nextInt();
			} while (!square.setSide(attr1));
		} else if (nama.equals("Triangle")) {
			do {
				System.out.print("Input base [1-100]: ");
				attr1 = scan.nextInt();
			} while (!triangle.setBase(attr1));
			
			do {
				System.out.print("Input height [1-100]: ");
				attr2 = scan.nextInt();
			} while (!triangle.setHeight(attr2));
		} else if (nama.equals("Circle")) {
			do {
				System.out.print("Input diameter [1-100]: ");
				attr1 = scan.nextInt();
			} while (!circle.setDiameter(attr1));
		}
		
		System.out.println("Success!");
		System.out.println();
		scan.nextLine();
		scan.nextLine();
	}
	
	public void calculateArea() {
		float result = 0;
		
		if (nama.equals("Square")) {
			result = square.calculateArea();
			System.out.printf("Your Square's Area is: %.1f", result);
			System.out.println();
			scan.nextLine();
		} else if (nama.equals("Triangle")) {
			result = triangle.calculateArea();
			System.out.printf("Your Triangle's Area is: %.1f", result);
			System.out.println();
			scan.nextLine();
		} else if (nama.equals("Circle")) {
			result = circle.calculateArea();
			System.out.printf("Your Circle's Area is: %.1f", result);
			System.out.println();
			scan.nextLine();
		}
	}
	
	public void calculateCircumference() {
		float result = 0;
		
		if (nama.equals("Square")) {
			result = square.calculateCircumference();
			System.out.printf("Your Square's Circumference is: %.1f", result);
			System.out.println();
			scan.nextLine();
		} else if (nama.equals("Triangle")) {
			result = triangle.calculateCircumference();
			System.out.printf("Your Triangle's Circumference is: %f", result);
			System.out.println();
			scan.nextLine();
		} else if (nama.equals("Circle")) {
			result = circle.calculateCircumference();
			System.out.printf("Your Circle's Circumference is: %f", result);
			System.out.println();
			scan.nextLine();
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
