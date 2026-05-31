import java.util.Arrays;

public class RotateImage {
    public static int[][] rotate(int[][] mat){
        //transpose
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat.length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        //reverse
        for(int i=0;i<mat.length;i++){
            int l=0, r=mat.length-1;
            while(l<r){
                int temp=mat[i][l];
                mat[i][l]=mat[i][r];
                mat[i][r]=temp;
                l++; r--;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
         int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotate(mat)));
    }
}
