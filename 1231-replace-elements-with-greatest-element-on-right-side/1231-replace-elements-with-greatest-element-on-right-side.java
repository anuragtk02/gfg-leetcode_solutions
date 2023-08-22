class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                max=Math.max(max,arr[j]);
            }
            arr[i]=max;
            max=-1;
        }
        return arr;
    }
}