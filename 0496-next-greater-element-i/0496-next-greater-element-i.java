class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(stack.isEmpty()==false && stack.peek()<=nums2[i]){
                stack.pop();

            }
            if(!stack.isEmpty()){
                map.put(nums2[i],stack.peek());
            }
            else{
                map.put(nums2[i],-1);
            }
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);

        }
        return res;
        
    }
}