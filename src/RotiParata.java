public class RotiParata {


    static boolean isValidAns(int totalParata,int[] cooks,int totalcoks,int timeLimt){

        int parathaCount = 0;
        for (int i = 0; i < cooks.length; i++) {
            int currentcookRank = cooks[i];
            int timeTaken = 0;
            int j=1;
            while(timeTaken <= timeLimt){
                if(timeTaken + j*currentcookRank <= timeLimt){
                    timeTaken += j*currentcookRank;
                    parathaCount++;
                    j++;
                }else{
                    break;
                }
            }
            if(parathaCount >= totalParata){
                return true;
            }
        }
        if(parathaCount == totalParata){
            return true;
        }else{
            return false;
        }
    }


    public int minTimeToCookParatas(int p,int[] cook,int n){
        int maxRank = -1;
        for (int i = 0; i < cook.length; i++) {
            if(cook[i]>maxRank){
                maxRank = cook[i];
            }
        }
        int start = 0;
        int end = maxRank * (p*(p+1)/2);

        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isValidAns(p,cook,n,mid)){
                ans = mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return ans;

    }
    void main(){
        int rank[] = {1,2,3,4};
        System.out.println(minTimeToCookParatas(10,rank,4));
    }
}
