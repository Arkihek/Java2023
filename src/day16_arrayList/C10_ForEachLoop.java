package day16_arrayList;

public class C10_ForEachLoop {
    public static void main(String[] args) {

        // bir array icindeki sayilardan 5`ten buyuk olanlari toplayalim

        int[] arr = {5,6,7,8,1,2,3,4,6,7,8,11,14,15,7,4,12,17};
        int toplam = 0;

        // for each loop kullandigimizda 3 unsura dikkat etmek gerekiyor
        // Her bir elementin data type ( int )
        // her bir elemente ortam isim ( each )
        // elementlerin geldigi kaynak ( arr )


        for (int each:arr
             ) {
            if (each>5){
                toplam += each;
            }
        }
        System.out.println(toplam);
    }
}
