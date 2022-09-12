import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[right.length - 1] = 1;

        for(int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for(int j = right.length - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];
        }

        for(int i = 0; i < right.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}
