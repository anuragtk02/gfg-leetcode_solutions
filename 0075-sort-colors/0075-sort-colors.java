class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count0++;
            }
            if(nums[i]==1)
            {
                count1++;
            }
            if(nums[i]==2)
            {
                count2++;
            }

        }
        for(int i=0;i<count0;i++)
        {
            nums[i]=0;
        }
        for(int i=count0;i<count0+count1;i++)
        {
            nums[i]=1;
        }
        for(int i=count0+count1;i<count0+count2+count1;i++)
        {
            nums[i]=2;
        }
        
    }
}