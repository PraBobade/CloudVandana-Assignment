import java.util.Scanner;

public class Roman_Number {

    public static int getValue(char romanChar) {
        return switch (romanChar) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = getValue(currentChar);
            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = getValue(nextChar);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number (CAPITAL ONLY..!): ");
        String UserNum = scanner.nextLine();
        scanner.close();

        int Result = romanToInt(UserNum);
        System.out.println("Roman numeral: " + UserNum);
        System.out.println("Integer value: " + Result);
    }
}
