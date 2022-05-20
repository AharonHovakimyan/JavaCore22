package group1.homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i])
                count++;
        }
        System.out.print(count);
        {
            System.out.println();
        }
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print(chars2[chars2.length / 2] + " ");
        System.out.print(chars2[chars2.length / 2 - 1] + " ");
        System.out.println();

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean a = true;
        boolean b = false;
        char d = 'l';
        char e = 'y';
        if (chars3[chars3.length - 2] == d && chars3[chars3.length - 1] == e) {
            System.out.println(a);
        } else
            System.out.println(b);
        System.out.println();


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a',};
        char g = 'b';
        boolean j = true;
        boolean k = false;
        for (int i = 0; i < bobArray.length; i++) {
            if (g == bobArray[i]) {
                System.out.println(j);
                break;
            } else {
                System.out.println(k);
            }
            System.out.println();
        }

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char space = text[0];
        for (int i = 1; i < text.length; i++) {
            if (space == text[i]) {
                System.out.print("");
            } else
                System.out.print(text[i]);

        }
    }
}



