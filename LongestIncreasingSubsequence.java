
public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int lisLength = lengthOfLIS(nums);

        System.out.println("Length of Longest Increasing Subsequence: " + lisLength);
    }

    private static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxLIS = 1;

        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1; // Initialize LIS for the current element

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }

            maxLIS = Math.max(maxLIS, dp[i]); // Update the maximum LIS
        }

        return maxLIS;
    }
}


