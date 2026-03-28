class Sort012 {
    
    public void sort012(int[] arr) {
        // code here
        // dutch national flag algorithm
        
        int l = 0;
        int m = 0;
        int h = arr.length-1;
        int tmp = 0;
        
        while(m<=h){
            if(arr[m]==0){
                tmp = arr[m];
                arr[m] = arr[l];
                arr[l]=tmp;
                l++;
                m++;
            }
            else if(arr[m] ==2){
                tmp = arr[m];
                arr[m] = arr[h];
                arr[h] = tmp;
                h--;
            }
            else{
                m++;
            }
        }
    }
}