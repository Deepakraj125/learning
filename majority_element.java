class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        
        Map<Integer, Integer> countMap = new HashMap<>();

        // Loop through the array
        for (Integer num : arr) {
            countMap.merge(num, 1, Integer::sum);
        }
        

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}