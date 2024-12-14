import java.util.Arrays;

/* LEETCODE:53 MAXIMUM SUBARRAY
* Given an integer array nums, find the
* subarray with the largest sum, and return its sum.
* */
public class problem3 {
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("GIVEN ARRAY:: "+ Arrays.toString(nums));
        problem3 problem = new problem3();
        int ans = problem.maxSubArray(nums);
        System.out.println("MAXIMUM SUBARRAY SUM IS:: "+ ans);
    }

    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int sum = nums[0];
        for (int i =1; i<nums.length; i++){
            if(sum<0){
                max = (max> sum) ? max : sum;
                sum=0;
            }
            sum += nums[i];
            max = (max> sum) ? max : sum;
        }
        return max;
    }
}
