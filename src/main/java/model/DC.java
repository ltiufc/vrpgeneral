package model;

public class DC {

	private int id;
	private double x;
	private double y;

	public DC() {
		super();
	}

	public DC(int id, double x, double y) {
		super();
		setId(id);
		setX(x);
		setY(y);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
