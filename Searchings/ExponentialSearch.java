import java.util.Collections;

public class ExponentialSearch {
    public int exponentialSearch(int[] array,int target){
        int bound = 1;
        while(bound<array.length && target>array[bound]){
            bound *= 2;
        }

        int left = bound/2;
        int right = Math.min(bound,array.length-1);
        return binarySearchRec(array,target,left,right);
    }
    private int binarySearchRec(int[] array,int target,int left,int right){
        if(left > right) return -1;
        var middle = (left+right)/2;

        if(array[middle] == target) return middle;
        else if(target < array[middle]) return binarySearchRec(array,target,left,middle-1);
        else return binarySearchRec(array,target,middle+1,right);
    }
}
