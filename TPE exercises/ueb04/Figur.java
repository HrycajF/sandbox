package ueb04;

public class Figur {

	private double flaeche;
	
	protected Figur() {
		this.flaeche = 0;
	}

	protected Figur(double flaeche) {
		this.flaeche = flaeche;
	}

	public double getFlaeche() {
		return this.flaeche;
	}

}
