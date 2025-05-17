class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //creating map and iterating through it
 Map<Integer,Integer> freqMap=new HashMap<>();
 for(int num:nums){
    //getting the frequency 
    freqMap.put(num,freqMap.getOrDefault(num,0)+1);
 }
   //creating Bucket list 
   //we use nums.len+1 bcoz array start from 0 so it show note how many time we got so we skip +1
 List<Integer>[] bucket = new List[nums.length+1];
       for(int key:freqMap.keySet()){//freq values iterating through it
         int freq=freqMap.get(key);//if seeing freq and getting its key to bucket
        if(bucket[freq]==null){
            bucket[freq]=new ArrayList<>();//adding it in a.list
        }
        bucket[freq].add(key); //and add the key,which we got by freq in bucket
       }

//looping from end to get max freq and greater then k 
    int[]result = new int[k];
    int counter=0;
//looping from end to get max freq and (greater then k) 
    for(int pos=bucket.length-1;pos>=0 && counter<k;pos--){
        if(bucket[pos]!=null){
            for(Integer integer:bucket[pos]){
                result[counter++]=integer;//adding next ele by incre 
            }
        }
    }
    return result;//return the result of max freq in looping end order
    }
}