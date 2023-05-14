package Demo1;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 20:14
 **/
//买卖股票的最佳时机 贪心
public class Demo5 {
    public int maxProfit(int[] prices) {
        int pricit = 0;
        for(int i = 1; i < prices.length;i++){
            if(prices[i] > prices[i - 1]){
                pricit += prices[i] - prices[i - 1];
            }
        }
        return pricit;
    }
}
