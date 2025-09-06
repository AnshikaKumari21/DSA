public class Min{
    public static void main(String[] args) {
        int[] arr={2,3,56,78,4};
        System.out.println(MinNum(arr));



    }

    static int MinNum(int[] arr){
        int MinVal=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<MinVal){
                MinVal=arr[i];
            }
        }
        return MinVal;


    }
    }

