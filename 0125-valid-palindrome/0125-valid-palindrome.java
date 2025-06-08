class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", ""); // we should covert into lowercase and remove all alpha numercail characters
        int i = 0;                       // for that we use REPLACEALL
        int j = s.length() - 1;      //replaced all by regex by not^ char or num (which means it should not be alpha numerical charaters)
        while (i <= j) {           //and we replace with null("")
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}