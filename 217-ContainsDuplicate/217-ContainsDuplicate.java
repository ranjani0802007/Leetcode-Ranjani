// Last updated: 8/14/2026, 11:59:52 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        /*for(int ele:nums){
            if(s.add(ele))
            continue;
            else
            return true;
        }
        return false;*/

        for(int ele:nums){
            s.add(ele);
        }
        return s.size()!=nums.length;
    }
}