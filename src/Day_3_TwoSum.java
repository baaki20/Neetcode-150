import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
public class Day_3_TwoSum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int remainder = target - nums[i];
            if(map.containsKey(remainder)){
                return new int[]{map.get(remainder), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
