package day19_staticKeyword_passByValue;

import java.util.Arrays;

public class C07_PassByValue {

    public static void main(String[] args) {

        int[] arr = {10,12,23};

        // verilen array`in tum elementlerini 3 arttirip yazdiran bir method olusturun
        elemanlariArttir(arr);

        System.out.println("Method call`dan sonra arr : " + Arrays.toString(arr));
    }

    public static void elemanlariArttir(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
