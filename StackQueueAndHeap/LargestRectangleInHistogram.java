package StackQueueAndHeap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class LargestRectangleInHistogram {
    static int largestRectangleArea(int[] heights) {
        HashSet<Integer> hashSet=new HashSet<>();
        int[]leftBarArea=new int[heights.length];
        int[]rightBarArea=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            int area=heights[i];
            for(int j=i-1;j>=0;j--){
                if(heights[i]==heights[j]){
                    area+=leftBarArea[j];
                    break;
                }
                else if(heights[i]<heights[j])area+=heights[i];
                else break;
            }
            leftBarArea[i]=area;
        }
        for(int i=heights.length-1;i>=0;i--){
            int area=0;
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]==heights[j]){
                    area+=rightBarArea[j];
                    break;
                }
                else if(heights[i]<heights[j])area+=heights[i];
                else break;
            }
            rightBarArea[i]=area;
        }
        for(int i=0;i<heights.length;i++){
            hashSet.add(rightBarArea[i]+leftBarArea[i]);
        }
        return  Collections.max(hashSet);
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(largestRectangleArea(arr));
        System.out.println();
    }
}
