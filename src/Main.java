import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        // объявление массивов
        int[] box1 = new int[3];
        box1[0] = 1;
        box1[1] = 2;
        box1[2] = 3;
        float[] b = new float[]{1.57f, 7.654f, 9.986f};
        boolean[] c = new boolean[]{false, true, true, false};

        // распечатать массивы
        for (int j = 0; j < box1.length; j++) {
            if (j == box1.length - 1) {
                System.out.println(box1[j]);
            } else {
                System.out.print(box1[j] + " ,");
            }
        }
        for (int v = 0; v < b.length; v++) {
            if (v == b.length - 1) {
                System.out.println(b[v]);
            } else {
                System.out.print(b[v] + " ,");
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.println(c[i]);
            } else
                System.out.print(c[i] + " ,");
        }
        // распечатать наоборот
        System.out.println("  ");
        for (int j = box1.length - 1; j > 0; j--) {
            System.out.print(box1[j] + " ,");
        }
        System.out.println(box1[0]);
        for (int j = b.length - 1; j > 0; j--) {
            System.out.print(b[j] + " ,");
        }
        System.out.println(b[0]);
        for (int j = c.length - 1; j > 0; j--) {
            System.out.print(c[j] + " ,");
        }
        System.out.println(c[0]);

        //нечётное в чётное
        System.out.println("  ");
        for (int j = 0; j < box1.length; j++) {
            if (box1[j] % 2 != 0) {
                box1[j] = box1[j] + 1;
            }
        }
        for (int j = 0; j < box1.length; j++) {
            if (j == box1.length - 1) {
                System.out.println(box1[j]);
            } else
                System.out.print(box1[j] + " ,");
        }
        int[] arr = generateRandomArray();

        // Сумма за месяц
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        System.out.println("сумма трат за месяц составила : " + summ + "рублей");

        //минимум и максимум
        int minimum = arr[0];
        int maksimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
            if (maksimum < arr[i]) {
                maksimum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила : " +
                 minimum + " рублей");
        System.out.println("Максимальная сумма трат за месяц составила : " +
                maksimum + " рублей");

        //среднее значение трат
        int summ1 = 0;
        for (int i = 0; i < arr.length; i++) {
            summ1 = summ1 + arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила :" +
                " " + (summ1/ arr.length) +"рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

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