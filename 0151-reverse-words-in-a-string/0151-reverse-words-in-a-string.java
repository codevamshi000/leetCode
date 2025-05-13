class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" +");//1st going to SPLIT the words with space "+"
        StringBuilder sb= new StringBuilder();//can't modifie string ,but can modifie SB
        for(int i=words.length-1;i>=0;i--){//for reversing array
            sb.append(words[i]);//adding every word
            sb.append(" ");// adding space to the word
        }
        return sb.toString().trim();//atlast we TRIM (the space or additional space) of words

    }
}