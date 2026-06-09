package com.program.training.systemdesign.datastreamprocessing;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
import java.util.PriorityQueue;
// import java.util.stream.Collectors;

/**
 * You are part of a university admissions office and need to keep track of the kth highest test score from applicants in real-time.
 * This helps to determine cut-off marks for interviews and admissions dynamically as new applicants submit their scores.
 *
 * <a href="https://leetcode.com/problems/kth-largest-element-in-a-stream/?envType=problem-list-v2&envId=ssd-ssd2-data-stream-processing">...</a>
 *
 * @author naletov
 */
class KthLargest {

    private final int k;
    private final PriorityQueue<Integer> priorityQueue;

    /**
     * Initializes the object with the integer k and the stream of test scores nums.
     * @param k kth highest score
     * @param nums the pool of test scores
     */
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.priorityQueue = new PriorityQueue<>(k);
        // add all the items to priorityQueue
        for (int num : nums)
        {
            add(num);
        }
    }

    /**
     * Adds a new test score val to the stream and returns the element representing the kth largest element in the pool of test scores so far.
     * @param val a new test score val
     * @return the element representing the kth largest element in the pool of test scores
     */
    public int add(int val) {
        priorityQueue.add(val);
        if (priorityQueue.size() > k)
            priorityQueue.poll();
        return priorityQueue.peek();
    }
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 *
 * List approach:
 *
 *     private final int k;
 *     private final List<Integer> list;
 *
 *     public KthLargest(int k, int[] nums) {
 *         this.k = k;
 *         this.list = Arrays.stream(nums).boxed().collect(Collectors.toList());
 *     }
 *
 *    public int add(int val) {
 *         this.list.add(val);
 *         return list.stream().sorted(Collections.reverseOrder()).toList().get(k - 1);
 *     }
 */