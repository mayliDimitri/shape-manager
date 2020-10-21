package Model;

public class Circle implements Shape {
	
	private int diameter;
	
	public Circle() {
		
	}

	public int getDiameter() {
		return diameter;
	}

	public boolean setDiameter(int diameter) {
		if (diameter < 1 || diameter > 100) {
			return false;
		}
		
		this.diameter = diameter;
		return true;
	}

	@Override
	public float calculateArea() {
		float radius = 0;
		
		radius = (float) (diameter * 0.5);
		return (float) (Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float calculateCircumference() {
		return (float) (Math.PI * diameter);
	}

}
