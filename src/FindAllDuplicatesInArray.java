import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDuplicates(new int[]{1,1,2}));
        System.out.println(findDuplicates(new int[]{1}));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                list.add(nums[i]);
            }

            set.add(nums[i]);
        }

        return list;
    }
}
