package group1.classwork.lesson5;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);
        if (!b) {
            System.out.println(" կոդը չի աշխատի");
        }
        if (b) {
            System.out.println(" կոդը կաշխատի");
        }
        System.out.println("10>9" + (10 > 9));
    }
}
