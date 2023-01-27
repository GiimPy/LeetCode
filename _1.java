import java.util.HashMap;

public class _1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> vals = new HashMap<Integer,Integer>();
        for (int i = 0; i<nums.length; i++) {
            if (vals.containsKey(target - nums[i])) return new int[] {vals.get(target - nums[i]), i};
            else vals.put(nums[i], i);
        }
        return new int[] {};
    }
}