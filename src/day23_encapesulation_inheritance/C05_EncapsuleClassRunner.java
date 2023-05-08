package day23_encapesulation_inheritance;

public class C05_EncapsuleClassRunner {
    public static void main(String[] args) {

        C04_EncapsuleClass obj = new C04_EncapsuleClass();
        obj.publicStr = "Java zupa";
        System.out.println(obj.publicStr);

        obj.setPrivateStr("Her seyi dusunmusler"); // write
        System.out.println(obj.getPrivateStr()); // read --- Her seyi dusunmusler

        /*
            Bir class uyesini private yapip
            hem getter hem setter method`u olusturmak ile

            o class uyesini public yapmak arasinda islev acisindan BIR FARK YOKTUR

            Bazi developer`lar public yapmak yerine
            private yapip getter setter olusturmayi tercih ederler
            buradaki temel amac public oldugunda yapilamayan bir islemi yapmak DEGIL
            atama ve okuma islemlerine VURGU YAPMAKTIR.
         */
    }
}
