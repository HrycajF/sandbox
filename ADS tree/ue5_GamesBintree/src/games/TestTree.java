package ue5_GamesBintree.src.games;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * ADS-Übung WS2013 / 1IB / Ü-Blatt 5 / Aufgabe 1/2/3
 * @author (c) 2013 D. Horvatic, Peter Kaiser
 */
public class TestTree {

	private Tree tree;	
	String[] gameTitles ={
			
			"m",
"d",					   "q",
"b" ,      "f",		   "o",  		  "s",
"a","c"	  ,"e","g",	"n","p",	"r","t"};

	
	@Before 
	public void initialize(){
		tree = new Tree();
	}
	
//	@Test
//	public void testInsert() {
//		for (int i = 0; i < gameTitles.length; i++) {
//			tree.insert(new Game(gameTitles[i],null));
//			}
//	
//		tree.printTree();
//
//	}
	
	
	@Test
	public void testDeleteRootWithNoChilds() {
		for (int i = 0; i < 1; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}
		assertEquals("m", tree.root.game.getTitel());
		tree.delete(new Game("m"));
		assertEquals(null, tree.root);
			
	}

	
	@Test
	public void testDeleteRootWithOnlyLeftChild() {
		for (int i = 0; i < 2; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}
		
		tree.delete(new Game("m"));

		assertEquals("d", tree.root.game.getTitel());
		assertEquals(null, tree.root.left);
		assertEquals(null, tree.root.right);
			
	}
	

	@Test
	public void testDeleteRootWithOnlyRightChild() {
		for (int i = 0; i < 3; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}

		tree.delete(new Game("d"));

		tree.delete(new Game("m"));

		
		assertEquals("q", tree.root.game.getTitel());
		assertEquals(null, tree.root.left);
		assertEquals(null, tree.root.right);
			
	}
	
	
	@Test
	public void testDeleteRootWithLeftChildAndRightChild() {
		for (int i = 0; i < 3; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}
		
		tree.delete(new Game("m"));
		
		assertEquals("d", tree.root.game.getTitel());
		assertEquals(null, tree.root.left);
		assertEquals("q", tree.root.right.game.getTitel());
			
	}
	
	@Test
	public void testDeleteRootWithLeftChildAndRightChild2() {
		for (int i = 0; i < 10; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}
		
		tree.delete(new Game("m"));
		
		assertEquals("f", tree.root.game.getTitel());
		assertEquals("d", tree.root.left.game.getTitel());
		assertEquals("q", tree.root.right.game.getTitel());
		assertEquals("b", tree.root.left.left.game.getTitel());
		assertEquals("e", tree.root.left.right.game.getTitel());
		assertEquals("o", tree.root.right.left.game.getTitel());
		assertEquals("s", tree.root.right.right.game.getTitel());
		assertEquals("a", tree.root.left.left.left.game.getTitel());
		assertEquals("c", tree.root.left.left.right.game.getTitel());
		assertEquals(null, tree.root.left.right.left);

			
	}
	
	@Test
	public void testDeleteInnerNodeWithOnlyLeftChild() {
		for (int i = 0; i < 6; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}
		
		tree.delete(new Game("q"));
		
		assertEquals("m",tree.root.game.getTitel());
		assertEquals("d",tree.root.left.game.getTitel());
		assertEquals("o",tree.root.right.game.getTitel());
		assertEquals("b",tree.root.left.left.game.getTitel());
		assertEquals("f",tree.root.left.right.game.getTitel());
	}
	
	@Test
	public void testDeleteInnerNodeWithOnlyRightChild() {
		for (int i = 0; i < 7; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}
		tree.delete(new Game("o"));
		tree.delete(new Game("q"));
		
		assertEquals("m",tree.root.game.getTitel());
		assertEquals("d",tree.root.left.game.getTitel());
		assertEquals("s",tree.root.right.game.getTitel());
		assertEquals("b",tree.root.left.left.game.getTitel());
		assertEquals("f",tree.root.left.right.game.getTitel());
		
	}
	
