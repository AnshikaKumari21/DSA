import java.util.Arrays;  // 👈 import added

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 5);  // call without ...v:
        multiple(2,8,"hii","world","hey");
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int... v) { // varargs
        System.out.println(Arrays.toString(v)); // prints array properly
    }
}

/*
varargs = Variable-length arguments.

It lets a method take 0 or more arguments of the same type, without writing multiple overloads.
You can pass any number of arguments (even 0).
Internally, Java treats it as an array. (int... numbers → actually int[] numbers)
A method can have only one varargs parameter, and it must be the last one in the parameter list.

varargs lets you write one method that can handle many inputs instead of writing multiple methods.*/