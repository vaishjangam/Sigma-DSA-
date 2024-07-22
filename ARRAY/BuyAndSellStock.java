public class BuyAndSellStock {
    public static int BuySellStocks(int price[]){
         //initializing BP(Buying prize) 

    int BP = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i= 0; i < price.length; i++){
        if(BP < price[i]){ //price[i] current price(i.e. selling price)
            int Profit =  price[i]- BP; //Today's profit
            maxProfit = Math.max(maxProfit, Profit);
        }else{
            BP = price[i];
        }

    }
    return maxProfit;

}
    public static void main(String args[]){
        int price[] = {7, 1, 5, 3, 6, 4};
       System.out.println(BuySellStocks(price));
    }
}
