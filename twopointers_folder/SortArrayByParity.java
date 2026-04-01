import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            if(nums[start]%2!=0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                end--;
            } else{
                start++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }
}
