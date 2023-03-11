import java.util.Scanner;
//12. Пользователь вводит три строки, используя .substring(0, x) выведите эти строки, обрезав те, что длиннее самой короткой. Пример ввода: «повар», «поделка», «лампочка». Вывод: «повар», «подел», «лампо»

public class zadanie12 {
    //Источник инфо здесь: https://javarush.com/groups/posts/klass-scanner
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter Line 1: ");
        String strText1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter Line 2: ");
        String strText2 = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter Line 3: ");
        String strText3 = scanner3.nextLine();

        int len1 = strText1.length();
        int len2 = strText2.length();
        int len3 = strText3.length();

        if ((len1 <= len2) && (len2 <= len3)) { // т.е. строка 1 самая короткая
            String cutText2 = strText2.substring(0, len1);
            String cutText3 = strText3.substring(0, len1);

            System.out.println(strText1);
            System.out.println(cutText2);
            System.out.println(cutText3);

        } else {
            if ((len2 <= len1) && (len2 <= len3)) { // т.е. строка 2 самая короткая
                String cutText1 = strText1.substring(0, len2);
                String cutText3 = strText3.substring(0, len2);

                System.out.println(strText2);
                System.out.println(cutText1);
                System.out.println(cutText3);
            } else {
                if ((len3 <= len1) && (len3 <= len2)) { // т.е. строка 3 самая короткая
                    String cutText1 = strText1.substring(0, len3);
                    String cutText2 = strText2.substring(0, len3);

                    System.out.println(strText3);
                    System.out.println(cutText1);
                    System.out.println(cutText2);
                }
            }
        }
    }
}