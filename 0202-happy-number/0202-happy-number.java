class Solution {
    public boolean isHappy(int n) {
        Set<Integer> used=new HashSet<>();

        while(true){ // this is in infinnite loop 
            int sum=0;
            //cal sum of SQUAREs of digits
            while(n>0){ 
                int digit=n%10; //extract last digit 
                sum=sum+digit*digit;//square and add to sum
                n=n/10;// remove last digit
            }
            //if no, is happy
            if(sum==1) return true;
            
            //new no,
            n= sum;

            if(used.contains(sum)){
                return false;
            }
            used.add(n);
        }
    }
}
/*Line	Role
Set<Integer> used = new HashSet<>();	Stores already seen numbers
while (true)	Infinite loop until we reach 1 or repeat
int sum = 0;	Stores sum of squares of digits
n % 10 and n / 10	Breaks number into digits
sum += digit * digit;	Adds square of digit
if (sum == 1)	Checks if it's a happy number
if (used.contains(sum))	Checks for cycle
used.add(n)	Records the number we've seen */