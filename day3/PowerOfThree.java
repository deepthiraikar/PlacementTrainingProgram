public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n%3==0){
            n/=3;
        }
        if(n==1) return true;
        else return false;
    } 

    public static void main(String[] args) {
        int n=27;
        System.out.println(isPowerOfThree(n));
    }
}
