import java.util.Arrays;

//31. Next Permutation
public class problem2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("the next permutation of " + Arrays.toString(nums)+ " is:" );
        problem2 problem = new problem2();
        problem.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void nextPermutation(int[] num) {
        int l = num.length;
        int i = l-2;
        while(i>=0 && num[i]>=num[i+1]){
            i-=1;
        }
        if(i>=0){
            int j = l-1;
            while(num[j]<=num[i]){
                j-=1;
            }
            swap(num, i, j);
        }
        reverse(num,i+1,l-1);
    }

    public void swap(int[] num, int l, int r){
        int temp = num[l];
        num[l] = num[r];
        num[r] = temp;
    }

    public void reverse(int[] num, int l, int r){
        while(l<r)
        {

            swap(num, l++, r--);
        }
    }
}
