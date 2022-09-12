import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));;
    }

    public static int majorityElement(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted().toList();
        int counter = 1;
        int majorityElement = list.get(0);

        for (int i = 0; i < nums.length - 1; i++) {
            if(Objects.equals(list.get(i), list.get(i + 1))) {
                counter++;
            }else {
                counter = 1;
            }

            if(counter > nums.length / 2) {
                majorityElement = list.get(i);
            }
        }

        return majorityElement;
    }
}
