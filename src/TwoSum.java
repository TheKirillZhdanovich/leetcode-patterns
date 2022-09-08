import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{0, 4, 3, 0}, 0)));
        System.out.println(Arrays.toString(twoSum(new int[]{-3, 4, 3, 90}, 0)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                arr[0] = map.get(nums[i]);
                arr[1] = i;
            }
            map.put(target - nums[i], i);
        }

        return arr;
    }
}
