package codewars


private fun main() {

    println(twoSum(intArrayOf(2,5,5,11), 10).contentToString())

}


fun twoSum(nums: IntArray, target: Int): IntArray {

    var result = intArrayOf(0,0)

    loop@ for (i in 0..nums.lastIndex) {
        for (j in i + 1..nums.lastIndex) {
            val compl = target - nums[i]
            if (nums[j] == compl) {
                result = intArrayOf(i, j)
                break@loop
            }
        }
    }

    return result
}

private fun origin(s: String): String {
    return ""
}