package Model;

public class Square implements Shape {
	
	private int side;
	
	public Square() {
		
	}

	public int getSide() {
		return side;
	}

	public boolean setSide(int side) {
		if (side < 1 || side > 100) {
			return false;
		}
		
		this.side = side;
		return true;
	}

	@Override
	public float calculateArea() {
		return side * side;
	}

	@Override
	public float calculateCircumference() {
		return side * 4;
	}

}
