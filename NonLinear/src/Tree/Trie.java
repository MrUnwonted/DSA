package Tree;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private static class TrieNode{
        Map<Character,TrieNode> children;
        boolean isendOfWord;

        public TrieNode() {
            children = new HashMap<>();
            isendOfWord = false;
        }
    }

    private TrieNode root;

    private Trie (){
        root = new TrieNode();
    }

    public void insert(String word){
        word = word.toLowerCase();
        TrieNode current = root;
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);

            if (node == null){
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.isendOfWord = true;
    }

    public boolean search(String word){
       word = word.toLowerCase();
        TrieNode current = root;
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);

            if (node == null){
                return false;
            }
            current = node;
        }
        return current.isendOfWord;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
//        String s = "Arjun";
        trie.insert("Arjun");
//        trie.search("Arjun");
        if (!trie.search("ARJUN")){
            System.out.println("No match");
        } else System.out.println("Word matches");

    }

}
