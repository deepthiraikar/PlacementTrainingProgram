import java.util.*;

class Solution {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        for (int a : aliceSizes) {
            sumA += a;
        }
        for (int b : bobSizes) {
            sumB += b;
        }
        int diff = (sumA - sumB) / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int b : bobSizes) {
            set.add(b);
        }
        for (int a : aliceSizes) {
            int target = a - diff;
            if (set.contains(target)) {
                return new int[]{a, target};
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] aliceSizes={1,1};
        int[] bobSizes={2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }
}