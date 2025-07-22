
import java.util.Scanner;

class Loops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //For Loop
        //For(initialization;ondition;updation);
       for (int i = 0; i < 10; i++) {
            System.out.println(i+ " ");
        }
        
        //While Loop
        //while(condition){}
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        //Do While Loop
        //do{
        //}while(condition);

        int j=0;
        do { 
            System.out.println(j);
            j++;
        } while (j<10);
        
        //sum of first n numbers
        int n= sc.nextInt();
        int sum=0;
        for (int k = 1; k <= n; k++) {
            sum=sum+k;
            
        }
        System.out.println(sum);


        //table of a number input by user
        int num=sc.nextInt();
        //for(int i=1;i<=10;i++){
         //   System.out.println(i*n);
       // }
       int l=1;
       while(l<=10){
        System.out.println(l*num);
        l++;
       }


        
        }
        
        
        
        }

    

