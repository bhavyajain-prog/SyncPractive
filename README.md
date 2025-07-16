1. Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.  
   You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.  
   Example: Input: nums = [1,2,0] Output: 3

2. Given an integer x, return true if x is a palindrome, and false otherwise.  
   Example: Input: x = 121 Output: true

3. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. (Easy)  
   Example: Input: nums = [1,3,5,6], target = 5 Output: 2

4. Given a string s, find the length of the longest substring without duplicate characters.  
   Example: Input: s = "abcabcbb" Output: 3

5. Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. (Easy)  
   Example: Input: haystack = "sadbutsad", needle = "sad" Output: 0

6. Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.  
   Example: Input: num1 = "2", num2 = "3" Output: "6"

7. Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)  
   Example: Input: head = [1,2,3,4] Output: [2,1,4,3]

8. Given the head of a linked list, remove the nth node from the end of the list and return its head.  
   Example: Input: head = [1,2,3,4,5], n = 2 Output: [1,2,3,5]

9. You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.  
   Merge all the linked-lists into one sorted linked-list and return it.  
   Example: Input: lists = [[1,4,5],[1,3,4],[2,6]] Output: [1,1,2,3,4,4,5,6]

10. Given an array of strings strs, group the anagrams together. You can return the answer in any order.  
    Example: Input: strs = ["eat","tea","tan","ate","nat","bat"] Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

11. Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.  
    Example: Input: n = 13 Output: 6

12. You are given a 0-indexed array of unique strings words. A palindrome pair is a pair of integers (i, j) such that:  
    0 <= i, j < words.length, i != j, and words[i] + words[j] (the concatenation of the two strings) is a palindrome.  
    Return an array of all the palindrome pairs of words.  
    You must write an algorithm with O(sum of words[i].length) runtime complexity.  
    Example: Input: words = ["abcd","dcba","lls","s","sssll"] Output: [[0,1],[1,0],[3,2],[2,4]]

13. Given an integer array nums, return the number of reverse pairs in the array.  
    A reverse pair is a pair (i, j) where:  
    0 <= i < j < nums.length and nums[i] > 2 * nums[j].  
    Example: Input: nums = [1,3,2,3,1] Output: 2  
    Explanation: The reverse pairs are:  
    (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1  
    (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

14. Given an array of integers nums, sort the array in ascending order and return it.  
    You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.  
    Example: Input: nums = [5,2,3,1] Output: [1,2,3,5]

15. Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.  
    Example: Input: nums1 = [1,3], nums2 = [2] Output: 2.00000
