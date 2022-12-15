public class JumpSeach {
    public int jumpSearch(int[] array,int target){
        int blockSize = (int)Math.sqrt(array.length);
        int start = 0,next = blockSize;

        while(start<array.length && target>array[next-1]){
            start = next;
            next += blockSize;
            if(next > array.length) next = array.length;
        }

        for(int i=start; i<next; i++)
            if(array[i] == target) return i;
        return -1;
    }
}
