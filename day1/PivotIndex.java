public class PivotIndex {
    public static int pivot(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            if (left == right) {
                return i;
            }
            left = left + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        int res=pivot(nums);
        System.out.println("pivot index ["+res+"]");
    }
}

