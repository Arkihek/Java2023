package day13_arrays;

public class C05_ArraydekiEnBuyukSayiyiBulma {

    public static void main(String[] args) {

        int[] arr = {12, 2, 4, 6, 5, 1, 3, 1, 8, 6, 15, 25};

        //Verilen int array`deki en buyuk sayiyi bize donduren bir method olusturun

        System.out.println(enBuyukSayi(arr));

    }

    public static int enBuyukSayi(int[] arr) {

        int enBuyukSayi = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > enBuyukSayi) {
                enBuyukSayi = arr[i];
            }
        }
        return enBuyukSayi;
    }
}
