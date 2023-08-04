package julyPotd;

public class Five {
        public static int stockBuyAndSell(int n, int[] prices) {

            int maxProfit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            return maxProfit;
        }

        public static void main(String[] args){
            Five solution = new Five();
            int n =5;
            int []prices = {1,3,5,7,9};
            int result = solution.stockBuyAndSell(n, prices);
            System.out.println("The maximum profit is :" + result);
        }

    }

