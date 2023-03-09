import java.util.Scanner;

public class zadanie10 {
    //10. Считайте boolean - переменную. Если пользователь ввел true, вывести “истина”, иначе ничего не стоит выводить.
    public static void main(String[] args) {
        System.out.print("Enter 'true' or false': ");
        Scanner scan = new Scanner(System.in);
        if (scan.nextBoolean() == true) {
            System.out.println("Истина");
        } else {
            scan.close();
        }
    }
}
