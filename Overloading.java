public class Overloading{
    public static void main(String[] args) {
        int a=89;
        String b="hello";
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun (String b){
        System.out.println(b);
    }
}
/*
Method Overloading = When two or more methods in the same class have:
-same name
-different parameter list (number or type of parameters)

👉 The compiler decides which method to call based on the arguments you pass.

