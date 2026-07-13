class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers or numbers ending in 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reverse = 0;

        while (x > reverse) {

            int digit = x % 10;

            reverse = reverse * 10 + digit;

            x = x / 10;
        }

        // Even digits: x == reverse
        // Odd digits : x == reverse / 10
        return x == reverse || x == reverse / 10;
    }
}