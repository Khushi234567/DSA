class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character>set = new HashSet<>();
        int start = 0, end = 0, maxLen =0;

        while(end<s.length()){
            char c = s.charAt(end);
            if(!set.contains(c)){
            set.add(c);
                maxLen = Math.max(maxLen,end-start+1);
                end++;
            }else{
                set.remove(s.charAt(start));
                start++; 
                           }
        }
        return maxLen;

        
        
    }
}