# leet-dec-challenge

[leetcode](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/)  
This repo contains solution to the problems in LeetCode December Challenge.

## About the challenge

This Challenge is beginner-friendly and available to both Premium and non-Premium users. It consists of 31 daily problems over the month of December. A problem is added here each day, and you have 24 hours to make a valid submission for it in order to be eligible for rewards.

## Day 1

* Problem link [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3551/)
* Given the root of a binary tree, return its maximum depth.
* A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
* Solution [link](SolutionDay1.java)
* Example 1:

![day1](jpg/day1.jpg)

```text
Input: root = [3,9,20,null,null,15,7]
Output: 3
```

* Example 2:

```text
Input: root = [1,null,2]
Output: 2
```

* Constraints:  
  * The number of nodes in the tree is in the range [0, 104].
  * -100 <= Node.val <= 100

## Day 2

* Problem link [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3552/)
* Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
* Solution [link](SolutionDay2.java)
* Example:

```text
// Init a singly linked list [1,2,3].
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
solution.getRandom();
```

## Day 3

* Problem link [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3553/)
* Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
* Solution [link](SolutionDay3.java)
* Example 1:  

![day3_0](jpg/day3.jpg)

```text
Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
```

* Example 2:

![day3_1](jpg/day3_1.jpg)

```text
Input: root = [5,1,7]
Output: [1,null,5,null,7]
```

* Constraints:
  * The number of nodes in the given tree will be in the range [1, 100].
  * 0 <= Node.val <= 1000

## Day 4

* Problem link [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3554/)
* Given two positive integers n and k.
* A factor of an integer n is defined as an integer i where n % i == 0.
* Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
* Solution [link](SolutionDay4.java)
* Example 1:

```text
Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
```

* Example 2:

```text
Input: n = 7, k = 2
Output: 7
Explanation: Factors list is [1, 7], the 2nd factor is 7.
```

* Example 3:

```text
Input: n = 4, k = 4
Output: -1
Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
```

* Constraints:
  * 1 <= k <= n <= 1000

## Day 5

* Problem link [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3554/)
* You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
* Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
* Solution [link](SolutionDay5.java)
* Example 1:

```text
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
```

* Example 2:

```text
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
```

* Constraints:
  * 1 <= flowerbed.length <= 2 * 104
  * flowerbed[i] is 0 or 1.
  * There are no two adjacent flowers in flowerbed.
  * 0 <= n <= flowerbed.length

## Day 6

* Problem link [link](https://leetcode.com/explore/featured/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3556/)
* Given a binary tree

```c
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```

* Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
* Initially, all next pointers are set to NULL.
* Solution link [link](SolutionDay6.java)
* Example 1:

![day6_0](jpg/day6_0.png)

```text
Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
```

* Constraints:
  * The number of nodes in the given tree is less than 6000.
  * -100 <= node.val <= 100
