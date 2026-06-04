public class EditDistance {
    public static int dist(String src, String des){
        int rSize=src.length();
        int cSize=des.length();
        int[][] dp=new int[rSize+1][cSize+1];
        for(int r=0; r<rSize; r++)
            dp[r][0]=r;
        for(int c=0; c<cSize; c++)
            dp[0][c]=c;
        for(int r=1; r<=rSize; r++){
            for(int c=1; c<=cSize; c++){
                if(src.charAt(r-1)==des.charAt(c-1))
                    dp[r][c]=dp[r-1][c-1];
                else{
                    dp[r][c]=1+ Math.min(dp[r-1][c], Math.min(dp[r][c-1],dp[r-1][c-1]));
                }
        }
        }
        return dp[rSize][cSize];
    }
    public static void main(String[] args) {
        String w1="horse";
        String w2="ros";
        System.out.println(dist(w1, w2));
    }
}
