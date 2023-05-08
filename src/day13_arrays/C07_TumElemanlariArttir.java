package day13_arrays;

import java.util.Arrays;

public class C07_TumElemanlariArttir {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini istenen deger kadar artirip
        // bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int artisMiktari = 5;

        arr = elemanlariArttir(arr,artisMiktari);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] elemanlariArttir(int[] arr,int artisMiktari){

        for (int i = 0; i < arr.length; i++) {
            arr[i] += artisMiktari;
        }
        return arr;
    }
}
