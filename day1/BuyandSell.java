
public class BuyandSell {
    public static void main(String args[]){
        int[] stocks={7,1,5,3,6,4};
        if(stocks.length<2) return;
        int cBuy=stocks[0];
        int cSell=stocks[1];
        int maxP=cSell-cBuy;
        for(int i=1;i<stocks.length;i++){
            int curP=stocks[i]-cBuy;
            if(curP>maxP){
                maxP=curP;
                cSell=stocks[i];
            }
            if(stocks[i]<cBuy) cBuy=stocks[i];
        }
        System.out.println((cSell-maxP)+""+cSell);
    }
}
