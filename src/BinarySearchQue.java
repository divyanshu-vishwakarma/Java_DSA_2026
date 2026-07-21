public class BinarySearchQue {
    static int pivotIndexInRotatedArray(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        if(arr[start] < arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] <= arr[n-1]){
                end=mid-1;
            }else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] arr,int s,int e, int target){
        int n = arr.length;
        int start = s;
        int end = e;

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

    static int searchInRotatedArray(int[] arr,int target){
        int pivotIndex = pivotIndexInRotatedArray(arr);
        int n = arr.length;

        if(pivotIndex == -1){
            int ans = binarySearch(arr,0, n-1,target);
            return ans;
        }

        int startArray1 = 0;
        int endArray1 = pivotIndex;
        if(target >= arr[startArray1] && target <= arr[endArray1]){
            int ans = binarySearch(arr,startArray1, endArray1,target);
            return ans;
        }

        int startArray2 = pivotIndex+ 1;;
        int endArray2 = n-1;
        if(target >= arr[startArray2] && target <= arr[endArray2]){
            int ans = binarySearch(arr,startArray2, endArray2,target);
            return ans;
        }


        return -1;

    }

    static int Sqrt(int x){
        int start  = 1;
        int end = x;
        int ans = -1;

        if(x == 0){
            return 0;
        }
        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid == x/mid){
                return mid;
            } else if (mid > x/mid) {
                end = mid -1;
            }else{
                ans = mid;
                start = mid + 1;
            }
        }

//        double factor = 1;
//        int totalPrecision = 3;
//        for(int round=1;round<=totalPrecision;round++){
//            factor = factor/10;
//
//            for(int i=1;i<=10;i++){
//                double newAns = ans + factor;
//
//                if(newAns * newAns == x){
//                    return newAns;
//                }else if(newAns*newAns < x){
//                    ans = newAns;
//                }else{
//                    break;
//                }
//            }
//        }
        return ans;
    }

    void main(){
        int arr[] = {3,4,5,1,2};
        //System.out.println(pivotIndexInRotatedArray(arr));
        //System.out.println(searchInRotatedArray(arr, 1));
        System.out.println(Sqrt(56));
    }
}
