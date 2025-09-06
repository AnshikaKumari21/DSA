public class BinarySearch{
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,4,6,9,11,12,14};
        int target=12;
        int ans=Search(arr,target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find mid element
            //int mid=(start + end)/2;  this might be possible that this can exceed the range of int in java
            int mid=start + (end - start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //and found
                return mid;
            }

        }
        return -1;

    }
}
