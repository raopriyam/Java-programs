import java.util.Arrays;

public class sortedSquares {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int i;
        int[] ans = new int[l];
        for(i=0;i<nums.length;i++){
            int a = nums[i]*nums[i];
            ans[i] = a;

        }
        Arrays.sort(ans);
        return ans;
    }
}
