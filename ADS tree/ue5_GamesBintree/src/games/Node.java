package ue5_GamesBintree.src.games;

/**
 * ADS-Übung WS2013 / 1IB / Ü-Blatt 5 / Aufgabe 1/2/3
 * @author (c) 2013 D. Horvatic M. Abrell, Peter Kaiser
 */
 class Node {
	public Game game;
	public Node left;
	public Node right;
	

	public Node(Game game, Node left, Node right) {
		this.game = game;
		this.left = left;
		this.right = right;
	}

}
