public class TernarySearch {
    public int ternarySearchRec(int[] array,int target){
        return ternarySearchRec(array,target,0,array.length-1);
    }
    private int ternarySearchRec(int[] array,int target,int left,int right){
        if(left > right) return -1;

        int partitionSize = (right-left)/3;
        int mid1 = left+partitionSize;
        int mid2 = right-partitionSize;

        if(target == array[mid1]) return mid1;
        else if(target == array[mid2]) return mid2;
        else if(target < array[mid1])
            return ternarySearchRec(array,target,left,mid1-1);
        else if(target > array[mid2])
            return ternarySearchRec(array,target,mid2+1,right);
        else return ternarySearchRec(array,target,mid1+1,mid2-1);
    }

    public int ternarySearch(int[] array,int target){
        int left = 0,right = array.length-1;

        while(left <= right){
            var partitionSize = (right-left)/3;
            var mid1 = left+partitionSize;
            var mid2 = right-partitionSize;

            if(target == array[mid1]) return mid1;
            else if(target == array[mid2]) return mid2;
            else if(target < array[mid1]) right = mid1-1;
            else if(target > array[mid2]) left = mid2+1;
            else{
                left = mid1+1;
                right = mid2-1;
            }
        }
        return -1;
    }
}
