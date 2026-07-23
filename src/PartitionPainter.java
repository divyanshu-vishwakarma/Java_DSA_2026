public class PartitionPainter {
    static boolean isValidAns(int[] arr,int k,int mid){
        int paiterCount = 1;
        int paintedLength = 0;
        for(int i =0;i<arr.length;i++){
            if(paintedLength + arr[i] <= mid){
                paintedLength += arr[i];
            }else{
                paiterCount++;
                if(paiterCount > k || arr[i] > mid){
                    return false;
                }else{
                    paintedLength = 0;
                    paintedLength += arr[i];
                }
            }
        }
        return true;
    }
    public int minTime(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int start = 0;
        int end = sum;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(isValidAns(arr,k,mid)){
                ans = mid;
                end = mid -1;
            }else{
                start = start + 1;
            }

        }
        return ans;
    }

    void main(){
        int board[] = {5,10,30,20,15};
        System.out.println(minTime(board,3));
    }



}
