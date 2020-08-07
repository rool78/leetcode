package problems;

import java.util.HashMap;

public class Trie {
    static TrieNode dict = new TrieNode();

    public static void main(String[] args) {
        String a = "hola";

    }

    public static void insert(String word) {
        char[] w = word.toCharArray();
        if(word.length() == 0){
            
        }else{
            for(int i = 0; i < w.length; i++){
                if(dict.children.containsKey(w[i])){
                    String newWord = word.substring(1);
                    insert(newWord);
                }else{
                    dict.children.put(w[i], new TrieNode());
                    String newWord = word.substring(1);
                    insert(newWord);
                }
            }

        }

    }

    public static boolean search(String word) {
        return false;
    }

    static class TrieNode{
        char letter;
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        boolean isLeaf;

        public TrieNode(){
        }

        public TrieNode(char letter){
            this.letter = letter;
        }
    }
}
