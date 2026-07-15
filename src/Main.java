import java.util.HashSet;

public class Main {

    static void shiftBy1(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }

    static void rotateByK(int arr[], int k) {
        int n = arr.length;
        k = k % n;   // Handle k > n

        for (int i = 0; i < k; i++) {
            shiftBy1(arr);
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static void getUnion(int arr1[], int arr2[]){
        HashSet<Integer> union = new HashSet<>();

        for (int num : arr1) {
            union.add(num);
        }

        for (int num : arr2) {
            union.add(num);
        }

        System.out.println("Union: " + union);
    }

    static void getIntersection(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Intersection: " + intersection);
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        //getUnion(arr1,arr2);
        getIntersection(arr1,arr2);
        //rotateByK(arr, 2);
    }



}