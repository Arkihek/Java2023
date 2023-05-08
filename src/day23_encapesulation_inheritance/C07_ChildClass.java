package day23_encapesulation_inheritance;

public class C07_ChildClass extends C06_Parent{
    public static void main(String[] args) {

        C04_EncapsuleClass objBaskaClass = new C04_EncapsuleClass();
        System.out.println(objBaskaClass.publicStr);

        C07_ChildClass objKendiClass = new C07_ChildClass(); // kendi class`imdan olusturdugum obje
        System.out.println(objKendiClass.strPublic); // Parent Class strPublic
        System.out.println(objKendiClass.strDefault); // Parent Class strDefault
        System.out.println(objKendiClass.strProtected); // Parent Class strProtected
        // System.out.println(objKendiClass.strPrivate); // Access izin vermez private

        objKendiClass.strProtected = "Child da atanan deger";

        objKendiClass.protectedMethod(); // Parent class protectedMethod
        objKendiClass.defaultMethod(); // Parent class defaultMethod
        objKendiClass.publicMethod(); // Child class publicMethod -- kendi class`daki methodu kullandi parent class`da ayni isimde olmasina ragmen


    }
    public void publicMethod(){
        System.out.println("Child class publicMethod");
    }

}

/*
    Java`da child class`lar parent edinir
    Eger bir class`daki tum ozelliklere otomatik olarak sahip olmak(miraz edinmek) isterseniz
    o class`i extend keyword kullanarak PARENT EDINEBILIRSINIZ.

    Baska bir class`dan obje olusturarak o class`daki class uyelerini kullanmak
    INHERITANCE degildir.

    Bir child class access modifier goz onunde bulundurularak
    parent class`daki tum ozelliklere otomatik olarak sahip olur

    parent class`daki
    - private class uyeleri : INHERIT EDILEMEZ.
    - default class uyeleri : ANCAK AYNI PACKAGE ICINDEYSEK INHERIT EDILIR.
    - protected class uyeleri : HER YERDEN INHERIT EDILEBILIR.
    - public class uyeleri : HER YERDEN INHERIT EDILEBILIR.
                             Public olanlar sadece child class`lardan degil
                             tum class`lardan kullanilabilir.
      parent-child ilisikisi olan class`larda kullanilacak
      en ideal access modifier PROTECTED`dir.

      Parent-Child iliskisi iki durumda kullanilir
      1- Eger bir projeyi sifirdan olusturuyorsaniz
         tasarim asamasinda parent-child class`lari dusunup
         uygulamayi ona gore dusunebiliriz
         boylece reusability ve kolay maintenance saglanir.

      2- Sonradan bir class olusturuldugunda
         daha onceden olusturulmus bir class`daki
         tum ozelliklere sahip olmasi istenirse
         o class`a child yapabiliriz.

     - Bir child class parent class`daki tum ozelliklere otomatik olarak sahip olur.
     - Isterse parent class`daki ozelliklerden bazilarini kendisine uyarlar
     - Isterse de parent class`larinda olmayan yeni ozellikler ekleyebilir.
 */
