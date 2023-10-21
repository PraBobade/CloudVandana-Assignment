import java.util.Scanner;

public class Pangram {

    public static boolean isPangram(String InputTxt) {
        InputTxt = InputTxt.toLowerCase();

// Sixty zippers were quickly picked from the woven jute bag

        boolean[] present = new boolean[26];

        for (int i = 0; i < InputTxt.length(); i++) {
            char ch = InputTxt.charAt(i);

            if ('a' <= ch && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }
        for (boolean isPresent : present) {
            if (!isPresent) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence : " );
        String UserInput = scanner.nextLine();
        scanner.close();

        if(isPangram(UserInput)){
            System.out.println(isPangram(UserInput)+" : The Sentence is Pangram");
        }else{
            System.out.println(isPangram(UserInput)+" : The Sentence is NOT Pangram");
        }

    }
}
