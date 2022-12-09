public class WordDictionary {

	TrieNode trie = new TrieNode();

	public WordDictionary() {

	}

	public void addWord(String word) {
		char[] word1 = word.toCharArray();
		TrieNode node = trie;
		for (int i = 0; i < word1.length; i++) {
			if (node.child[word1[i] - 'a'] == null)
				node.child[word1[i] - 'a'] = new TrieNode();

			node = node.child[word1[i] - 'a'];
		}
		node.isWord = true;

	}

	public boolean search(String word) {
		char[] word1 = word.toCharArray();
		return searchHelper(word1, 0, trie);

	}

	private boolean searchHelper(char[] word, int idx, TrieNode node) {
		if (idx == word.length) {
			return node.isWord;
		}

		if (word[idx] == '.') {
			for (int i = 0; i < node.child.length; i++) {
				if (node.child[i] != null && searchHelper(word, idx + 1, node.child[i]))
					return true;
			}

			return false;
		} else {
			if (node.child[word[idx] - 'a'] == null)
				return false;

			return searchHelper(word, idx + 1, node.child[word[idx] - 'a']);
		}
	}
}

class TrieNode {
	TrieNode[] child = new TrieNode[26];
	boolean isWord = false;
}