package leetcode.swordToOffer;

public class problem42 {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, end = 0;
        for(int i = 0;i < nums.length; i++ ){
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
                start = i+1;
            }
        }

        return max;
    }
}
