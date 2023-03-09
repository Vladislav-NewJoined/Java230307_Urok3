import java.util.Scanner;
//Пользователь вводит два числа. Разделить меньшее на большее и вывести результат.
public class zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        Double num1 = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter number 2: ");
        Double num2 = scanner2.nextDouble();

        if (num1 < num2) {
            System.out.println(num1 / num2);
                } else if (num1 > num2) {
            System.out.println(num2 / num1);
        } else if (num1.equals(num2)) {
            System.out.println("Entered numbers are equal.");
        }
    }
}