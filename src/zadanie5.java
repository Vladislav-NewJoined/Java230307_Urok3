import java.util.Scanner;

public class zadanie5 {
    //5. Пользователь вводит три дробных числа. Вывести те из них, квадратный корень которых меньше 2.
    public static void main(String[] args) {

        Scanner scannerX = new Scanner(System.in);
        System.out.print("Please enter x: ");
        double x = scannerX.nextDouble();

        Scanner scannerY = new Scanner(System.in);
        System.out.print("Please enter y: ");
        double y = scannerY.nextDouble();

        Scanner scannerZ = new Scanner(System.in);
        System.out.print("Please enter z: ");
        double z = scannerZ.nextDouble();

        System.out.println("Переменные, при которых выполняется условие (кв. корень меньше 2-х): ");

        {
            if (Math.sqrt(x) < 2) {
                System.out.println("x");
            }
            if (Math.sqrt(y) < 2) {
                System.out.println("y");
            }
            if (Math.sqrt(z) < 2) {
                System.out.println("z");
            }
        }
        if ((Math.sqrt(x) >= 2) && (Math.sqrt(y) >= 2) && (Math.sqrt(z) >= 2)) {
            System.out.println("Среди введённых, переменные, при которых выполняется условие, отсутствуют.");
        }
    }
}
