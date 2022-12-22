package exeption.homeworks.homewok_2;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
    }
    private static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while (!input.matches("-?\\d*?.\\d+")) {
            System.out.print("Enter float number: ");
            input = scanner.nextLine();
        }
        return Float.parseFloat(input);
    }
}
