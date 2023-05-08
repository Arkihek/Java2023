package day26_inheritanceDataTypeKullanimi_overriding;

public class CAvciKuslar extends BKuslar {
    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";

    public static void main(String[] args) {

        /*
            Asagidaki 3 obje`de ayni constructor`i kullanmistir
            yani 3`u de avci kustur.
            Ama data turu farkli secildigi icin
            ozellikleri farkli olur.

            Bir obje olusturulurken
            -   eger cons ve data turu ayni ise
                o class`a gidilir
                aranan ozellik varsa kullanilir,
                yoksa parent class`lara da bakilir
                ilk bulunan VARIABLE GECERLI OLUR.

            -   cons ve data turu farkli ise
                obje constructor olan class`dan olusturulsa da
                ozelliklerin data turu olan class`daki gibi olmasini isteriz
                bir VARIABLE`IN degerini aramaya
                DATA TURU OLAN CLASS`DAN baslanir

            Bir obje olusturulurken data type constractor`dan farkli ise
            tum variable`lari DataType olan class`a gore DUSUNMELIYIZ.


         */

        CAvciKuslar avci1 = new CAvciKuslar();

        System.out.println("avci1.beslenme = " + avci1.beslenme); // avci - et yerler
        System.out.println("avci1.gaga = " + avci1.gaga); // avci - sivri gagali
        System.out.println("avci1.cogalma = " + avci1.cogalma); // kus - yumurtayla cogalirlar
        System.out.println("avci1.kanat = " + avci1.kanat); // kus - kanatlidirlar
        System.out.println("avci1.hareket = " + avci1.hareket); // avci - ucarlar
        System.out.println("avci1.pence = " + avci1.pence); // avci - pencelidir
        System.out.println("avci1.solunum = " + avci1.solunum); // kus - akcigerle nefes alirlar
        System.out.println("avci1.omur = " + avci1.omur); // hayvan - yasar ve olurler

        System.out.println("************");

        BKuslar avciKusGiller = new CAvciKuslar();
        // avciKuslar is-a kuslar

        System.out.println("avci1.beslenme = " + avciKusGiller.beslenme); // hayvan - beslenirler
        System.out.println("avci1.gaga = " + avciKusGiller.gaga); // kus - gagalari vardir
        System.out.println("avci1.cogalma = " + avciKusGiller.cogalma); // kus - yumurtayla cogalirlar
        System.out.println("avci1.kanat = " + avciKusGiller.kanat); // kus - kanatlidirlar
        System.out.println("avci1.hareket = " + avciKusGiller.hareket); // hayvan - hareket ederler
        // System.out.println("avci1.pence = " + avciKusGiller.pence); // CTE cunku tum kuslarda veya hayvanlarda pence ozelligi yok
        System.out.println("avci1.solunum = " + avciKusGiller.solunum); // kus - akcigerle nefes alirlar
        System.out.println("avci1.omur = " + avciKusGiller.omur); // hayvan - yasar ve olurler

        System.out.println("*********");


        AHayvan avciHayvanGiller = new CAvciKuslar();
        // avciKuslar is-a Hayvan

        System.out.println("avci1.beslenme = " + avciHayvanGiller.beslenme); // hayvan - beslenirler
        // System.out.println("avci1.gaga = " + avciHayvanGiller.gaga); // CTE cunku tum hayvanlarda gaga ozelligi yok
        System.out.println("avci1.cogalma = " + avciHayvanGiller.cogalma); // hayvan - cogalirlar
        // System.out.println("avci1.kanat = " + avciHayvanGiller.kanat); // CTE cunku tum hayvanlarda kanat ozelligi yok
        System.out.println("avci1.hareket = " + avciHayvanGiller.hareket); // hayvan - hareket ederler
        // System.out.println("avci1.pence = " + avciKusGiller.pence); // CTE cunku tum hayvanlarda pence ozelligi yok
        System.out.println("avci1.solunum = " + avciHayvanGiller.solunum); // hayvan - nefes alirlar
        System.out.println("avci1.omur = " + avciHayvanGiller.omur); // hayvan - yasar ve olurler


    }
}
