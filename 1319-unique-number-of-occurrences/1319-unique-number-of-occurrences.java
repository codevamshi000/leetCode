class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      Map<Integer,Integer>freqMap=new HashMap<>();

      for(int num:arr){
    //Loop through the array and count the occurrences of each element
    //Uses getOrDefault(num, 0) to handle unseen numbers and increment count.
        freqMap.put(num,freqMap.getOrDefault(num,0)+1);
      }
      
      //to remove DUPLICATES we use SeT
      //Stores them in a set to remove duplicates.
      Set<Integer>freqSet=new HashSet<>(freqMap.values());

      return freqMap.size()==freqSet.size();
      //If both sizes are equal, it means no frequency was repeated.
    }
}