import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/29
 * Time: 20:30
 * Description: No Description
 */
public class ESpiraMatrixIi59 {

    public static void print(int[][] ints){
        for (int i=0;i<ints.length;i++){
            for (int j=0;j<ints[i].length;j++){
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ESpiraMatrixIi59 eSpiraMatrixIi59=new ESpiraMatrixIi59();
        Solution s=eSpiraMatrixIi59.new Solution();

        print(s.generateMatrix(5));
        print(s.generateMatrix(6));
//        print(s.generateMatrix(0));
        print(s.generateMatrix(1));

    }

    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] res=new int[n][n];
            int loop=n/2;
            int startX=0,startY=0;
            int i=0,j=0;
            int right=n;//左闭右开
            int left=0;
            int val=1;
            int down=n;
            int up=0;
            while (loop>0){

                //左到右
                for (;j<right-1;j++){
                    res[i][j]=val++;
                }
                right--;

                //上到下
                for (;i<down-1;i++){
                    res[i][j]=val++;
                }
                down--;

                //右到左
                for (;j>left;j--){
                    res[i][j]=val++;
                }
                left++;
                //下到上
                for (;i>up;i--){
                    res[i][j]=val++;
                }
                up++;
                i++;j++;
                loop--;
            }

            if (n%2==1)res[n/2][n/2]=val;
            return res;
        }
    }
}
