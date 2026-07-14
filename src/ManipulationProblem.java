import java.util.HashMap;

public class ManipulationProblem {
    static void reverseArray(int arr[]) {
        int i = 0;
        int size = arr.length;
        int j = size - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    static void reverse(int arr[], int first, int last) {
        int i = first;
        int j = last;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    static void rotateByK(int arr[], int k) {
        int n = arr.length;
        k = k % n;


        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static void shiftBy1(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

    }

    static void shiftByK(int arr[], int k) {
        int n = arr.length;
        k = k % n; // if k is > n

        // Store last k elements
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Shift remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy temp elements to the beginning
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    //print extreme element in an alternate manner
    static void printAlternate(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            } else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }

        }
    }

    //print the mode of array
    static int getMode(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        int maxFreq = -1;
        int maxFreqWaliKey = -1;
        for (int key : map.keySet()) {
            int currentKey = key;
            int currentKeyKiFreq = map.get(key);
            if (currentKeyKiFreq > maxFreq) {
                maxFreq = currentKeyKiFreq;
                maxFreqWaliKey = currentKey;
            }
        }

        return maxFreqWaliKey;
    }


    static int minimumFreq(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int minFreq = Integer.MAX_VALUE;
        int minFreqWaliKey = -1;
        for (int key : map.keySet()) {

            int currentKey = key;
            int currentKeykiFreq = map.get(key);
            if (currentKeykiFreq < minFreq) {
                minFreq = currentKeykiFreq;
                minFreqWaliKey = currentKey;
            }
        }
            return minFreqWaliKey;

//        for(int i : map.keySet()){
//            System.out.println(i+ "-> " + map.get(i));
//        }


    }

    static int[] getHighestLoewstFreq(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //map is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = 1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if(currentKeyFreq > highestFreq){
                highestFreq = currentKeyFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if(currentKeyFreq < lowestFreq){
                lowestFreq = currentKeyFreq;
                lowestNum = currentKey;
            }
        }

        int ans[] = {highestNum, lowestNum};
        return  ans;
    }



    static void main(){
        //int arr[] = {1,2,3,4,5,6};


        //reverseArray(arr);
//        shiftByK(arr,3);
//        for (int i : arr) {
//            System.out.print(i+" ");
//        }
       // printAlternate(arr);

    //int[] arr = {1,1,3,3,4,5,5,6,6,6,6};
//    int ans = getMode(arr);
//        System.out.println(ans);


//       int ans = minimumFreq(arr);
//        System.out.println(ans);

//        int ans[] = getHighestLoewstFreq(arr);
//        System.out.println("maximumFreq : "+ ans[0]);
//        System.out.println("minimumFreq : "+ ans[1]);



    }
}
