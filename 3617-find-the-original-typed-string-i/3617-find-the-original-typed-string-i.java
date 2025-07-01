class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int total=1;

        int i=0;
        while(i<n){
            char ch=word.charAt(i);
            int count=0;

            while(i<n && word.charAt(i)==ch){
                count++;
                i++;
            }
            if(count>1){
                total=total+(count-1);
            }
        }
        return total;
    }
}