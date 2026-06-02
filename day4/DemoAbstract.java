import java.util.Arrays;
abstract class Param{
    protected int[] nums={98,34,11,22,89};

    public void update(int i,int val){
        if(i>0 && i<nums.length){
            nums[i]=val;
            System.out.println(val+"updated @"+ i);
        }
        else{
            System.out.println("Invalid index");
        }
    }
    public abstract void maxWindow(int size); 
}

interface Parameter{
    double bmi= 19.5;
}

public class DemoAbstract extends Param implements Parameter {
    public static void main(String[] args) {
        Parameter param=new DemoAbstract();
        System.out.println(param.bmi);
    }   
    
    @Override
    public void maxWindow(int size){
        int nSize=nums.length-size+1;
        int[] res=new int[nSize];
        for(int i=0; i<nSize; i++){
            res[i]= Math.max(nums[i], nums[i+1]);
        }
        System.out.println(Arrays.toString(res));
    }
}
