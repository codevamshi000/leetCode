class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> charSet=new HashSet<>();

       int left=0;
       int maxLen=0;

       for(int right=0;right<s.length();right++){//travling s

       //this is used bcoz if our right gets duplicate then we need to move our left 
          // If duplicate character found, move left until it's removed
          while(charSet.contains(s.charAt(right))){//loop conti untill we get DUPLi in SET
            charSet.remove(s.charAt(left));//we remove left char(of index 1) 
            left++;//moves this char to next index untill we remove the duplicate 
          }
  
          
            // Add current character and update max length
        charSet.add(s.charAt(right));//adding chars in SET 
        maxLen=Math.max(maxLen,right-left+1);//taking max length 
       } 
       return maxLen;
    }
}