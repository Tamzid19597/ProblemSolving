package Recursion;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num=14;
        System.out.println(numberOfSteps(num));
    }
    static int numberOfSteps(int num) {
        int steps=0;
        return numberOfStepsHelper(num,steps);
    }
    static int numberOfStepsHelper(int num,int steps){
        if(num==0)return steps;
        if(num%2==0)return numberOfStepsHelper(num/2,steps+1);
        else return numberOfStepsHelper(num-1,steps+1);
    }
}
