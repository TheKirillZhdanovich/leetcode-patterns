import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr1 = {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};
        int[] arr2 = {4,1,2,1,2};
        int[] arr3 = {1};

        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
        System.out.println(singleNumber(arr3));
    }

    public static int singleNumber(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        System.out.println(list);

        if(list.size() == 1) {
            return list.get(0);
        }

        for(int i = 0; i < list.size(); i += 2) {
            if(i == list.size() - 1) {
                return list.get(i);
            }
            // отрицательные числа не сравниваются при помощи ==
            if (!Objects.equals(list.get(i), list.get(i + 1))) {
                return list.get(i);
            }
        }

        return 0;
    }
}
