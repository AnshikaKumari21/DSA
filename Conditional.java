import java.util.Scanner;
class Conditional{
    public static void main(String args[]){
        //if-else statement
        Scanner sc=new Scanner(System.in);
         int age=sc.nextInt();
        if(age<18){
            System.out.println("not eligible");
        }
        else{
            System.out.println("eligible");
        }

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

      //Switch case
      int button=sc.nextInt();
      switch(button){
        case 1 : System.out.println("Namste");
        break;
        case 2 : System.out.println("Hello");
        break;
        case 3 : System.out.println("Bonjour");
        break;

      }

     //Making calculator by using switch case
     int c=sc.nextInt();
     int d=sc.nextInt();
     int operation=sc.nextInt();
     switch(operation){
        case 1: System.out.println(c+d);
        break;
        case 2: System.out.println(c-d);
        break;
        case 3: System.out.println(c*d);
        break;
        case 4: System.out.println(c/d);
        break;
        case 5: System.out.println(c%d);
        break;
     }



    }
}