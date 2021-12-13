// task 2
import java.util.Scanner;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");

            if (input.hasNextInt()) {
                int n = input.nextInt();
                System.out.println("Введите ваши элементы - каждый с новой строки:");
                int[] originArray = new int[n];
                if (input.hasNextInt()) {
                    for (int i = 0; i < n; i++) {
                        originArray[i] = input.nextInt();
                    }
                }  else {
                    System.out.println("Вы ввели не совсем число! Пожалуйста, повторите попытку.");

                }
                System.out.println("Оригинальное состояние массива: " + Arrays.toString(originArray));
                System.out.println("Введите число, равные ему элементы в массиве будут удалены");
                if (input.hasNextInt()) {
                    int NumToDel = input.nextInt();
                    int[] newArray = null;
                    for (int i = 0; i < originArray.length - 1; i++) {
                        if (originArray[i] == NumToDel) {                           // ищем элемент в исходном массиве, совпадающий по значению с числом, введенным пользователем
                            newArray = new int[originArray.length - 1];             // создаем новый массив с меньшей размерностью

                            System.arraycopy(originArray, 0, newArray, 0, i);                                    // копируем элементы в новый массив
                            if (originArray.length - 1 - i >= 0)
                                System.arraycopy(originArray, i + 1, newArray, i, originArray.length - 1 - i);    // смещаем элементы
                            break;
                        }
                    }
                    System.out.println("Ваш новый массив имеет вид: " + Arrays.toString(newArray));
                } else {
                    System.out.println("Вы ввели не число! Пожалуйста, повторите попытку.");

                }
            } else {
                System.out.println("Вы ввели нецелочисленное число! Пожалуйста, повторите попытку.");

            }

        input.close();

    }
}
