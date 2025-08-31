package a_coursendTrie;

import java.util.HashMap;

public class Trie {

	class Node {
		int data;
		boolean isTerminal;
		HashMap<Character, Node> child = new HashMap<>();
	}

	private Node root;

	public Trie() {
		Node nn = new Node();
		nn.data = '*';
		root = nn;

	}

	public void insert(String word) {

	}

	public boolean search(String word) {

	}

	public boolean startsWith(String prefix) {

	}

}
