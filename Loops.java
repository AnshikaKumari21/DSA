
import java.util.Scanner;

class Loops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //For Loop
        //For(initialization;ondition;updation);
      /* for (int i = 0; i < 10; i++) {
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
       }*/


//Pattern Problems
for(int a=1;a<=4;a++){
    for(int b=1;b<=5;b++){
        System.out.print("*");

    }
    System.out.println("*");
}
//******
//******
//******
//******

for(int c=1;c<=4;c++){
    for(int d=1;d<=5;d++){
        if(c==1||d==1||c==4||d==5){
            System.out.print("*");
        }                                    
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
//*****
//*   *
//*   *
//*****

/*for(int e=1;e<=4;e++){
    for(int f=1;f<=e;f++){
            System.out.print("*");
        }
        System.out.println();
    }*/

//*
//**
//***
//****
for(int e=4;e>=1;e--){
    for(int f=1;f<=e;f++){
            System.out.print("*");
        }
        System.out.println();
    }

//****
//***
//**
//*

for(int g=1;g<=4;g++){
    for(int h=1;h<=4-g;h++){
        System.out.print(" ");
    }
    for(int l=1;l<=g;l++){
    System.out.print("*");
    }
    System.out.println();
}
//   *
//  **
// ***
//****

for(int m=1;m<=5;m++){
    for(int n=1;n<=m;n++){
        System.out.print(n);
    }
    System.out.println();
}
//1
//12
//123
//1234
//12345

for(int o=1;o<=5;o++){
    for(int p=1;p<5-o+1;p++){
        System.out.print(p);
    }
    System.out.println();
}
//12345
//1234
//123
//12
//1

int number=1;
for(int q=1;q<=5;q++){
    for(int r=1;r<=q;r++){
        System.out.print(number+" ");
        number++;
    }
    System.out.println();
}
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 
for(int s=1;s<=5;s++){
    for(int t=1;t<=s;t++){
        int sum=s+t;
        if(sum%2==0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
    System.out.println();
}
//1
//01
//101
//0101
//10101

}
    }     
        
        
        
        
        

    

