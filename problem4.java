import java.util.Arrays;

//LEETCODE: 75 - SORT COLORS
public class problem4 {
    public static void main(String[] args) {
        int[] nums = {2,1,2,0,0,1,2};
        System.out.println("BEFORE SORTING THE COLORS:: "+ Arrays.toString(nums));
        problem4 problem = new problem4();
        problem.sortColors(nums);
        System.out.println("AFTER SORTING THE COLORS:: "+ Arrays.toString(nums));

    }
    public void  sortColors(int[] nums){
        int left =0;
        int right = nums.length -1;
        int i = 0;
        while (i<=right){
            if(nums[i]==0){
                swap(i, left, nums);
                left+=1;
            }
            else if(nums[i]==2){
                swap(i, right, nums);
                right-=1;
                i-=1;
            }
            i+=1;
        }
    }
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
