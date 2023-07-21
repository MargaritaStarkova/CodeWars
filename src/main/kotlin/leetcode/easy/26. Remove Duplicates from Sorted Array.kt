package leetcode.easy

/*
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present
in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/

private fun main() {

    val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)

    println(removeDuplicates1(nums))
    println(nums.joinToString(","))

}

//----------------------------------------------------------------------------------------------------------------------

private fun removeDuplicates(nums: IntArray): Int {
    var cursor = 0
    var index = 0
    var k = 0
    while (index < nums.size){
        if(index == 0){nums[cursor]= nums[index]
            cursor++
            index++
        }
        if(nums[cursor-1] == nums[index]){
        }else if(nums[cursor-1]<nums[index]){
            nums[cursor]=nums[index]
            cursor++
        }
        index++
    }
    k = cursor
    while(cursor<nums.size){
        nums[cursor]=-1
        cursor++
    }
    return k
}


//----------------------------------------------------------------------------------------------------------------------
private fun removeDuplicates1(nums: IntArray): Int {

    nums.distinct().let {
        it.forEachIndexed { index, i ->
            nums[index] = i
        }
        return it.size
    }
}
//----------------------------------------------------------------------------------------------------------------------

