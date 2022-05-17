package group1.homework.arrayutil;

import sun.util.resources.ParallelListResourceBundle;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 10, 8, 32, 7, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int number = 0;
        for (int j = 0; j < array.length; j++) {
            number += array[j];
        }
        System.out.println("գումարը = " + number);
        double number1 = 0;
        for (int k = 0; k < array.length; k++) {
            number1 += array[k] / array.length;
        }
        System.out.println("գումարը = " + number1);


        for (int u = 0; u < array.length; u++) {
            if (array[0] <= 2)
                if (array[1]<=4)
                if (array[2]<=10)
                    System.out.println(array[u] / 2);
        }
        System.out.print(array[0] + " ");
        System.out.print(array[2] + " ");
        System.out.print(array[3] + " ");
        System.out.print(array[4] + " ");
        System.out.print(array[6] + " ");
        System.out.print(array[7] + " ");
        System.out.print(array[8] + " ");
        System.out.print(array[9] + " ");
        System.out.print( " զույգ թվեր ");

        System.out.println();
        System.out.print(array[1] + " ");
        System.out.print(array[5] + " ");
        System.out.print(" կենտ թվեր");

    }
}




