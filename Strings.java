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
String name1="tony";
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
System.out.println(s);

}        
    }
