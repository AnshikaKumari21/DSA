import java.util.Scanner;
class StringMethods{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your fullname");
        String FullName=sc.nextLine();
        System.out.println("Enter your favourite programming language");
        String Language=sc.next();
        sc.nextLine();
        System.out.println("A sentence about your programming experince");
        String Experience=sc.nextLine();

        System.out.println("Full Name: "+FullName);
        System.out.println("Favourite language: "+Language);
        System.out.println("Your Experience: "+Experience);

        String[] nameParts=FullName.trim().split(" ",2);
        String firstName=nameParts[0];
        String lastName=(nameParts.length>1)?nameParts[1]:" ";

        System.out.println(firstName);
        System.out.println(lastName);

        int charCount=Experience.replace(" ","").length();
        System.out.println("Count total characters in the sentence (excluding spaces): "+charCount);

        String LanguageUpper=Language.toUpperCase();
        System.out.println(LanguageUpper);

        System.out.println("\n========== SUMMARY ==========");
        System.out.printf("%-20s : %s\n", "First Name", firstName);
        System.out.printf("%-20s : %s\n", "Last Name", lastName);
        System.out.printf("%-20s : %s\n", "Favourite Language", Language);
        System.out.printf("%-20s : %s\n", "Experience", Experience);
        System.out.printf("%-20s : %d\n", "Experience Length", charCount);
        System.out.println("=============================");

    }
}

