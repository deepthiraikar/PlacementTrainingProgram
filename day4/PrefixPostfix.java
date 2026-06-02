import java.util.Arrays;

public class PrefixPostfix {
    public static void prefixsum(int[] arr, int[] prefix, int i){
        if(i==0){
            prefix[0]=arr[0];
            return;
        }
        prefixsum(arr,prefix,i-1);
        prefix[i]= prefix[i-1]+arr[i];
    }
    public static void postfixsum(int[] arr, int[] postfix, int i){
        if(i==arr.length-1){
            postfix[i]=arr[i];
            return;
        }
        postfixsum(arr,postfix,i+1);
        postfix[i]= postfix[i+1]+arr[i];
    }
    public static void main(String[] args) {
        int[] arr={23,12,98,45,18,45,12,98};
        int[] sumPre=new int[arr.length];
        int[] sumPos=new int[arr.length];
        prefixsum(arr, sumPre,arr.length-1);
        System.out.println("Prefix sum");
        System.out.println(Arrays.toString(sumPre));
        postfixsum(arr, sumPos,0);
        System.out.println("Postfix sum");
        System.out.println(Arrays.toString(sumPos));
    }
}
