import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        boolean isValid = false;

        do {
            System.out.println("Adjon meg egy számot 1 és 4000 között:");

            String input = scanner.nextLine();

            try {
                inputNumber = Integer.parseInt(input);

                if (inputNumber >= 1 && inputNumber <= 4000) {
                    isValid = true;
                } else {
                    System.out.println("1 és 4000 közötti számot adjon meg.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Érvénytelen bemenet. Kérjük, számot adjon meg.");
            }
        } while (!isValid);


        String output = integerToRoman(inputNumber);
        System.out.println("A megadott szám (" + inputNumber + ") római alakja: " + output);

        scanner.close();
    }

    public static String integerToRoman(int number) {
        StringBuilder roman = new StringBuilder();
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; number > 0; i++) {
            while (number >= numbers[i]) {
                roman.append(romanNumbers[i]);
                number -= numbers[i];
            }
        }

        return roman.toString();
    }

}