import java.util.*;
public class FirstandLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                first = i;
                break;
            }
        }

        for(int j=nums.length-1; j>=0; j--){
            if(nums[j] == target){
                last = j;
                break;
            }
        }

        return new int[] {first, last};
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] result = searchRange(nums,8);
        System.out.println(Arrays.toString(result));
    }
}
