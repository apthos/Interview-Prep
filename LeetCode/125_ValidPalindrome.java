class Solution {
    /*
    Runtime: 3 ms
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public boolean isPalindrome(String s) {
        //Any single character or an empty string is a palindrome
        if(s.length() < 2) return true;

        //Two pointers moving through string 
        int left = 0;
        int right = s.length() - 1;

        //Iterate through string until the left and right pointers cross paths
        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            //Ignore any character that is not alphanumeric
            if(!isAlphanumeric(leftChar)) {
                left++;
            }
            else {
                if(!isAlphanumeric(rightChar)) {
                    right--;
                }
                else {
                    if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                        return false;
                    }
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
    
    public boolean isAlphanumeric(Character c) {
        int ascii = c;
        // 65 through 90 is A - Z. 97 through 122 is a - z. 48 through 57 is 0 - 9
        return (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) ||(ascii >= 48 && ascii <= 57);
    }
}