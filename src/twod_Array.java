import java.util.ArrayList;
import java.util.List;

public class twod_Array {

    public List<Integer> rowSum(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m= arr.length;
        int n=arr[0].length;

        for(int row=0;row<m;row++){
            int sum = 0;
            for(int col=0;col<n;col++){
                int value = arr[row][col];
                sum += value;
            }
            result.add(sum);
        }
        return result;
    }

    public List<Integer> colSum(int[][] arr){

        List<Integer> result = new ArrayList<>();

        int m= arr.length;
        int n=arr[0].length;

//        for(int row=0;row<m;row++){
//            int sum = 0;
//            for(int col=0;col<n;col++){
//                int value = arr[col][row];
//                sum += value;
//            }
//            result.add(sum);
//        }

        for(int col=0;col<n;col++){
            int sum = 0;
            for(int row=0;row<m;row++){
                int value = arr[row][col];
                sum += value;
            }
            result.add(sum);
        }
        return result;
    }

    public List<Integer> wavePrint(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m= arr.length;
        int n=arr[0].length;

        for(int col=0;col<n;col++){

            if ((col & 1) == 1) {
                for (int row = m - 1; row >= 0; row--) {
                    result.add(arr[row][col]);
                }
            } else {
                for (int row = 0; row < m; row++) {
                    result.add(arr[row][col]);
                }
            }

        }
        return result;
    }

    public List<Integer> transposePrint(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m= arr.length;
        int n=arr[0].length;

        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                int value = arr[col][row];
                result.add(value);
            }
        }
        return result;
    }

    static int[][] transpose(int[][] arr){

        if(arr == null || arr.length == 0){
            return new int[0][0];
        }

        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int newtotalRows = totalCols;
        int newtotalCols = totalRows;

        int newArr[][] = new int[newtotalRows][newtotalCols];

        for(int row=0;row<totalRows;row++){
            for(int col=0;col<totalCols;col++){
                newArr[col][row] = arr[row][col];
            }
        }
        return newArr;
    }







    void main(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        List<Integer> list = rowSum(arr);
//        List<Integer> list = colSum(arr);
//        List<Integer> list = wavePrint(arr);
//        List<Integer> list = transposePrint(arr);
        int ans[][] = transpose(arr);


        for(int row=0;row<ans.length;row++){
            for(int col=0;col<ans[0].length;col++){
                System.out.print(ans[row][col]);
            }
            System.out.println();
        }
    }


}



