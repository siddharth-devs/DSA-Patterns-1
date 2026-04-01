import java.util.Arrays;

public class SquaresofSortedArray {
    public static int[] squaresArray(int[] nums){
        int n = nums.length;
        int[] out = new int[n];

        int left = 0;
        int right = n-1;
        int index = n-1;
        while(left<=right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                out[index] = leftSquare;
                left++;
            }
            else{
                out[index] = rightSquare;
                right--;
            }

            index--;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2,0,4,16,19};
        System.out.println(Arrays.toString(squaresArray(nums)));
    }
}
