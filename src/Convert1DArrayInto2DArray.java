import java.util.Arrays;

public class Convert1DArrayInto2DArray {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3}, 1, 3)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1}, 1, 2)));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        int n_count = 0;
        int m_count = 0;

        if(m * n < original.length || m * n > original.length) {
            return new int[0][0];
        }

        for(int i = 0; i < original.length; i++) {
            ans[m_count][n_count] = original[i];
            n_count++;
            if(n_count == n) {
                n_count = 0;
                m_count++;
            }
        }

        return ans;
    }
}
