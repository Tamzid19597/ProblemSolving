package BinarySearch;

public interface MountainArray {
     int [] arr={1,2,3,4,5,6,4,3,2,1};
      default int get(int index){
         return arr[index];
     }
     default int length(){
          return arr.length;
     }
}
