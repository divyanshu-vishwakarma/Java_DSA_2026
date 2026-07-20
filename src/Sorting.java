public class Sorting {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i < n;i++){
            int prev = i-1;
            int currValue = arr[i];
            while(prev>=0 && currValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }
    }

    void main(){
        int arr[] = {2,1,5,6,3};
        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
