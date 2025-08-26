public class Scope{
    public static void main(String[] args){
    int a=10;
    int b=20;
    {
       // int a=78;   alreay initialized outside the block inn the same method, cannot initialized again
        a=100;//can change or modify it
        System.out.println(a);
        int c=12;//values initialise in the block , will remain in the block
        System.out.println(c);
    }
    //System.out.println(c);   cannot print outside the block
    System.out.println(a);
    int c=90;//outside the block it doesn't recognize C initialized above so we can initialized

    //Scoping in for loops
    for(int i=0;i<4;i++){
        System.out.println(i);
        int num=90;
        System.out.println(i);
        //int a=10; anything that is initialized outside the block cannot initialized again inside the block but anything initialized inside the block can defenietly initialized outside the block
    }
    //System.out.println(i); cannot print ooutside
 }
     static void random(int marks) {
        int num=67;
        System.out.println("num is "+num);
        System.out.println("marks is" +marks);
        
    }
}

/*Scope refers to the region of the program where a variable (or method/class) is accessible.
Local Scope:-
A variable declared inside a method, constructor, or block.

It can only be used inside that method/block.

Instance (Object) Scope:-
Variables declared inside a class but outside any method (i.e., instance variables).

They are tied to an object.

Class (Static) Scope:-
Declared with the static keyword.

Shared among all objects of the class.

Block Scope:-
Variables declared inside {} brackets exist only within those braces*/