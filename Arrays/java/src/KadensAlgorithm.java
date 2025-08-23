public class KadensAlgorithm {
    public static int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    int ans = maxSubArray(nums);
    System.out.println("maxSum is: " + ans);
    }
}
