import java.util.Scanner;

public class zadanie4 {
    //4. Пользователь вводит три строки. Найти, какая из них короче всех.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String s = scanner.nextLine();
        int x = s.length();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите строку 2: ");
        String s2 = scanner2.nextLine();
        int y = s2.length();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите строку 3: ");
        String s3 = scanner3.nextLine();
        int z = s3.length();

        if ((x < y) && (x < z)) {
            System.out.println("min длина: Строка 1");
        } else {
            if ((y < x) && (y < z)) {
                System.out.println("min длина: Строка 2");
            } else {
                System.out.println("min длина: Строка 3");
            }
        }
    }
}