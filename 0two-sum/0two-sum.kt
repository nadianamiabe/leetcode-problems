class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var sum: Int = 0
        var hashMap = HashMap<Int, Int>()
        var result = IntArray(2)
        var complement: Int = 0
        for (i in nums.indices) {
            complement = target - nums[i]
            if (hashMap.containsKey(complement)) {
                result[0] = hashMap[complement]!!
                result[1] = i
            } else {
                hashMap.put(nums[i], i)
            }
        }
        return result
    }
}