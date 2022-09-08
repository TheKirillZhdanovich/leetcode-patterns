public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr1 = {2,1,2,1,0,1,2};
        int[] arr2 = {7,6,4,3,1};
        int[] arr3 = {1};
        int[] arr4 = {1, 4, 2};
        int[] arr5 = {2, 1};


        System.out.println(maxProfit(arr1));
        System.out.println(maxProfit(arr2));
        System.out.println(maxProfit(arr3));
        System.out.println(maxProfit(arr4));
        System.out.println(maxProfit(arr5));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
