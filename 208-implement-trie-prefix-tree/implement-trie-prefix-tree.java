class TrieNode{
    TrieNode children[] =  new TrieNode[26];
    boolean eow = false;
}

class Trie {
    private TrieNode root;

    public Trie() {
      root = new TrieNode();
    }
   
    
    public void insert(String word) {
        TrieNode curr = root;
        for(int level = 0;level< word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
        
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for(int level = 0;level < word.length(); level++){
            int idx =  word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(int level = 0;level<prefix.length();level++){
            int idx = prefix.charAt(level) -'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */