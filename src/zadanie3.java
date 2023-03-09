import java.util.Scanner;

public class zadanie3 {
    //3. Пользователь вводит две строки, выведите сумму их длин
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String s = scanner.nextLine();
        int len = s.length();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите строку 2: ");
        String s2 = scanner2.nextLine();
        int len2 = s2.length();
        int x = len + len2;
        System.out.println("Сумма длин Ваших строк: " + x);

    }
}