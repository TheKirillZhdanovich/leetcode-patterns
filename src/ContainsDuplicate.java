import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(arr1));
        System.out.println(containsDuplicate(arr2));
        System.out.println(containsDuplicate(arr3));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        if (nums.length == set.size()) {
            return false;
        }
        else {
            return true;
        }
    }
}
