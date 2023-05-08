package day16_arrayList;

public class C08_ForEachLoop {
    public static void main(String[] args) {

        //Soru 2- Verilen int array’deki her elementin karelerini alip,
        //karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {3,5,4,3,4};
        arrKareToplami(arr);
    }
    public static void arrKareToplami(int[] arr){

        // array elementleri
        int toplam = 0;
        for (int each:arr
             ) {
            // elementlerin karelerinin toplami
            toplam += each*each;
        }
        System.out.println("Array`in elemanlarinin karelerinin toplami : " + toplam);

    }
}
