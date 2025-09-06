public class StringManipulation{
	public static void main(String[] args){
	// TODO: Create the same string "Java Programming" using 3
//different methods:
// 1. String literal

String a="Java Programming";

// 2. new String() constructor
String b=new String("Java Programming");

char[] charArray={'J','a','v','a' ,' ', 'P','r','o','g','r','a','m','m','i','n','g'};
String c=new String (charArray);

System.out.println(a);
System.out.println(b);
System.out.println(c);

// TODO: Compare the strings using == and .equals()
// Print the results and explain the difference

System.out.println(a==b);     //
System.out.println(b.equals(c));

// TODO: Create a string with escape sequences that displays:
// Programming Quote:
// "Code is poetry" - Unknown
// Path: C:\Java\Projects

String d=("Programming Quote:\n\t\"Code is poetry\" - Unknown\n\tPath: C:\\Java\\Projects");
System.out.println(d);

	}
}