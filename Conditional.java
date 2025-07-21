import java.util.Scanner;
class Conditional{
    public static void main(String args[]){
        //if-else statement
        Scanner sc=new Scanner(System.in);
        /* int age=sc.nextInt();
        if(age<18){
            System.out.println("not eligible");
        }
        else{
            System.out.println("eligible");
        }*/

       //if-else if-else
       int a= sc.nextInt();
       int b=sc.nextInt();
       if(a==b){
        System.out.println("both are equal");
       }
       else if(a>b){
        System.out.println("a is greter");
       }
       else{
        System.out.println("b is greater");
       }



    }
}