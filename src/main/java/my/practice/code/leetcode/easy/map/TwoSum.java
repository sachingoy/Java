package my.practice.code.leetcode.easy.map;

//https://leetcode.com/problems/two-sum/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> comp = new HashMap<>();
        int index1 = -1, index2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (comp.containsKey(target - nums[i])) {
                index1 = comp.get(target - nums[i]);
                index2 = i;
            }
            comp.put(nums[i], i);
        }
        return new int[]{index1, index2};
    }
}
