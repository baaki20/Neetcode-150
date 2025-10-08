import java.util.*;

public class Day_1_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> uniqueNums = new HashSet<>();

        // A more concise way to do this is:
        // we always have to loop through the whole array before we can conclude on the result
        /*
        for(int num: nums){
            uniqueNums.add(num);
        }
        return nums.length != uniqueNums.size();
        */



        // A more concise way to do this is:
        // we can return true as soon as we find a duplicate
        for(int num: nums){
            if(uniqueNums.contains(num)){
                return true;
            }
            uniqueNums.add(num);
        }
        return false;
    }
}
