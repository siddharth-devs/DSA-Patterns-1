import java.util.Arrays;

public class MoveZeroes {
    public static void moveZero(int[] nums){
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZero(nums);
        System.out.println(Arrays.toString(nums));
    }
}
