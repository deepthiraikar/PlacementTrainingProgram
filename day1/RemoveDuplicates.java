public class RemoveDuplicates{
    public static int remove(int[] nums) {
        if(nums.length==0) return 0;
        int unique=0;
        for(int curr=1;curr<nums.length;curr++){
            if(nums[curr]!=nums[unique]){
                unique++;
                nums[unique]=nums[curr];
            }

        }
        return unique+1;
    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,2,3,3,4};
        int res=remove(nums);
        System.out.println(res);
    }
}
    
