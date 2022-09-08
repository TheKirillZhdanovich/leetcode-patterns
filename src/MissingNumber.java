import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {3,0,1};
        int[] arr2 = {0,1};
        int[] arr3 = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(arr1));
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr3));
    }

    public static int missingNumber(int[] nums) {
        List<Integer> arr = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());

        for(int i = 0; i <= nums.length; i++) {
            if(arr.contains(i) != true) {
                return i;
            }
        }
        return 0;
    }
}
