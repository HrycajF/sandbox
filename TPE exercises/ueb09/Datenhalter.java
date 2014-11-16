package ueb09;

public class Datenhalter {

	private class BeobachterImpl implements Beobachter {

		public int getValue() {
			return wert;
		}
	}
	
	private int wert;

	public Datenhalter(int wert) {
		this.wert = wert;
	}
	
	public Beobachter getBeobachter() {
		return new BeobachterImpl();
	}

}
