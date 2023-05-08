package day21_dateTime_varags;

public class C10_Varargs {

    public static void main(String[] args) {

        islemYap(2, 4); // 2

        islemYap(4); // 0

        islemYap(2, 4, 5, 1, 2); // 8


    }

    public static void islemYap(int x, int... y) {

        System.out.println(x * y.length);
    }
}
