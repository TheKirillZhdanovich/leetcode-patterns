import java.util.*;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-10000,-9999,-7,-5,0,0,10000})));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i] * nums[i]);
        }

        Collections.sort(list);

        for(int i = 0; i < nums.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
