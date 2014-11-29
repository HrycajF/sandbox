package ue5_GamesBintree.src.games;

import java.util.LinkedList;

/**
 * ADS-Übung WS2013 / 1IB / Ü-Blatt 5 / Aufgabe 1/2/3
 * @author (c) 2013 D. Horvatic, M. Abrell, Peter Kaiser
 */
public class Tree {

	public Node root;
	public int searchCounter;	// for search experiment only

	public Tree(Game game) {
		root = new Node(game, null, null);
	}

	public Tree() {
	}

	public boolean isEmpty() {
		return root == null;
	}

	public Tree getLeft() {
		Tree leftTree = new Tree();
		leftTree.root = root.left;
		return leftTree;
	}

	public Tree getRight() {
		Tree rightTree = new Tree();
		rightTree.root = root.right;
		return rightTree;
	}

	// sets right subtree;
	// be careful to keep the tree sorted!
	public void setRight(Tree tree) {
		root.left = tree.root;
	}

	// sets left subtree;
	// be careful to keep the tree sorted!
	public void setLeft(Tree tree) {
		root.right = tree.root;
	}

	// searches game identified by a title;
	public Game searchGame(String title) {
		Game seachingGame = new Game(title, null);
		Node focusNode = root;

		// descend tree
		while (focusNode.game.compareTo(seachingGame) != 0) {
			if (focusNode.game.compareTo(seachingGame) > 0)
				focusNode = focusNode.left;
			else
				focusNode = focusNode.right;
			if (focusNode == null)
				// game not found
				return null;
		}
		// found game
		return focusNode.game;

	}

	public void insert(Game game) {
		if (isEmpty()) {
			root = new Node(game, null, null);
			return;
		}
		Node parent = null;
		Node child = root;
		// descend tree
		while (child != null) {
			parent = child;
			if (child.game.compareTo(game) < 0) {
				child = child.right;
			} else if (child.game.compareTo(game) == 0) {
				// game found - do nothing (entries are unique)
				return;
			} else {
				child = child.left;
			}
		}
		// insert game as new leaf
		if (parent.game.compareTo(game) < 0)
			parent.right = new Node(game, null, null);
		else
			parent.left = new Node(game, null, null);

	}

	public void delete(Game game) {
		if (isEmpty()) {
			// tree empty, nothing to do
			return;
		}
		// find node, which should be deleted
		Node nodeToBeDeleted;
		Node parentOfNodeToBeDeleted = null;
		boolean isNodeLeftChild = true;
		if (root.game.compareTo(game) == 0) {
			nodeToBeDeleted =  root;
		} else {
			nodeToBeDeleted = root;
			// descend tree
			while (nodeToBeDeleted != null && nodeToBeDeleted.game.compareTo(game) != 0) {
				parentOfNodeToBeDeleted = nodeToBeDeleted;
				if (nodeToBeDeleted.game.compareTo(game) > 0) {
					nodeToBeDeleted = nodeToBeDeleted.left;
					isNodeLeftChild = true;
				} else {
					nodeToBeDeleted = nodeToBeDeleted.right;
					isNodeLeftChild = false;
				}
			}
		}
		if (nodeToBeDeleted == null) {
			// game not found; nothing to do
			return;
		}

		if (nodeToBeDeleted.left != null && nodeToBeDeleted.right != null) {
			// case 1: node to be deleted has two children
			Node biggestNodeFromLeftSubTree = getAndDeleteBiggestNodeFromPartTree(nodeToBeDeleted);
			if (parentOfNodeToBeDeleted == null) {
				// node to be deleted is root
				root = biggestNodeFromLeftSubTree;
			} else {
				// node is not root
				if (isNodeLeftChild) {
					parentOfNodeToBeDeleted.left = biggestNodeFromLeftSubTree;
				} else {
					parentOfNodeToBeDeleted.right = biggestNodeFromLeftSubTree;
				}
			}
			biggestNodeFromLeftSubTree.left = nodeToBeDeleted.left;
			biggestNodeFromLeftSubTree.right = nodeToBeDeleted.right;
		} else {
			if (nodeToBeDeleted.left != null && nodeToBeDeleted.right == null) {
				// case 2: node to be deleted has left child
				if (parentOfNodeToBeDeleted == null) {
					// node to be deleted is root
					root = nodeToBeDeleted.left;
				} else {
					// node is not root
					if (isNodeLeftChild) {
						parentOfNodeToBeDeleted.left = nodeToBeDeleted.left;
					} else {
						parentOfNodeToBeDeleted.right = nodeToBeDeleted.left;
					}
				}
			} else {
				// case 3: node to be deleted has right child or no child
				if (parentOfNodeToBeDeleted == null) {
					// node to be deleted is root
					root = nodeToBeDeleted.right;
				} else {
					// node is not root
					if (isNodeLeftChild) {
						parentOfNodeToBeDeleted.left = nodeToBeDeleted.right;
					} else {
						parentOfNodeToBeDeleted.right = nodeToBeDeleted.right;
					}
				}
			}
		}
	}




