public class BinarySearch {
    public int binarySearchRec(int[] array,int target){
        return binarySearchRec(array,target,0,array.length-1);
    }
    private int binarySearchRec(int[] array,int target,int left,int right){
        if(left > right) return -1;
        var middle = (left+right)/2;

        if(array[middle] == target) return middle;
        else if(target < array[middle]) return binarySearchRec(array,target,left,middle-1);
        else return binarySearchRec(array,target,middle+1,right);
    }

    public int binarySearch(int[] array,int target){
        int left = 0,rigth = array.length-1;

        while(left <= rigth){
            var middle = (left+rigth)/2;
            if(array[middle] == target) return middle;
            else if(target < array[middle]) rigth = middle-1;
            else left = middle+1;
        }
        return -1;
    }
}
