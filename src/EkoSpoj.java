public class EkoSpoj {

    static boolean isValidAns(int[] trees,int m,int mid){
        long totalWood = 0;
        for (int i = 0; i < trees.length; i++) {
            if(trees[i] > mid){
               long currentTreeKaWood = trees[i] - mid;
               totalWood += currentTreeKaWood;
            }
        }
        if(totalWood >= m){
            return true;
        }else{
            return false;
        }
    }

    public int maxSawHeight(int[] trees,int m){
        int n = trees.length;
        int start = 0;
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            if(trees[i] > maxi){
                maxi = trees[i];
            }
        }
        int end = maxi;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isValidAns(trees,m,mid)){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }

    void main(){
        int trees[] = {20,15,10,17};
        System.out.println(maxSawHeight(trees,7));
    }
}
