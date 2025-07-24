import java.util.Scanner;
public class Functions{
    /*public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String name=sc.nextLine();

        printMyName(name);*/


//Make a function to add 2 numbers nd return the sum
/*public static int calcSum(int a, int b){
    int sum=a+b;
    return sum;
}
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    int sum=calcSum(a,b);
    System.out.println(sum);
}*/

//Make a function to multiply 2 numbers and return the product
/*public static int product(int a, int b){
    int prod=a*b;
    return prod;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int prod=product(a,b);
    System.out.println(prod);

}*/

//Find factorial of a number
/*public static void calcFact(int n){
    if(n<0){
        System.out.println("enter valid number");
        return;
    }
    int factorial=1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;
    }
    System.out.println(factorial);
    return;
}
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();

    calcFact(n);
}*/

//Enter 3 numbers from the user & make a function to print their average.
/*public static int calcAverage(int a,int b, int c){
    int sum=a+b+c;
    int average=sum/3;
    return average;
}
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    int result=calcAverage(a,b,c);
    System.out.println(result);
}*/

//Write a function to print the sum of all odd numbers from 1 to n.
/*public static int sumOdd(int n){
    int sum=0;
    for(int i=0;i<=n;i++){
        sum=sum+i;
    }
    return sum;
}
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int result=sumOdd(n);

    System.out.print(result);
}*/

//Write a function which takes in 2 numbers and returns the greater of those two.
public static void greaterNum(int a,int b){
    if(a>b){
        System.out.println("a is larger");
    }
    else{
        System.out.println("b is larger");
    }

    return;
}
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    greaterNum(a,b);
}

    }
