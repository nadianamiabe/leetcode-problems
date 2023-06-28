class Solution {
    fun romanToInt(s: String): Int {
        var result: Int = 0
        val hashMap: HashMap<Char, Int> = hashMapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        val charArray = s.toCharArray()
        var previous = 0

        for (i in charArray.size - 1 downTo 0) {
            var current = hashMap[charArray[i]]!!
            if (previous > current) {
                result -= current
            } else {
                result += current
            }
            previous = current
        }

        return result
    }
}