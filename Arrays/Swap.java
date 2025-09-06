import java.util.Arrays;
public class Swap{
    public static void main(String[] args){
        int[] arr={2,90,56,7,5};
       // swap(arr, 0,4);
       reverse(arr);  //when we will reverse an array, not in simple swapping
       System.out.println(Arrays.toString(arr));

    }

//reverse of array
     static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
     }

    static void swap(int[] arr,int index0, int index4){
        int temp=arr[index0];
        arr[index0]=arr[index4];
        arr[index4]=temp;

    }

}