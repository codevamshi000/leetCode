class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();

       for(String s: strs){ //looping string values
        char[] charArray=s.toCharArray(); //converting into char
        Arrays.sort(charArray);//sort that char
        String sorted=new String(charArray);//now convert that sorted into again string

        if(!map.containsKey(sorted)){
            map.put(sorted,new ArrayList<>());//take a new List and put in it
        }
        map.get(sorted).add(s);//if we get it add 
       } 
       return new ArrayList<>(map.values());// return the new AList values of map
    }
}