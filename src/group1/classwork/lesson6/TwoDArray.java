package group1.classwork.lesson6;

public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][2];
        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < 2; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i <4 ; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}




