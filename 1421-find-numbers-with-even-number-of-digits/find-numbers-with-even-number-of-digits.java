class Solution {
    public int findNumbers(int[] nums) {
        int digits=0;
        for(int i=0;i<nums.length;i++){
            int x=0;
            while(nums[i]!=0){
                x++;
                nums[i]/=10;
            }
            if(x%2==0)digits++;
        }
        return digits;
    }
}