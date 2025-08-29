

public class Max{
    public static void main(String[] args) {
        int[] arr={2,45,3,7,9};
        System.out.println(maxRange(arr,0,3));
        System.out.println(max(arr));
    }
    //when we want to find maximum between a range
    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[start];
        for(int i=start;i<end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    //when array is not an empty array
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}

