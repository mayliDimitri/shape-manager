package Model;

public class Triangle implements Shape{
	
	private int base;
	private int height;
	
	public Triangle() {
		
	}

	public int getBase() {
		return base;
	}

	public boolean setBase(int base) {
		if (base < 1 || base > 100) {
			return false;
		}
		
		this.base = base;
		return true;
	}

	public int getHeight() {
		return height;
	}

	public boolean setHeight(int height) {
		if (height < 1 || height > 100) {
			return false;
		}
		
		this.height = height;
		return true;
	}
	
	public float calculateSide() {
		float halfSide = 0;
		
		halfSide = (float) (base * 0.5);
		return (float) Math.sqrt(Math.pow(halfSide, 2) + Math.pow(height, 2));
	}

	@Override
	public float calculateArea() {
		return (float) (base * height * 0.5);
	}

	@Override
	public float calculateCircumference() {
		return base + (calculateSide() * 2);
	}
	
	

}
