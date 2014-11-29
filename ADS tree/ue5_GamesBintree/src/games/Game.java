package ue5_GamesBintree.src.games;

/**
 * ADS-Übung WS2013 / 1IB / Ü-Blatt 5 / Aufgabe 1/2/3
 * @author (c) 2013 D. Horvatic, M. Abrell, Peter Kaiser
 */
public class Game {
	private String titel;
	private String genre;

	public Game(String titel, String genre) {
		this.titel = titel;
		this.genre = genre;
	}
	
	public Game(String titel) {
		this.titel = titel;
		this.genre = "unknown";
	}

	public String getTitel() {
		return titel;
	}

	public String getGenre() {
		return genre;
	}

	// implements compareTo method of compareTo interface
	public int compareTo(Game game) {
		int compareNumber = this.getTitel()
				.compareToIgnoreCase(game.getTitel());
		if (compareNumber > 0)
			return 1;
		else if (compareNumber == 0)
			return 0;
		else
			return -1;
	}
}
