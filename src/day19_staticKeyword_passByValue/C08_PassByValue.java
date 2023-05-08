package day19_staticKeyword_passByValue;

import java.util.Arrays;

public class C08_PassByValue {

    public static void main(String[] args) {

        int[] arr = {3,5,7};

        // verilen array`e 4. bir element olarak
        // 10 ekleyip, o halini eski array`e kaydedip yazdiran bir method olusturun
        elemanEkle(arr);

        System.out.println("method call`dan sonra arr : " + Arrays.toString(arr));

        /*
            Birden fazla eleman barindiran
            array, list gibi java objelerinde
            java method`a yollarken
         */
    }

    public static void elemanEkle(int[] arr){
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = 10;

        arr = arr2;

        System.out.println(Arrays.toString(arr));
    }
}
