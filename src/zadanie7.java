public class zadanie7 {
    //7. Пройдите в дебаге программу: Сколько раз вызывается метод str.length() ?
    public static void main(String[] args) {
        String str = "Hell";
        while (str.length()<10) {
            str = str + "o";
        }
        System.out.println("Ответ на задание  Метод str.length() выводится 14 раз.");
    }
}
