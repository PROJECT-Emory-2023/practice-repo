import java.util.HashMap;

public class twoSum {

    public static void main(String[] args) {

        int arr1[] = {2, 7, 11, 15};
        int[] result1 = twoSum(arr1, 9);
        System.out.println("Result 1: " + result1[0] + ", " + result1[1]);

        int arr2[] = {3, 2, 4};
        int[] result2 = twoSum(arr2, 6);
        System.out.println("Result 2: " + result2[0] + ", " + result2[1]);

        int arr3[] = {3, 3};
        int[] result3 = twoSum(arr3, 6);
        System.out.println("Result 3: " + result3[0] + ", " + result3[1]);
    }
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer[] = new int[2];
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                //then two sums have been located
                answer[0] = map.get(target - nums[i]);
                answer[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return answer;
    }
    
    // hello
}
