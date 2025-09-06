import java.util.Arrays;
public class Linear2D{
    public static void main(String[] args){
        int[][] arr={{1,2,3},{6,7,8},{9,11,12}};
        int target=11;
        int[] ans= arrSearch(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] arrSearch(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target){
                return new int[]{i,j};
            }
        }
        
    }
    return new int[]{-1,-1};
}

//for max in 2D
static int max(int[][] arr){
    int max=Integer.MIN_VALUE;
    for(int[] ints: arr){
        for(int elements:ints){
            if(elements>max){
                max=elements;
            }

        }
    }
    return max;

}
}