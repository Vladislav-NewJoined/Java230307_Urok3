import java.util.Scanner;

public class zadanie2 {
    //2. Пользователь вводит строку, выведите ее длину
    public static void main(String[] args) {
        //Источник инфо здесь: https://javarush.com/groups/posts/klass-scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        int len = s.length();
        System.out.println(len);
    }
}