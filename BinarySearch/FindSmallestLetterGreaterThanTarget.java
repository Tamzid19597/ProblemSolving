package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/ {problem url}
public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] letters={'b','d','f'};
        System.out.println(nextGreatestLetter(letters,'c'));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid;
        while(start<=end){
            mid=start+((end-start)/2);
            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(start>-1 && start<letters.length){
            return letters[start];
        }
        return letters[0];
    }
}
