package leetcode.easy

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]
Constraints:
2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.
*/

private fun main() {
    println("[0,1] = ${twoSum2(intArrayOf(1, 1, 11, 15, 33, 1, 3, 4, 5, 7, 2), 9).contentToString()}")
    println("[1,2] = ${twoSum2(intArrayOf(3, 2, 4), 6).contentToString()}")
    println("[0,1] = ${twoSum2(intArrayOf(3, 3), 6).contentToString()}")
}

//----------------------------------------------------------------------------------------------------------------------

private fun twoSum(nums: IntArray, target: Int): IntArray { //Time complexity: O(n^2) Space complexity: O(1)
//Runtime 1139 ms, Memory 39.3 MB
    for (i in 0..nums.lastIndex) {
        val array = arrayListOf<Int>()
        array.addAll(nums.toList())
        array.removeAt(i)
        for (j in 0..array.lastIndex) {
            if ((nums[i] + array[j]) == target) return intArrayOf(i, j + 1)
        }
    }
    return intArrayOf(0)
}

//----------------------------------------------------------------------------------------------------------------------
private fun twoSum1(nums: IntArray, target: Int): IntArray { //Time complexity: O(n) Space complexity: O(n)
//Runtime 183 ms, Memory 37.3 MB
    val map = HashMap<Int, Int>()
    for (i in nums.indices) { //1: {3=0}, 2: {3=1}
        map[nums[i]] = i
    }
    for (i in nums.indices) { //1: i=0
        val compliment = target - nums[i] //1: compliment = 6 - 3 = 3
        if (map.containsKey(compliment) && map[compliment] != i)// map.containsKey(3) && map[3] != 0
            return intArrayOf(i, map[compliment]!!) // intArrayOf(0, 1)
      }
    return intArrayOf(0)
}
//----------------------------------------------------------------------------------------------------------------------
private fun twoSum2(nums: IntArray, target: Int): IntArray { //Time complexity: O(n) Space complexity: O(n)
//Runtime 197 ms, Memory 37.8 MB
    val map = HashMap<Int, Int>()
    for (i in nums.indices) { //i = 1
        val compliment = target - nums[i] //compliment = 6 - 3 = 3
        if (map.containsKey(compliment) && map[compliment] != i) // map.containsKey(3)(true), map[3](0) != 1 (true)
            return intArrayOf(i, map[compliment]!!) // intArrayOf(1, 0)
        map[nums[i]] = i// map = {3=0}
        println(map)
    }
    return intArrayOf(0)
}
//----------------------------------------------------------------------------------------------------------------------
