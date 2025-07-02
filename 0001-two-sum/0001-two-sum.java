class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int a = target - nums[i];
            if(map.containsKey(a)){
                return new int[] {map.get(a),i};
            }
        map.put(nums[i], i);
        }
        return null;
    }
}