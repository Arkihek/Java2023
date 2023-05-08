package day26_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar {
    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

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
                ilk bulunan METHOD GECERLI OLUR.

            -   eger cons ve data type farkli ise
                Aramaya dataType secilen class`dan baslariz.
                ANCAK method bulununca hemen CALISTIRILMAZ
                data type secilen class`dan
                constructor kullanilan class`a dogru kontrol yapilir.
                o method`un en guncel hali calistirilir.

         */


        FAvciKuslar avciKus1 = new FAvciKuslar();

        avciKus1.cogalma(); // kus - yumurtayla cogalirlar
        avciKus1.beslenme(); // avci - et yerler
        avciKus1.kanat(); // kus - kanatlidirlar
        avciKus1.omur(); // Hayvan - yasar ve olurler
        avciKus1.gaga(); // avci - sivri gagali
        avciKus1.hareket(); // avci - ucarlar
        avciKus1.pence(); // avci - pencelidir
        avciKus1.solunum(); // kus - akcigerle nefes alirlar

        System.out.println("************");

        EKuslar avciKusGiller = new FAvciKuslar();

        avciKusGiller.cogalma(); // kus - yumurtayla cogalirlar
        avciKusGiller.beslenme(); // avci - et yerler
        avciKusGiller.kanat(); // kus - kanatlidirlar
        avciKusGiller.omur(); // Hayvan - yasar ve olurler
        avciKusGiller.gaga(); // avci - sivri gagali
        avciKusGiller.hareket(); // avci - ucarlar
        // avciKusGiller.pence(); // CTE - kuslar ve hayvanlarda pence olmadigi icin CTE verir.
        avciKusGiller.solunum(); // kus - akcigerle nefes alirlar

        System.out.println("************");

        DHayvan avciHayvanGiller = new FAvciKuslar();

        avciHayvanGiller.cogalma(); // kus - yumurtayla cogalirlar
        avciHayvanGiller.beslenme(); // avci - et yerler
        // avciHayvanGiller.kanat(); // CTE - hayvanlarda kanat olmadigi icin CTE verir.
        avciHayvanGiller.omur(); // Hayvan - yasar ve olurler
        // avciHayvanGiller.gaga(); // CTE - hayvanlarda gaga olmadigi icin CTE verir.
        avciHayvanGiller.hareket(); // avci - ucarlar
        // avciHayvanGiller.pence(); // CTE - hayvanlarda pence olmadigi icin CTE verir.
        avciHayvanGiller.solunum(); // kus - akcigerle nefes alirlar
        System.out.println("*************");

        DHayvan hayvan1 = new DHayvan();

        hayvan1.cogalma(); // hayvan - cogalirlar
        hayvan1.beslenme(); // hayvan - beslenirler
        // hayvan1.kanat(); // CTE - hayvanlarda kanat olmadigi icin CTE verir.
        hayvan1.omur(); // Hayvan - yasar ve olurler
        // hayvan1.gaga(); // CTE - hayvanlarda gaga olmadigi icin CTE verir.
        hayvan1.hareket(); // hayvan - hareket ederler
        // hayvan1.pence(); // CTE - hayvanlarda pence olmadigi icin CTE verir.
        hayvan1.solunum(); // hayvan - nefes alirlar
        System.out.println("***********");

        EKuslar kus1 = new EKuslar();

        kus1.cogalma(); // kus - yumurtayla cogalirlar
        kus1.beslenme(); // hayvan - beslenirler
        kus1.kanat(); // kus - kanatlidirlar
        kus1.omur(); // Hayvan - yasar ve olurler
        kus1.gaga(); // kus - gagalari vardir
        kus1.hareket(); // hayvan - hareket ederler
        // kus1.pence(); // CTE - hayvanlarda ve kuslarda pence olmadigi icin CTE verir.
        kus1.solunum(); // kus - akcigerle nefes alirlar

        System.out.println("************");

        DHayvan kusHayvanGiller = new EKuslar();

        kusHayvanGiller.cogalma(); // kus - yumurtayla cogalirlar
        kusHayvanGiller.beslenme(); // hayvan - beslenirler
        // kusHayvanGiller.kanat(); // CTE - hayvanlarda kanat olmadigi icin CTE verir.
        kusHayvanGiller.omur(); // Hayvan - yasar ve olurler
        // kusHayvanGiller.gaga(); // CTE - hayvanlarda gaga olmadigi icin CTE verir.
        kusHayvanGiller.hareket(); // hayvan - hareket ederler
        // kusHayvanGiller.pence(); // CTE - hayvanlarda pence olmadigi icin CTE verir.
        kusHayvanGiller.solunum(); // kus - akcigerle nefes alirlar

    }
}
