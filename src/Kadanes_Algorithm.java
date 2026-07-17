public class Kadanes_Algorithm {

    public int maxSubArray(int nums[]){
        int n =nums.length;
        int sum =0;
        int maxSum =Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            //step 1
//          sum = sum + nums[i];
            sum += nums[i];

            //step 2
//            if(sum > maxSum){
//                maxSum = sum;
//            }
            maxSum = Math.max(maxSum, sum);

            //step3
            if(sum < 0){
                sum =0;
            }
        }

        return maxSum;
    }






    void main(){

        //int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        //int arr[] = {5,4,-1,7,8};
        int arr[] = {1};
        System.out.println(maxSubArray(arr));
    }
}
