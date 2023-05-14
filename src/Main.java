import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Задача 4");
        /*В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали
 отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
 Данные с именами сотрудников хранятся в виде массива символов — char[ ].
 Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
 В качестве данных для массива используйте:
 char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
 В результате в консоль должно быть выведено: Ivanov Ivan.
 Важно: не используйте дополнительные массивы для решения этой задачи.
 Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.*/
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int j = reverseFullName.length - 1;
        int k = 0;

        for (int i = 0; i < reverseFullName.length/2; i++) {

            char x = reverseFullName[k];
            char y = reverseFullName[j];

            reverseFullName[k] = y;
            reverseFullName[j] = x;

            j--;
            k++;
        }
        System.out.println(Arrays.toString(reverseFullName));
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        /*Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        Напишите программу, которая посчитает среднее значение трат за месяц
        (то есть сумму всех трат за месяц поделить на количество дней),
        и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.*/
        int[] arr = generateRandomArray();
        double rez = 0d;
        for (int el : arr) {
            rez = (rez + el);
        }
        rez = rez  / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " +
                new DecimalFormat("###,###.##").format(rez) + " рублей");
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        /*Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».*/
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int max = 0;
        int counter;
        for (counter = 0; counter < arr.length; counter++) {
            if (max < arr[counter]) {
                max = arr[counter];
            }
        }
        int min = max;
        for (counter = 0; counter < arr.length; counter++) {
            if (min > arr[counter]) {
                min = arr[counter];
            }
        }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");
        /*Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Напишите программу, которая решит эту задачу, и выведите в консоль
        результат в формате: «Сумма трат за месяц составила … рублей».*/
        int[] arr = generateRandomArray();
        int rez = 0;
        for (int el : arr) {
            rez = rez + el;
        }
        System.out.println("Сумма трат за месяц составила " +
                new DecimalFormat("###,###").format(rez) + " рублей");
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}





