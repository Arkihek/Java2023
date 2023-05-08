package day22_stringBuilder_accessModifier;

public class C01_StringBuilder {

    public static void main(String[] args) {


        // StringBuilder sb1 = "Java";
        // non-primitive data turlerinde bir data turundeki bir degeri,
        // farkli data turundeki bir variable`a atayabilmek icin aralarinda
        // parent-child iliskisi olmalidir

        Object obj = "Java";
        Object obj2 = 23;
        Object obj3 = true;

        // 3 farkli sekilde StringBuilder olusturulabilir
        // Bu yontemler arasindaki fark capacity yani hafiza kullanimi ile ilgilidir


        StringBuilder sb2 = new StringBuilder("Java candir");

        System.out.println(sb2); // Java candir

        System.out.println(sb2.length()); // 11
        System.out.println(sb2.capacity()); // 27 = 11 + 16

        sb2.append(", buna inanmayan mi var"); // 23
        System.out.println(sb2);
        System.out.println(sb2.length()); // 34
        System.out.println(sb2.capacity()); // 56 = 27 * 2 + 2

        sb2.trimToSize();

        System.out.println(sb2.length()); // 34
        System.out.println(sb2.capacity()); // 34


    }
}
