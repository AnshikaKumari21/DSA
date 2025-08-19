

class Recursion{

//Print number 5 to 1
    /*public static void printNum(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }

    public static void main(String[] args) {
        int n=1;
        printNum(n);

    }*/


//Print number 1 to 5
    /*public static void printNum(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        printNum(n);

    }*/

//Print sum of n natural numbers
/*public static void printSum(int n, int i, int sum){
    if(n==1){
        sum+=i;
        System.out.println(sum);
        return;
    }

    sum+=i;
    printSum(i+1, n, sum);

}
public static void main(String[] args){
    printSum(1,5,0);
}*/

//Factorial of n number
/*public static int calcFact(int n){
    if(n==1||n==0){
        return 1;
    }
    int fact_nm1 = calcFact(n-1);
    int fact_n=n*fact_nm1;
    return fact_n;
}
public static void main(String[] args){
    int n=5;
    int ans=calcFact(n);
    System.out.println(ans);
}*/

//Fibonacci series using nth term
public static int calcFibo(int n){
    
}

}

