import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class zadanie11 {
//11. Пользователь вводит 3 числа. Сделайте три boolean переменных: есть ли среди введённых четное, есть ли среди введённых отрицательное, есть ли число больше тысячи
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x: ");
        int x = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter y: ");
        int y = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter z: ");
        int z = scanner.nextInt();
        boolean check1 = (x % 2 == 0);
        boolean check2 = (y % 2 == 0);
        boolean check3 = (z % 2 == 0);
        boolean check4 = (x < 0);
        boolean check5 = (y < 0);
        boolean check6 = (z < 0);
        boolean check7 = (x > 1000);
        boolean check8 = (y > 1000);
        boolean check9 = (z > 1000);
            if (check1 == true) {
                System.out.println("x - even number.");
            }
            if (check2 == true) {
                System.out.println("y - even number.");
            }
            if (check3 == true) {
                System.out.println("z - even number.");
            }
            if (check4 == true) {
                System.out.println("x - is a negative number.");
            }
            if (check5 == true) {
                System.out.println("y - is a negative number.");
            }
            if (check6 == true) {
                System.out.println("z - is a negative number.");
            }
            if (check7 == true) {
                System.out.println("x - is a more than 1000.");
            }
            if (check8 == true) {
                System.out.println("y - eis a more than 1000.");
            }
            if (check9 == true) {
                System.out.println("z - is a more than 1000.");
            }
    }
}