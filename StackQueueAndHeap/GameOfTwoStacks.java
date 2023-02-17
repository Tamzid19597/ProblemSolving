package StackQueueAndHeap;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
public class GameOfTwoStacks {
    class Result {
        public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
            return twoStacks(maxSum,a,b,0,0)-1;
        }
        static int twoStacks(int maxSum,List<Integer> a, List<Integer> b,int count,int sum){
            if (sum>maxSum)return count;
            if (a.isEmpty()||b.isEmpty())return count;
            int firstCombination=twoStacks(maxSum,a.subList(1,a.size()),b,count+1,a.get(0)+sum);
            int secondCombination=twoStacks(maxSum,a,b.subList(1,b.size()),count+1,b.get(0)+sum);
            if (firstCombination>secondCombination)return firstCombination;
            return secondCombination;
        }

    }
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int g = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, g).forEach(gItr -> {
                try {
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                    int n = Integer.parseInt(firstMultipleInput[0]);

                    int m = Integer.parseInt(firstMultipleInput[1]);

                    int maxSum = Integer.parseInt(firstMultipleInput[2]);

                    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList());

                    List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList());

                    int result = Result.twoStacks(maxSum, a, b);
                    System.out.println(result);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            bufferedReader.close();
        }
}
