import java.util.Arrays;
import java.util.stream.Collectors;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(countBits(2)).boxed().collect(Collectors.toList()));
        System.out.println(Arrays.stream(countBits(5)).boxed().collect(Collectors.toList()));
    }

    public static int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sumOfBits(i);
        }

        return arr;
    }

    public static int sumOfBits(int n) {
        int counter = 0;

        while (n != 0) {
            counter += n % 2;
            n /= 2;
        }

        return counter;
    }

}
