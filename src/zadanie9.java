import java.util.Scanner;

public class zadanie9 {
    //9. Пользователь вводит строку. Используя substring, вывести первые 5 символов.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the line: ");
        String str = scanner.nextLine();
        String fragmentStr = str.substring(0, 5);
        System.out.print("Fragment of line: " + fragmentStr);
    }
}