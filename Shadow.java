public class Shadow{
    static int x=90; //this will be shadow
    public static void main(String[] args) {
        System.out.println(x);//90
        int x;//the class variable at line 2 is shadowded by this
        x=40;
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);//90
    }
}


/*Shadowing occurs when a local variable or method parameter has the same name as an instance or class variable.
The local variable hides (or shadows) the outer one inside that scope.
