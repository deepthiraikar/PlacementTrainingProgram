import java.util.Arrays;
public class MergeSort {
    public static void main(String args[]){
        int[] a1={1,4,6,0,0};
        int[] a2={2,5};
        int m=3, n=2;
        int l=m-1, r=n-1, pos=m+n-1;
        while(l>=0 && r>=0){
            if(a1[l] >a2[r])
                a1[pos--]=a1[l--];
            else a1[pos--]=a2[r--];
        }
        while(r>=0) a1[pos--]=a2[r--];
        System.out.println(Arrays.toString(a1));
    }
}
