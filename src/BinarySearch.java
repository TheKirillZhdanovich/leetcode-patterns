public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int[] arr1 = {2, 5};

        System.out.println("Answer: " + search(arr, 2));
        System.out.println("Answer: " + search(arr1, 0));
    }

    public static int search(int[] nums, int target) {
        int leftLimit = 0;
        int rightLimit = nums.length - 1;
        int flag = (leftLimit + rightLimit) / 2;

        if(nums.length == 1) {
            if(nums[0] == target) {
                return 0;
            }
            else {
                return -1;
            }
        }

        while(true) {
            if (nums[leftLimit] == target) {
                return leftLimit;
            }

            if (nums[rightLimit] == target) {
                return rightLimit;
            }

            if (rightLimit - leftLimit == 1) {
                return -1;
            }

            if (nums[flag] == target) {
                return flag;
            } else if (nums[flag] < target) {
                leftLimit = flag;
                flag = (leftLimit + rightLimit) / 2;
            } else {
                rightLimit = flag;
                flag = (leftLimit + rightLimit) / 2;
            }
        }
    }
}
