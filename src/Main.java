import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // containsDuplicate
        /*
        int[] nums = {1, 2, 1, 3, 4};
        boolean containsDuplicate = Day_1_ContainsDuplicate.containsDuplicate(nums);
        System.out.println(containsDuplicate);
        */

        // isAnagram
        /*
        boolean isAnagram = Day_2_IsAnagram.isAnagram("hello", "leolh");
        System.out.println(isAnagram);
        */

        // Two sums
        int[] twosums = Day_3_TwoSum.twoSum(new int[]{2, 3, 11, 15, 7}, 9);
        System.out.println(Arrays.toString(twosums));
    }
}