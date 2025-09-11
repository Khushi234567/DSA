class Solution {
    public List<String> letterCombinations(String digits) {
     
		LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i =0; i<digits.length();i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				String t = ans.remove();
				for(char s : mapping[x].toCharArray())
					ans.add(t+s);
			}
		}
		return ans;
	
       /* String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ll = new ArrayList<>();
        if(digits.length() == 0){
            return ll;
        }
        combination(digits, ll, "");
        
        retrun ll;
    }
    public void combination(String str, List<String>ll, String ans){
        if(str.length()== 0){
            ll.add(ans);
            return;
        }
        char ch = str.charAt(0);
        int num = ch-'0';
        String press = map[num];
        for(int i = 0; i < press.length;i++){
            combination(str.substring(1),ll,ans+press.charAt(i));
        }*/
    }
}