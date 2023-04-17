//https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1

import java.util.Arrays;

public class RunningSumOf1DArray {

    static public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while(j>=0){
                arr[i] += nums[j];
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */
        //int[] nums = {1,2,3,4};
        int[] nums = {3,1,2,10,1};

        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
