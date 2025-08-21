//Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
import java.util.Scanner;
class gfg3{
    int SumOfSeries(int n){
        int sum=n*(n+1)/2;
        return sum*sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        gfg3 gfg=new gfg3();
        int result=gfg.SumOfSeries(n);
        System.out.print("the result is: "+result);

        

        
    

}
}