package exeption.homeworks.homewok_2;

/**
 * Если необходимо, исправьте данный код
 */
public class Task_2 {
    private static void foo(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Catching exception: " + e);
        }
    }
}
