class Solution {
   /* public static String toLowerCase(String s){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toLowerCase(s.charAt(0));
        sb.append(ch);
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==' '&& i<s.length()-1){
                sb.append(s.charAt(i));
            }
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
       // else if{
         //   sb.append(s.charAt(i));
       // }
        return sb.toString();
    }*/
    public boolean isPalindrome(String s) {
         String cleaned  = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        for(int i=0;i<cleaned.length()/2;i++){
            int n = cleaned.length();
            if(cleaned.charAt(i)!= cleaned.charAt(n-1-i)){
                return false;
            }
        }
        return true;
        
    }
}