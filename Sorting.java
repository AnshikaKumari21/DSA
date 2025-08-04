

public class Sorting {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};


       //bubble sort 
       //time complexity=O(n^2),   that means it's not a better way,we'll not use this in compition or anything
       /*for(int i=0; i<arr.length-1; i++) {
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }


       //printArray(arr);
   }*/

   //Selection sorting
   //time complexity=O(n^2);
    /*for(int i = 0; i < arr.length - 1; i++) {
            int smallest = i; // use i instead of 1
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);*/



        //Insertion Sorting
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            //placement
            arr[j+1]=current;
        } 
printArray(arr);

  }
}       
