# Assignment: Implement a Modified Quicksort Algorithm in Java

## Objective
This assignment aims to deepen your understanding of the Quicksort algorithm by modifying its traditional implementation. You will be required to implement the Quicksort algorithm in Java, but instead of using the last element as the pivot, you will use the median of the first, middle, and last element.

## Problem Statement
You are given an array of integers. Your task is to sort this array in ascending order using a modified version of the Quicksort algorithm. The modification lies in the selection of the pivot element. Instead of choosing the last element as the pivot, you will choose the median of the first, middle, and last element of the array (or sub-array during recursive calls) as the pivot.

## Detailed Steps

1. **Find the Median:** Write a helper function, `findMedian()`, that takes three integers as input - the first, middle, and last element of an array (or sub-array during recursive calls). This function should return the median of these three numbers.

2. **Partition Function:** Modify the traditional `partition()` function in the Quicksort algorithm to use the median as the pivot. This function should partition the array (or sub-array) around the pivot - all elements smaller than the pivot should be on its left, and all elements greater should be on its right.

3. **Quicksort Function:** Implement the `quicksort()` function. This function should use the modified `partition()` function to sort the array. Remember, Quicksort is a divide-and-conquer algorithm, so you will need to make recursive calls to `quicksort()` for the two partitions created by the `partition()` function.

4. **Main Function:** In the `main()` function, take an array of integers as input, call the `quicksort()` function to sort the array, and then print the sorted array as output.

This assignment will not only help you understand the mechanics of the Quicksort algorithm but also how the choice of pivot can impact the algorithm's performance. It will also provide you with a hands-on experience of modifying an existing algorithm to meet a specific requirement.

## Submission
Once you have completed the assignment, push your code to your GitHub repository and submit the link to your repository.



***Happy coding!***
