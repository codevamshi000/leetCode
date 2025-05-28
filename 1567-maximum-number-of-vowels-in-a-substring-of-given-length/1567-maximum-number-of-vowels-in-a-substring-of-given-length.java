class Solution {
    public int maxVowels(String s, int k) {
        int windowVowels=0;// to count values in window
        int maxVowels=0;//to count max values from all window 

        Set<Character> vowels=new HashSet<>();
        vowels.add('a');vowels.add('e');vowels.add('i');
        vowels.add('o');vowels.add('u');
      //count the no of vowels in 1st window
      for(int i=0;i<k;i++){
        if(vowels.contains(s.charAt(i))){
           windowVowels++;
        }  
      }
      maxVowels=windowVowels;
      //slide window and update max no of vowels
      for(int i=k;i<s.length();i++){
        if(vowels.contains(s.charAt(i-k))){
        windowVowels--; //if prev slid conatins vowels then after moving to next slide remove[--]the count of vowls in it
      } 
      //we dont use else if bcoz
//[ It will not check the character entering the window if the character exiting is a vowel.]
      if(vowels.contains(s.charAt(i))){
        windowVowels++;
      }
      maxVowels=Math.max(maxVowels,windowVowels);//taking max in both of it and return maxVowels
    }
  return maxVowels;
    }
}