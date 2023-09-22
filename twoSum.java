import java.util.HashMap;

public class twoSum{
    
    public static void main(String[] args) {

        int arr1[] = {2, 7, 11, 15};
        int[] result1 = twoSum2(arr1, 9);
        System.out.println("Result 1: " + result1[0] + ", " + result1[1]);

        int arr2[] = {3, 2, 4};
        int[] result2 = twoSum2(arr2, 6);
        System.out.println("Result 2: " + result2[0] + ", " + result2[1]);

        int arr3[] = {3, 3};
        int[] result3 = twoSum2(arr3, 6);
        System.out.println("Result 3: " + result3[0] + ", " + result3[1]);
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two elements add up to the target");
    }
}