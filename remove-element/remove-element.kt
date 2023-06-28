class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k: Int = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[k++] = nums[i]
            }
        }

        return k
    }
}