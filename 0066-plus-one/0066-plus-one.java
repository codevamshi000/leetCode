class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;

 // Traverse from last digit backwards
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
            digits[i]++;
            return digits;
        }
      digits[i]=0;
    }

    // If control reaches here → number was like 999 → 1000
    int []newNum=new int[n+1];
    newNum[0]=1;   // rest already 0 by default
    
    return newNum;
    }
}