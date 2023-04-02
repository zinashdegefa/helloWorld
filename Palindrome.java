import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String originalStr = "";

        while(!originalStr.equalsIgnoreCase("exit")){

             originalStr = scan.nextLine();

            System.out.println("Original string: " + originalStr);
            String reversedStr = "";
            for (int i = 0; i < originalStr.length(); i++) {
                reversedStr = originalStr.charAt(i) + reversedStr;
            }

            System.out.println("Reversed string: "+ reversedStr);

            if (originalStr.equalsIgnoreCase(reversedStr)) {
                System.out.println("Yes, " + originalStr + " is a palindrome");
            } else {
                System.out.println("No, " + originalStr + " is not a palindrome");
            }

        }

        System.out.println("See you soon!");
    }
}
