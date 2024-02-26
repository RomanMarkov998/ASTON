import java.util.Scanner;

public class Sravnenie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter string a: ");
        String a = scanner.nextLine();

        System.out.print("Enter string b: ");
        String b = scanner.nextLine();

        
        compareStrings(a, b);
    }

    private static void compareStrings(String a, String b) {
        
        if (a.equals(b)) {
            System.out.println("Strings are identical");
        } else {
            System.out.println("Strings are not identical");
        }
    }
}
