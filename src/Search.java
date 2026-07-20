public class Search {
    static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            //int mid = (start+end)/2; //isme integer overflow problem ho sakti hai, out of integer range.
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] >= target){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    static int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] <= target){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }

    static int getFreq(int[] arr,int target){
        int lbIndex = getLowerBound(arr,target);
        int ubIndex = getUpperBound(arr,target);

        int occurence = ubIndex - lbIndex;
        return occurence;
    }

    //find peak index in mountain array
    static int peakIndexInMountainArray(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                ans = mid;
                end=mid-1;
            }
        }
        return ans;
    }

    void main(){
//        int arr[] = {10,20,30,40,50,60,90};
//        System.out.println(binarySearch(arr,80));

//        int arr[] = {10,20,30,30,30,30};
//        int target = 20;
//        System.out.println("ans : "+getLowerBound(arr,target));
//        System.out.println("ans : "+getUpperBound(arr,target));
//        System.out.println("freq : "+getFreq(arr,target));

        int arr[] = {10,20,30,40,35,10};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
