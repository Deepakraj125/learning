class Solution {
    static ArrayList<Integer> maxSum(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        ArrayList<Integer> ans = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;
        int maxDiff = 0;
        
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum >= k){
                j--;
            } else{
                if(sum > maxSum ||(sum >maxSum && Math.abs(arr[i]-arr[j]) > maxDiff)){
                    ans.clear();
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    maxSum = sum;
                    maxDiff = Math.abs(arr[i]-arr[j]);
                                       
                }
                i++;
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
            ans.add(-1);    
        }
        
        return ans;
        
    }
}