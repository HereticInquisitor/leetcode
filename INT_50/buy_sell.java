public class buy_sell {
    public static void main(String args[]) {
        Solution ay = new Solution();
        System.out.println(ay.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}


class Solution {
    public int maxProfit(int[] prices) {
        int lsp =Integer.MAX_VALUE;
        int p=0;
        int pist=0;
        for(int i=0;i<prices.length;i++) {
            if(prices[i] < lsp){
                lsp= prices[i];
            }

            pist = prices[i] - lsp;
            if(pist >p) 
                p = pist;
            
        }
        return p;
    }
}