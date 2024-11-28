import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy számot:");
        int inputNumber = scanner.nextInt();

        String output = IntegerToRoman(inputNumber);
        System.out.println("A megadott szám ("+ inputNumber + ") római alakja: " + output);
    }

    public static String IntegerToRoman(int number)
    {
        StringBuilder roman = new StringBuilder();
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        for (int i = 0; number > 0; i++) {
            while (number >= numbers[i])
            {
                roman.append(romanNumbers[i]);
                number -= numbers[i];
            }
        }
        return roman.toString();
    }

}