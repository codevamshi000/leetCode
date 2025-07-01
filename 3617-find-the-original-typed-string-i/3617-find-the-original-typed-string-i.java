class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int total=1;//already word is 1 output from 5 so find another 4 possible outcome

        int i=0;
        while(i<n){
            char ch=word.charAt(i);
            int count=0;
         
         //counting how many times one char repated
            while(i<n && word.charAt(i)==ch){
                count++;
                i++;
            }
//if count in more then 1 time then she accidently typed too long many key
//we use (count-1)by adding the giving word to total so 1(already given)+4(total)=5 
            if(count>1){
                total=total+(count-1);
            }
        }
        return total;
    }
}