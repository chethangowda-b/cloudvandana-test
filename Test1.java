import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String roman = sc.next();
        int result = romanToInt(roman);
        System.out.println("The integer equivalent of " + roman + " is: " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanCharToInt(s.charAt(i));

            if (i < s.length() - 1) {
                int nextVal = romanCharToInt(s.charAt(i + 1));
                if (currentVal < nextVal) {
                    result += (nextVal - currentVal);
                    i++; // Skip the next character as it's already considered.
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Invalid Roman numeral character
        }
    }
}

