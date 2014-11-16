package ueb05;

public abstract class Form {

	private double x;
	private double y;

	public Form(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract double flaeche();

	public abstract double umfang();

}
