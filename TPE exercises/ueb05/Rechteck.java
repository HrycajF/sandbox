package ueb05;

public class Rechteck extends Form {

	private double laenge;
	private double breite;

	public Rechteck(double x, double y, double laenge, double breite) {
		super(x, y);
		this.laenge = laenge;
		this.breite = breite;
	}

	@Override
	public double flaeche() {
		return this.laenge * this.breite;
	}

	@Override
	public double umfang() {
		return 2 * (this.laenge + this.breite);
	}

}
