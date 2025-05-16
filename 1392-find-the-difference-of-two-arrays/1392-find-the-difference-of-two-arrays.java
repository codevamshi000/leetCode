class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //return in LIST
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        
        //add nums InTo the set
        for(int num:nums1){
            set1.add(num);
        }

        for(int num:nums2){
            set2.add(num);
        }
        
        //Adding LIST
         List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
        
        for(int num:set1){
            if(!set2.contains(num)){
                result.get(0).add(num);//GET method to get (0)INDEX
            }
        }

        for(int num:set2){
            if(!set1.contains(num)){
                result.get(1).add(num);//GET method to get (1)INDEX
            }
        }

        return result;
    }
}