public class ArrayPart3 {

    //sort an arrays of 0's and 1's
    static int[] sortArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    //sort 0's, 1's 2's
    static void sortNum(int arr[]) {
        int n = arr.length;
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        // Pass 1: count all occurrences first
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeroCount++;
            else if (arr[i] == 1) oneCount++;
            else if (arr[i] == 2) twoCount++;
        }

        // Pass 2: print all zeros, then all ones, then all twos
        for (int i = 0; i < zeroCount; i++) System.out.println(0);
        for (int i = 0; i < oneCount; i++) System.out.println(1);
        for (int i = 0; i < twoCount; i++) System.out.println(2);
    }

    //Dutch National Flag
    static void sortNum2(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //find missing number in n range.
    static int missingNumber(int[] nums){
        int xorSum = 0;
        for(int n: nums){
            xorSum = xorSum ^ n;
        }
        int n = nums.length;
        for(int i= 0; i <= n; i++){
            xorSum = xorSum ^ i;
        }
            return xorSum;
    }
    //find the unique element in array
    static int getUnique(int[] nums){
        int xorSum = 0;
        for(int n: nums){
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }


    static void main(){


//        sortArray(arr);
//        for(int i : arr){
//            System.out.println(i);
//        }
        //System.out.println(missingNumber(arr));
//        int[] arr={1,1,3,2,3,4,4};
//        System.out.println(getUnique(arr));
        int arr[] = {0,1,2,1,0,0,1,2,2,1};
        //sortNum(arr);
        sortNum2(arr);
        for(int i : arr){
            System.out.println(i);
        }










    }


}

