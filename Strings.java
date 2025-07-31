import java.util.Scanner;
public class Strings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /* String name=sc.next();
        System.out.println(name);

        String fullName=sc.nextLine();
        System.out.print(fullName);*/

//Concatenation
/*String firstName="tony";
String secondName="strak";
String FullName=firstName + secondName;
System.out.println(FullName);

//charAt
for(int i=0;i<FullName.length();i++){
    System.out.println(FullName.charAt(i));
}
*/
//Compare
/*String name1="tony";
String name2="Tony";
if(name1.compareTo(name2)==0){
    System.out.println("Strings are equal");
}
else{
    System.out.println("Strings are not equal");
}

//SubString
String sentence="hello, this is Anshika";
String s=sentence.substring(11,sentence.length());       //.substring(starting index, ending index +1)
System.out.println(s);*/


//String Builder
/*StringBuilder sb=new StringBuilder("Tony");
System.out.println(sb);

System.out.println(sb.charAt(0));

sb.setCharAt(0,'P');
System.out.println(sb);

sb.insert(2,'n');
System.out.println(sb);

sb.delete(1,3);
System.out.println(sb);

StringBuilder bs=new StringBuilder("h");
bs.append("e");
bs.append("y");
System.out.println(bs);*/


//reverse of String
StringBuilder x=new StringBuilder ("hello");
for(int i=0;i<x.length()/2;i++){
    int front=i;
    int back=x.length()-1-i;

    char frontChar=x.charAt(front);
    char backChar=x.charAt(back);

    x.setCharAt(front, backChar);
    x.setCharAt(back,frontChar);
}

System.out.println(x);



}        
    }
