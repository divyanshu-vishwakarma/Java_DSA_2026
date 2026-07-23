import java.util.Arrays;

public class AgressiveCow {

    static boolean isValidAns(int[] arr,int k,int mid){
        int cowCount = 1;
        int lastPostion = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]-arr[lastPostion] >= mid){
                cowCount++;
                lastPostion = i;
            }
            if(cowCount == k){
                return true;
            }
        }
        return false;
    }


    public int midDistance(int[] arr, int k){
        Arrays.sort(arr);
        int n = arr.length;
        int start = 0;
        int end = arr[n-1]-arr[0];
        int ans =-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(isValidAns(arr,k,mid)){
                ans = mid;
                start = mid+1;
            }else{
                end =mid-1;
            }
        }
        return ans;
    }


    void main(){
        int arr[] = {1,2,8,4,9};
        System.out.println(midDistance(arr,3));
    }
}
