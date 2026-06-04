
import java.util.Arrays;

public class CoinChange {
    public static int denom(int[] coins, int amt){
        int size=amt+1;
        int[] dp=new int[size];
        Arrays.fill(dp,size);
        dp[0]=0;
        for(int coin:coins)
            for(int i=coin; i<=amt; i++)
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
        if(dp[amt]<size) return dp[amt];
        else return -1;

    }

    public static void main(String[] args) {
        int coins[]={1,2,5}, req=8;
        System.out.println(denom(coins, req));
    }
}
