package day2;

public class maxSubarray {
   public static int Subsum(int[] nums){
    if(nums.length==1)
            return nums[0];
    else if(nums.length<1)
        return -1;
    else{
        int cSum=nums[0];
        int mSum=nums[0];
        for(int i=0;i<nums.length;i++){
            cSum=Math.max(nums[i],cSum+nums[i]);
            mSum=Math.max(mSum,cSum);
        }
        return mSum;
    }
   }
    public static void main(String[] args) {
        int[] nums={-1,4,2,-2,-1};
        System.out.println(Subsum(nums));
    } 
}
