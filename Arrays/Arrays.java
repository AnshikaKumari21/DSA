import java.util.Scanner;
class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        /*int marks[]=new int [3];
        marks[0]=89;
        marks[1]=99;
        marks[2]=78;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }*/

//Take an array as input from user. Search for a given number and print it's index t which it occurs
/*int size=sc.nextInt();
int numbers[]=new int[size]; 
for(int i=0;i<size;i++){
    numbers[i]=sc.nextInt();

}

int x=sc.nextInt();

for(int i=0;i<numbers.length;i++){
    if(numbers[i]==x){
    System.out.println("x found at index "+i);
}

    }*/

//2D Arrays
/*int rows=sc.nextInt();
int cols=sc.nextInt();
int num[][]=new int[rows][cols];

for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        num[i][j]=sc.nextInt();
    }
}
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        System.out.print(num[i][j]+" ");
    }
    System.out.println();
}

//Take a matrix as input from user. Search for a given number x and print the indices at which it occurs
int r=sc.nextInt();
int c=sc.nextInt();
int matrix[][]=new int[r][c];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        matrix[i][j]=sc.nextInt();
    }
}
int x=sc.nextInt();

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        if(matrix[i][j]==x){
            System.out.println("x found at location (" + i + ", "+ j + ")");
        }

    }
}*/

int[][] arr =new int[3][3];
System.out.println(arr.length);
for(int rows=0;rows<arr.length;rows++){
    for(int cols=0;cols<arr[rows].length;cols++){
        arr[rows][cols]=sc.nextInt();
    }
    System.out.println();
}
for(int rows=0;rows<arr.length;rows++){
    //for(int cols=0;cols<arr[rows].length;cols++){
    //    System.out.print(arr[rows][cols]+" ");
    System.out.println(java.util.Arrays.toString(arr[rows]));
    }
    System.out.println();

//Enhanced for loop:


}
    }
//}