package day14_arrays;

import java.util.Arrays;

public class C02_ElemanlariKaydirmaMethodu {

    public static void main(String[] args) {
        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]

        // 1- sondaki elemani gecici bir yere kaydet
        // 2- elemanlari saga kaydir
        // 3- son elemani basa yazdir

        int[] input = {4, 5, 6, 7};

        System.out.println(Arrays.toString(input)); // [4, 5, 6, 7]

        elemanlariSagaKaydir(input); // methodu kullanmak icin cagirdik

        System.out.println(Arrays.toString(input)); // [7, 4, 5, 6]

    }

    // methodun (makinenin) kendisi
    public static int[] elemanlariSagaKaydir(int arr[]) {

        // [4, 5, 6, 7]

        // 1 - array`in son elemanini kaydet. Length kullanarak dinamik yapin
        int gecici = arr[arr.length - 1]; // son eleman index lenght-1

        // 2- dinamik olarak butun elemanlari saga kaydir
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        // 3- kaydedilen gecici elemani basa koy
        arr[0] = gecici;

        return arr; // updated (degistirilen) method`un cagirildigi yere dondurulur
    }


}
