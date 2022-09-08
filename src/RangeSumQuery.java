public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};

        System.out.println(sumRange(arr, 0, 2));
        System.out.println(sumRange(arr, 2, 5));
        System.out.println(sumRange(arr, 0, 5));
    }

    public static int sumRange(int[] arr, int left, int right) {
        int[] ans = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            count += arr[i];
            ans[i] = count;
        }

        if(left != 0) {
            return ans[right] - ans[left - 1];
        }
        else {
            return ans[right];
        }
    }
}
