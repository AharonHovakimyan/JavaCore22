package group1.homework.arrayutil;

import sun.util.resources.ParallelListResourceBundle;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 10, 8, 32, 7, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        double sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        System.out.println("sum -> " + sum);
        {
            double avg = sum / array.length;
            System.out.println(avg);
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
        int count0fEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count0fEvens++;
        }
        System.out.print(count0fEvens);

        int count0fodds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                count0fodds++;
        }
        System.out.println();
        System.out.println(count0fodds);
    }
}