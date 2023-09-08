import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Условие:
 * На вход подается число n.
 * Задача:
 * Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
 * Обоснуйте выбор парадигм.
 * <p>
 * Для реализации поставленной задачи принял решение использовать процедурное программирование,
 * так как:
 * 1. Процедурный поход позволяет использовать код повторно;
 * 2. При расширении функциональности скрипта код сохранит читаемость;
 * 3. Логика выполнения скрипта разделена по независящим друг от друга блокам;
 * 4. Происходит сокрытие функционала скрипта (инкапсуляция логики скрипта);
 * 5. Просто это удобнее и логичнее, чем длинная портянка :) ;
 */
public class HomeWork {
    /**
     * Точка входа в программу
     *
     * @param args
     */
    public static void main(String[] args) {
        printMultiTable(getNum());
    }

    /**
     * Печать талицы умножения
     *
     * @param num целое число от 1 до 10 включительно
     */
    private static void printMultiTable(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }

    /**
     * Получение числа от пользователя через консоль
     * в промежутке от 1 до 10 включительно
     *
     * @return целое число
     */
    private static int getNum() {
        int num = 0;
        final String MESSAGE = "Введено некорректное число!";
        while (num == 0) {
            System.out.print("Введите число от 1 до 10: ");
            try {
                Scanner scanner = new Scanner(System.in);
                num = scanner.nextInt();
                if (num < 1 || num > 10) {
                    System.out.println(MESSAGE);
                    num = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println(MESSAGE);
                num = 0;
            }
        }
        return num;
    }
}