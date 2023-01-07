package BitwiseOperator;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class FlippingAnImage {
    public static void main(String[] args) {
        int [][]image={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[]row:image){
            for(int i=0;i<(image[0].length+1)/2;i++){
                int temp=row[i];
                row[i]=(row[(image[i].length)-i-1])^1;
                row[(image[i].length)-i-1]=temp^1;
            }
        }
        return image;
    }
}
