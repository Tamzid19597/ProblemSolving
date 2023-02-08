package LeetCodeTop150Qs;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock_121 {
    static int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyingPrice=prices[0]+1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyingPrice){
                buyingPrice=prices[i];
            }
            int profit=prices[i]-buyingPrice;
            if(profit>maxProfit)maxProfit=profit;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,3,4,6,2}));
    }

}
