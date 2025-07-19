class Solution {
    public String reverseVowels(String s) {
        char word[] = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        String vowels = "aeiouAEIOU";

        while(start<end){
            //move start pointer until it ppoints to a vowel
            while(start<end && vowels.indexOf(word[start]) == -1){
                start++;
            }
            //Move end pointer until it points to a vowel
            while(start<end && vowels.indexOf(word[end]) == -1){
                end--;
            }
            //swap the vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            //move the  pointer towards each other 
            start++;
            end--;
        }
        String answer =  new String(word);
        return answer;
    }
}