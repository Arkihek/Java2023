package day14_arrays;

import java.util.Arrays;

public class C01_ElemanlariKaydirma {
    public static void main(String[] args) {

        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]

     int[] arr = {4,5,6,7};
     int[] arr2 = new int[4];


        System.out.println(Arrays.toString(arr)); // [4, 5, 6, 7]
        System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0]

        // 1 - son elemani gecici bir yere kaydet

        int geciciKayitYeri = arr[3];
        arr[3] = arr[2];
        arr[2] = arr[1];
        arr[1] = arr[0];

        System.out.println(Arrays.toString(arr)); // [4, 4, 5, 6]

        arr[0] = geciciKayitYeri;

        System.out.println(Arrays.toString(arr));

    }
}
