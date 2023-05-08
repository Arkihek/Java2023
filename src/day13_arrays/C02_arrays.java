package day13_arrays;

import java.util.Arrays;

public class C02_arrays {

    public static void main(String[] args) {

        /*
            Bir array`i yazdirmak ile elementlerini yazdirmak arasinda fark vardir.
            Bir array`i yazdirmak istersek Arrays.toString() ile yazdiririz.
            Standart olarak iki tarafinda koseli parantez olur
            aralarinda da virgul ve space olur.


            Elementleri yazdirmak istedigimizde ise loop kullaniriz
            ve nasil yazdiracagimiz bize bagli olur.
         */

        int[] arr = {2,4,6,8,1,3,8,2};

        // bu array`i yazdirin

        System.out.println(Arrays.toString(arr)); // [2, 4, 6, 8, 1, 3, 8, 2]

        // array`in tum elementlerini yan yana aralarinda - olacak sekilde yazdirin

        for (int i = 0; i < arr.length-1; i++) {

            System.out.print(arr[i] + "-"); // 2-4-6-8-1-3-8-

        }
        System.out.print(arr[arr.length-1]); // 2
    }
}
