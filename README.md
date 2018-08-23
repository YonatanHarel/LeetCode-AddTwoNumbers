# LeetCode-AddTwoNumbers
LeetCode question - Add two numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

Rational:
In this problem we need to traverse two linked lists, add the values and put it in third linked list.
Of course we must pay attention to possible cases:
1. Two lists are size-equal.
2. One of the lists shorter than the other.
3. Most significant number in the result list (the last value of the list) has curry so we need to add another element for it.

