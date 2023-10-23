package leetcode.medium

/*
Given the head of a linked list head, in which each node contains an integer value.
Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
Return the linked list after insertion.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Example 1:
    Input: head = [18,6,10,3]
    Output: [18,6,6,2,10,1,3]
    Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes
    the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
    - We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
    - We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
    - We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
    There are no more adjacent nodes, so we return the linked list.

Example 2:
    Input: head = [7]
    Output: [7]
    Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes.
    There are no pairs of adjacent nodes, so we return the initial linked list.

Constraints:
    The number of nodes in the list is in the range [1, 5000].
    1 <= Node.val <= 1000
*/

private fun main() {
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    val ex1 = ListNode(18)
    ex1.next = ListNode(6)
    ex1.next!!.next = ListNode(10)
    ex1.next!!.next!!.next = ListNode(3)

    val ex2 = ListNode(7)

    println(insertGreatestCommonDivisors(ex1))
    println(insertGreatestCommonDivisors(ex2))
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "val = $`val`, next = $next"
    }
}


//----------------------------------------------------------------------------------------------------------------------

//Runtime 213ms Memory 38.73MB
private fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
    return if (head == null) null
    else if (head.next == null) head
    else {
        var x = head
        while (x?.next != null) {
            x.next = ListNode(gsd(x.`val`, x.next!!.`val`)).apply { next = x!!.next }
            x = x.next?.next
        }
        return head
    }
}

private fun gsd(x: Int, y: Int): Int {
    return if (y > x) gsd(y, x)
    else if (y == 0) x
    else {
        val i = x % y
        gsd(y, i)
    }
}

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

