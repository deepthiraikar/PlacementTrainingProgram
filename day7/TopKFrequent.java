import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void findFreq(int[] nums, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<HashMap.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(int each: nums)
            map.put(each,map.getOrDefault(each, 0)+1);
        for(HashMap.Entry<Integer,Integer> each:map.entrySet()){
            pq.offer(each);
            if(pq.size()>k) pq.poll();
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++)
            arr[i]=pq.poll().getKey();
        System.out.println(Arrays.toString(arr));
}

public static void main(String[] args) {
    int[] nums={1,1,1,2,2,3};
    int k=2;
    findFreq(nums, k);
}
}