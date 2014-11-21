package treeSampleSolution.ue5_GamesBintree.src.games;

/**
 * ADS-Übung WS2013 / 1IB / Ü-Blatt 5 / Aufgabe 1/2/3
 * @author (c) 2013 D. Horvatic, M. Abrell, Peter Kaiser
 */
public class Main {

	public static void main(String[] args) {

		String[] gameTitles = {

		"5", "66", "44", "677", "655", "455", "433", "678", "676", "656",
				"564", "456", "454", "434", "432" };

		Tree gameTree = new Tree();
		gameTree.insert(new Game("m"));
		gameTree.insert(new Game("d"));
		gameTree.insert(new Game("q"));
		gameTree.printTree();
		gameTree.delete(new Game("m"));
		gameTree.printTree();

		for (int i = 0; i < gameTitles.length; i++) {
			gameTree.insert(new Game(gameTitles[i], "" + i));
		}

		System.out.println("\n--Baum---");
		gameTree.printTree();
		
		System.out.println("********");
		System.out.println("Aufgabe 2");
		System.out.println("\n--Inorder---");
		gameTree.printTreeInorder();

		System.out.println("\n--Preorder---");
		gameTree.printTreePreorder();

		System.out.println("\n--Postorder---");
		gameTree.printTreePostorder();

		System.out.println("\n--Levelorder---");
		gameTree.printTreeLevelorder();

		System.out.println("\n\nAufgabe 3");
		System.out.println("\n---Element 44 gesucht-----");
		gameTree.deepFirstSearch("66");
		System.out.println("breitensuche: " + gameTree.searchCounter);
		gameTree.breadthFirstSearch("6");
		System.out.println("tiefensuche: " + gameTree.searchCounter);

		System.out.println("\n---Element 678 gesucht-----");
		gameTree.deepFirstSearch("432");
		System.out.println("breitensuche: " + gameTree.searchCounter);
		gameTree.breadthFirstSearch("432");
		System.out.println("tiefensuche: " + gameTree.searchCounter);
		
		
		
		
		System.out.println("Lösche 456");
		gameTree.delete(new Game("456"));
		gameTree.printTree();
		System.out.println("Lösche 455");
		gameTree.delete(new Game("455"));
		gameTree.printTree();
		System.out.println("Lösche 44");
		gameTree.delete(new Game("44"));
		gameTree.printTree();
		System.out.println("Lösche 5");
		gameTree.delete(new Game("5"));
		gameTree.printTree();
		System.out.println("search 66");
		System.out.println(gameTree.searchGame("66").getTitel());
		System.out.println("search 433");
		System.out.println(gameTree.searchGame("433").getTitel());
		System.out.println("search 434");
		System.out.println(gameTree.searchGame("434").getTitel());

		
		


	}

}
