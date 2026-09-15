// Last updated: 9/15/2026, 4:27:58 PM
import java.util.*;

class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        for (int x : nums1) a.add(x);
        for (int x : nums2) b.add(x);

        int n = nums1.length / 2;

        int onlyA = 0;
        int onlyB = 0;
        int common = 0;

        for (int x : a) {
            if (b.contains(x))
                common++;
            else
                onlyA++;
        }

        for (int x : b) {
            if (!a.contains(x))
                onlyB++;
        }

        int takeA = Math.min(n, onlyA);
        int takeB = Math.min(n, onlyB);

        int remainingA = n - takeA;
        int remainingB = n - takeB;

        int commonTake = Math.min(common, remainingA + remainingB);

        return takeA + takeB + commonTake;
    }
}