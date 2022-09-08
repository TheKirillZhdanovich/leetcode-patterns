import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,7,8,2,3,1};
        int[] arr2 = {1,1};

        System.out.println(findDisappearedNumbers(arr1));
        System.out.println(findDisappearedNumbers(arr2));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++) {
            if(set.contains(i) != true) {
                list.add(i);
            }
        }

        return list;
    }
}
