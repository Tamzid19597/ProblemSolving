package LeetCodeTop150Qs;

public class ClimbingStairs_70 {
    static int climbStairs(int n) {
        if(n==0 || n==1) return n;
        int[]steps={1,2};
        int[]ways=new int[n+1];
        ways[0]=1;
        for(int i=1;i<n+1;i++){
            int way=0;
            for(int step:steps){
                if(i>=step)way+=ways[i-step];
            }
            ways[i]=way;
        }
        return ways[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
