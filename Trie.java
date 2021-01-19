public class Trie {
	static final int ALPHABET_SIZE = 26;
	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];
		boolean isEndOfWord;
		TrieNode() {
			isEndOfWord = false;
			for(int i = 0; i < ALPHABET_SIZE; i++) {
				children[i] = null;
			}
		}
	}
	static TrieNode root = new TrieNode();
	public void insert(String key) {
		TrieNode current = root;
		for(int level = 0; level < key.length();level++) {
			int index = key.charAt(level) - 'a';
			if(current.children[index] == null) {
				current.children[index] = new TrieNode();
			}
			current = current.children[index];
		}
		current.isEndOfWord = true;
	}
	public boolean search(String key) {
		TrieNode current = root;
		for(int level = 0; level < key.length(); level++) {
			int index = key.charAt(level) - 'a';
			if(current.children[index] == null) {
				return false;
			}
			current = current.children[index];
		}
		return (current != null && current.isEndOfWord);
	}
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("qwerty");
		System.out.println(trie.search("qwerty"));
		System.out.println(trie.search("q....."));
	}
}

