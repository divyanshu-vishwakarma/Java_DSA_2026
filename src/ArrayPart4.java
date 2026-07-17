import java.util.*;

public class ArrayPart4 {

    static int[] twoSum(int nums[], int target){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    static List<List<Integer>> threeSum(int[] nums, int target){

        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    // remove duplicate from sorted array
    static int removeDuplicate(int arr[]){
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(j < n){
            if(arr[i] == arr[j]){
                j++;
            }else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }

    static int getFirstRepetingEl(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        for(int i:arr){
            if(freq.get(i) > 1){
                return i;
            }
        }
        return -1;
    }

    static int pivotIndex (int arr[]){
        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        //fill left sum wala array
        leftSum[0] = arr[0];
        for(int i=1;i<n;i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        //fill right sum wala array
        rightSum[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        //check euality
        for(int i=0;i<n;i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }

    //find missing element an array of duplicates
    static List<Integer> findDisapearedNumber(int arr[]){
        List<Integer> ans = new ArrayList<>();
        //marking
        int n = arr.length;
        for(int index=0;index<n;index++){
            int value = Math.abs(arr[index]);
            int position = value - 1;
            //mark krenge ye position
            if(arr[position] > 0){
                arr[position] = - arr[position];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }



    static void main(){

//        int arr[] = {2,7,11,15};
//        int newarr[] = twoSum(arr,13);
//        System.out.println(newarr[0]);
//        System.out.println(newarr[1]);

//        int[] nums = {1, 0, -1, 2, -1, -4};
//        int target = 0;
//
//        List<List<Integer>> result = threeSum(nums, target);
//        System.out.println(result);

//        int arr[] = {1,2,3,4,3,5};
//        System.out.println(getFirstRepetingEl(arr));

//        int arr[] = {1,7,3,6,5,6};
//        System.out.println(pivotIndex(arr));


//        int arr[] = {1,2,4,2,5,5};
//        List<Integer> ans = findDisapearedNumber(arr);
//        System.out.println(ans);


    }


}