	@Test
	public void testDeleteInnerNodeWithLeftAndRightChild() {
		for (int i = 0; i < 11; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}

		tree.delete(new Game("d"));
		
		assertEquals("m",tree.root.game.getTitel());
		assertEquals("c",tree.root.left.game.getTitel());
		assertEquals("q",tree.root.right.game.getTitel());
		assertEquals("b",tree.root.left.left.game.getTitel());
		assertEquals("f",tree.root.left.right.game.getTitel());
		assertEquals("o",tree.root.right.left.game.getTitel());
		assertEquals("s",tree.root.right.right.game.getTitel());
		assertEquals("a",tree.root.left.left.left.game.getTitel());
		assertEquals(null,tree.root.left.left.right);
		assertEquals("e",tree.root.left.right.left.game.getTitel());
		assertEquals("g",tree.root.left.right.right.game.getTitel());
	}
	
	@Test
	public void testDeleteInnerNodeWithLeftAndRightChild2() {
		for (int i = 0; i < 7; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}

		tree.delete(new Game("q"));
		
		assertEquals("m",tree.root.game.getTitel());
		assertEquals("d",tree.root.left.game.getTitel());
		assertEquals("o",tree.root.right.game.getTitel());
		assertEquals("b",tree.root.left.left.game.getTitel());
		assertEquals("f",tree.root.left.right.game.getTitel());
		assertEquals("s",tree.root.right.right.game.getTitel());
	}
	
	@Test
	public void testDeleteLeftLeaf() {
		for (int i = 0; i < gameTitles.length; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}

		tree.delete(new Game("n"));
		
		assertEquals("m",tree.root.game.getTitel());
		assertEquals("d",tree.root.left.game.getTitel());
		assertEquals("q",tree.root.right.game.getTitel());
		assertEquals("b",tree.root.left.left.game.getTitel());
		assertEquals("f",tree.root.left.right.game.getTitel());
		assertEquals("o",tree.root.right.left.game.getTitel());
		assertEquals("s",tree.root.right.right.game.getTitel());
		assertEquals("a",tree.root.left.left.left.game.getTitel());
		assertEquals("c",tree.root.left.left.right.game.getTitel());
		assertEquals("e",tree.root.left.right.left.game.getTitel());
		assertEquals("g",tree.root.left.right.right.game.getTitel());
		assertEquals("p",tree.root.right.left.right.game.getTitel());
		
		assertEquals("r",tree.root.right.right.left.game.getTitel());
		assertEquals("t",tree.root.right.right.right.game.getTitel());
	}
	
	@Test
	public void testDeleteRightLeaf() {
		for (int i = 0; i < gameTitles.length; i++) {
			tree.insert(new Game(gameTitles[i],null));
			}

		tree.delete(new Game("p"));
		tree.printTree();
		
		assertEquals("m",tree.root.game.getTitel());
		assertEquals("d",tree.root.left.game.getTitel());
		assertEquals("q",tree.root.right.game.getTitel());
		assertEquals("b",tree.root.left.left.game.getTitel());
		assertEquals("f",tree.root.left.right.game.getTitel());
		assertEquals("o",tree.root.right.left.game.getTitel());
		assertEquals("s",tree.root.right.right.game.getTitel());
		assertEquals("a",tree.root.left.left.left.game.getTitel());
		assertEquals("c",tree.root.left.left.right.game.getTitel());
		assertEquals("e",tree.root.left.right.left.game.getTitel());
		assertEquals("g",tree.root.left.right.right.game.getTitel());
		assertEquals("n",tree.root.right.left.left.game.getTitel());
		
		assertEquals("r",tree.root.right.right.left.game.getTitel());
		assertEquals("t",tree.root.right.right.right.game.getTitel());
	}

}
