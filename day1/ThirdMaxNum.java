import java.util.Arrays;

public class ThirdMaxNum {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int max=nums[nums.length-1];

        for(int i=nums.length-2; i>=0;i--){
            if(nums[i]!=nums[i+1]){
                count++;

                if(count==3)
                    return nums[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums={1,2};
        int res=thirdMax(nums);
        System.out.println(res);
    }
}

