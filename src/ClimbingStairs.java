public class ClimbingStairs {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;

        System.out.println(climbStairs(n1));
        System.out.println(climbStairs(n2));
    }

    public static int climbStairs(int n) {
        int num1 = 1;
        int num2 = 2;

        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 2;
        }

        for(int i = 3; i <= n; i++) {
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        return num2;
    }
}
