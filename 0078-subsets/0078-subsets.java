class Solution {
    public static void get_subsequences(int ind, int arr[], List<Integer> ds, List<List<Integer>> ans)
    {
        if(ind==arr.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        get_subsequences(ind+1, arr, ds, ans);
        ds.remove(ds.size()-1);
        get_subsequences(ind+1, arr, ds, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        get_subsequences(0, nums, ds, ans);
        return ans;
    }
}