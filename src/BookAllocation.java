public class BookAllocation {
    static boolean isValidAnswer(int[] arr,int k, int maxPages){
        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if(pages + arr[i] <= maxPages){
                pages = pages + arr[i];
            }else{
                studentCount++;
                if(studentCount > k || arr[i] > maxPages){
                    return false;
                }else{
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }



    static int findPages(int[] arr, int k){
        if(arr.length<k){
            return -1;
        }
        int n = arr.length;
        int start = 1;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int end = sum;

        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(isValidAnswer(arr,k,mid)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }



    void main(){
        int arr[] = {10,20,30,40,50};
        System.out.println(findPages(arr,2));
    }
}
