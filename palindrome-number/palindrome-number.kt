class Solution {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        var right = str.length - 1

        for (left in str.indices) {
            if (str[left] != str[right]) {
                return false
            }
            right--
        }

        return true
    }
}