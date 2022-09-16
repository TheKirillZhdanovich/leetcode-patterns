import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        List<Integer> list = Arrays.stream(nums).boxed().sorted().toList();
        int counter = 1;
        int maxCounter = 1;

        for(int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                if(maxCounter < counter) {
                    maxCounter = counter;
                }
                continue;
            }

            if(Objects.equals(list.get(i), list.get(i + 1))) {
                continue;
            }

            if(Objects.equals(list.get(i), list.get(i + 1) - 1)) {
                counter++;
            }else {
                if(counter > maxCounter) {
                    maxCounter = counter;
                }
                counter = 1;
            }
        }

        return maxCounter;
    }
}
