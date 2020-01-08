class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=1;i<nums.length+1;i++)
        {
            if(!set.contains(i))
                list.add(i);
        }
        return list;
    }
}

// Time Complexity: O(n) --> As there is only 2 for loop which is 2n ==> n
// Space Complexity: O(n) --> HashSet has n elements.