	// node must not be null; node.left must not be null
	private Node getAndDeleteBiggestNodeFromPartTree(Node node) {
		Node child = node.left;
		if (child.right == null) {
			node.left = child.left;
			return child;
		}
		Node parent = node;
		while (child.right != null) {
			parent = child;
			child = child.right;
		}
		parent.right = child.left;
		return child;
	}



	public void printTreeInOrder() {
		printTreeInOrder(root);
	}

	private void printTreeInOrder(Node temp) {

		if (temp.right != null)
			printTreeInOrder(temp.right);
		System.out.print(temp.game.getTitel() + ",\n");
		if (temp.left != null)
			printTreeInOrder(temp.left);

	}

	public void printTree() {
		printhelper(root, 0);

	}

	private void printhelper(Node root, int level) {

		String abstand = "";
		for (int i = 0; i < level; i++) {
			abstand += "	";
		}

		if (root != null) {

			printhelper(root.right, level + 1);
			System.out.println(abstand + "[" + level + "]"
					+ root.game.getTitel());
			printhelper(root.left, level + 1);

		}
	}

	// ----- Aufgabe 2 -------//

	// Preorder

	public void printTreePreorder() {
		printTreePreorderHelper(root);
	}

	public void printTreePreorderHelper(Node root) {
		if (root != null) {
			System.out.print(" -> " + root.game.getTitel());
			printTreePreorderHelper(root.left);
			printTreePreorderHelper(root.right);
		}
	}

	// Postorder

	public void printTreePostorder() {
		printTreePostorderHelper(root);
	}

	public void printTreePostorderHelper(Node root) {
		if (root != null) {

			printTreePostorderHelper(root.left);
			printTreePostorderHelper(root.right);
			System.out.print(" -> " + root.game.getTitel());

		}
	}

	// Levelorder

	public void printTreeLevelorder() {

		LinkedList<Node> nodeQue = new LinkedList<Node>();
		LinkedList<Node> nodeChildQue = new LinkedList<Node>();
		nodeQue.add(root);

		while (nodeQue.size() > 0) {
			for (int i = 0; i < nodeQue.size(); i++) {
				System.out.print(" -> " + nodeQue.get(i).game.getTitel());

				if (nodeQue.get(i).left != null)
					nodeChildQue.add(nodeQue.get(i).left);
				if (nodeQue.get(i).right != null)
					nodeChildQue.add(nodeQue.get(i).right);

			}

			nodeQue = nodeChildQue;
			nodeChildQue = new LinkedList<Node>();

		}

	}

	// Inorder

	public void printTreeInorder() {
		printTreeInorderHelper(root);
	}

	public void printTreeInorderHelper(Node root) {
		if (root != null) {

			printTreeInorderHelper(root.left);
			System.out.print(" -> " + root.game.getTitel());
			printTreeInorderHelper(root.right);
		}
	}

	// ----- Aufgabe 3 -------

	// Tiefensuche

	public Game deepFirstSearch(String title) {

		searchCounter = 0;

		return deepFirstSearchHelper(root, title).game;

	}

	public Node deepFirstSearchHelper(Node root, String title) {

		if (root != null) {
			searchCounter++;

			if (root.game.getTitel().equals(title))
				return root;

			Node left = deepFirstSearchHelper(root.left, title);

			if (left != null)
				return left;

			Node right = deepFirstSearchHelper(root.right, title);

			if (right != null)
				return right;

		}

		return null;

	}

	// Breitensuche

	public Game breadthFirstSearch(String title) {

		searchCounter = 0;

		LinkedList<Node> nodeQue = new LinkedList<Node>();
		LinkedList<Node> nodeChildQue = new LinkedList<Node>();
		nodeQue.add(root);

		while (nodeQue.size() > 0) {
			for (int i = 0; i < nodeQue.size(); i++) {
				searchCounter++;

				if (nodeQue.get(i).game.getTitel() == title)
					return nodeQue.get(i).game;

				if (nodeQue.get(i).left != null)
					nodeChildQue.add(nodeQue.get(i).left);
				if (nodeQue.get(i).right != null)
					nodeChildQue.add(nodeQue.get(i).right);

			}

			nodeQue = nodeChildQue;
			nodeChildQue = new LinkedList<Node>();

		}

		return null;

	}

}
