public class BSProblems {

    static int findElNearlySortedArray(int[] arr,int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            if(mid-1 >= 0 && arr[mid-1] == target){
                return mid - 1;
            }

            if(arr[mid] == target){
                return mid;
            }

            if(mid+1 >= 0 && arr[mid+1] == target){
                return mid + 1;
            }

            if(arr[mid]>target){
                end = mid - 2;
            }else{
                start = mid + 2;
            }
        }
        return -1;
    }

    public int singleNonDuplicate(int[] arr){
        int n = arr.length;
        int s = 0;
        int e =n-1;
        while(s<=e){
            int mid = s+(e-s)/2;

            int currValue = arr[mid];
            int prevValue = -1;
            if(mid-1 >= 0){
                prevValue = arr[mid-1];
            }

            int nextValue = -1;
            if(mid+1 < n){
                nextValue = arr[mid+1];
            }

            if(currValue!=prevValue && currValue!=nextValue){
                return arr[mid];
            }

            if(currValue!=prevValue && currValue==nextValue){
                int startingIndexOfPair = mid;
                if((startingIndexOfPair & 1)==1){
                    e = mid -1;
                }else{
                    s = mid+1;
                }
            }
            else if(currValue==prevValue && currValue!=nextValue){
                int endingIndexOfPair = mid;
                if((endingIndexOfPair & 1) == 1){
                    s = mid+1;
                }else{
                    e = mid -1;
                }
            }
        }
        return -1;
    }

    static boolean searchInMatrix(int[][] arr,int target){
        int totalRow = arr.length;
        int totalCol = arr[0].length;

        int n = totalRow * totalCol;
        int s = 0;
        int e = n-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            int rowIndex = mid/totalCol;
            int colINdex = mid%totalCol;

            if(arr[rowIndex][colINdex] == target){
                return true;
            } else if (arr[rowIndex][colINdex] > target) {
                e = mid -1;
            }else{
                s = mid+1;
            }
        }
        return false;

    }

    static boolean searchInMatrixII(int[][] arr,int target){
        int totalRow = arr.length;
        int totalCol = arr[0].length;

        int row =0;
        int col = totalCol-1;

        while(row<totalRow && col >= 0){
            if(arr[row][col] == target){
                return true;
            } else if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }




    void main(){
//        int arr[] = {3,5,10,9,11};
//        System.out.println(findElNearlySortedArray(arr,10));

//        int arr[] = {10,10,20};
//        System.out.println(singleNonDuplicate(arr));

//        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        System.out.println(searchInMatrix(arr,13));

//        int arr[][] = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
//        System.out.println(searchInMatrixII(arr,19));


    }


}
