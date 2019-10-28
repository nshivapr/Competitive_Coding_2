/* 1. Two Sum => Brute force
Time Complexity: O(n^2)
Space Complexity: O(1)
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[] { i, j};

            }
        }
        return new int[]{};
    }
}

/* 1. Two Sum => Two Pass Hash Table
Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i)
                return new int[]{i, map.get(complement)};
        }
        return new int[]{};
    }
}

/* 1. Two Sum => One Pass Hash Table
Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
