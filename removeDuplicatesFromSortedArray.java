//remove duplicates and return count of original numbers
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0,j=1,count=1;
        while(j<n)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }
            else if(nums[i]!=nums[j] && j<n-1)
            {
                count++;
                nums[i+1]=nums[j];
                i++;
                j++;
            }
            else
            {
                count++;
                nums[i+1]=nums[j];
                return count;
                
            }

        }
        return count;       
    }
}
