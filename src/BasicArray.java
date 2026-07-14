import java.util.Collection;

public class BasicArray
{
    //find the average of array elements.
    static double getAverage(int arr[]){
        double sum = 0;
        double size = arr.length;
        for(int i : arr){
            sum += i;
        }
        double avg = sum/size;
        return avg;
    }


    //multiply each element of array by 10.
    static int[] multiplyBy10(int arr[]){
        int size = arr.length;
        int brr[] = new int[size];
        for(int i =0;i <size;i++){
//            int element = arr[i];
//            int newElement = element*10;
//            brr[i] = newElement;
              brr[i] = arr[i]*10;
        }
        return brr;
    }


    //search for an element in array(Linear Search)
    static int linearSearch(int arr[]){
        int target=5;
        int size =arr.length;
        for(int i=0;i<size;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //find the maximum element in array
    static int maxElement(int arr[]){
        int max = arr[0];
        //int max = Integer.MIN_VALUE;

        int size = arr.length;
        for(int i=0;i<size;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
            Math.max(arr[i],max);
        }
        return max;
    }

    //find the minimum element in array
    static int minElement(int arr[]){
        int min = arr[0];
        //int min = Integer.MAX_VALUE;

        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //return sum of +ve and -ve number
    static int[] getPosNegSum(int arr[]){
        int posSum = 0;
        int negSum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posSum += arr[i];
            }else{
                negSum += arr[i];
            }
        }
        int newArr[] = {posSum, negSum};
        return newArr;
    }

//count the numbers of zeroes and ones
    static int[] ZeroOneCount(int arr[]){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                oneCount += 1;
            }else if(arr[i] == 0){
                zeroCount += 1;
            }
        }
        int newArr[] = {oneCount, zeroCount};
        return newArr;
    }
    // find first unsorted element in array
    static int unsortedEl(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {   // next element is smaller
                return arr[i + 1];
            }
        }
        return -1;
    }


    static void main(){
        int arr[] = {1,4,7,8,9};

        //System.out.println(getAverage(arr));

//        int ans[] = multiplyBy10(arr);
//        for(int i:ans){
//            System.out.print(i+" ");
//        }



        //System.out.println("element found at index : "+linearSearch(arr));

      // System.out.println("maximum element is  : "+maxElement(arr));

       // System.out.println("minimum element is  : "+minElement(arr));

//        int ans[] = getPosNegSum(arr);
//        System.out.println("postive sum : "+ans[0]);
//        System.out.println("negative sum : "+ans[1]);


//        int ans[] = ZeroOneCount(arr);
//        System.out.println("one count : "+ans[0]);
//        System.out.println("zero count : "+ans[1]);

        //System.out.println(unsortedEl(arr));


    }
}
