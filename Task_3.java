package exeption.homeworks.homewok_2;

import java.io.FileNotFoundException;

/**
 * Дан следующий код, исправьте его там, где требуется
 */
public class Task_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    /**
     * @throws FileNotFoundException Не понял что хотели сказать этим exception
     *                               т.к с файлами мы не работаем, я бы его убрал,
     *                               а если работем, то его надо будет обработать ещё одним catch
     */
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}
