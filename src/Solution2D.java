import java.util.ArrayList;
import java.util.List;

public class Solution2D {
    public void rotate90ClockWise(int[][] matrix, int N){

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int row=0;row<N;row++){
            int stCol = 0;
            int endCol = N-1;
            while (stCol <= endCol){
                int temp = matrix[row][stCol];
                matrix[row][stCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                stCol++;
                endCol--;
            }
        }
    }

    public List<Integer> spiralOrder(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result  = new ArrayList<>();

        int stRow = 0;
        int endRow = m-1;
        int stCol = 0;
        int endCol = n-1;

        while(stRow <= endRow && stCol <= endCol){

            //row wise left to right -> starting row print karni hai, from stcol to endcol
            for(int col = stCol; col<=endCol; col++){
                result.add(matrix[stRow][col]);
            }
            stRow++;

            //col wise top to bottom -> ending col print karna hai, from strow to endrow
            for(int row = stRow; row<=endRow; row++){
                result.add(matrix[row][endCol]);
            }
            endCol--;

            //row wise right to left -> ending row print karni hai, from endcol to stcol
            if(stRow <= endRow) {
                for (int col = endCol; col >= stCol; col--) {
                    result.add(matrix[endRow][col]);
                }
                endRow--;
            }

            //col wise bottom to top -> strating col print karna hai, from endrow to strow
            if(stCol <= endCol){
                for(int row = endRow; row>=stRow; row--){
                    result.add(matrix[row][stCol]);
                }
                stCol++;
            }


        }

        return result;

    }




    void main(){
          int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        rotate90ClockWise(arr,3);
//
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[0].length;col++){
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }


        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);



    }
}
