
import java.util.Arrays;

public class movingZero{
    public static void move(int[] trucks){
        int valid=0, size=trucks.length;
        int traversal=0;
        while(traversal<size){
            if(trucks[traversal]!=0){
                trucks[valid]=trucks[traversal];
                valid++;
            }
            traversal++;
        }
        Arrays.fill(trucks,valid,size,0);
        System.out.println(Arrays.toString(trucks));
    }

    public static void main(String args[]){
        move(new int[] {20,0,19,5,3,0,4});
    }
}