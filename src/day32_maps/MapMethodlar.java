package day32_maps;

import java.util.*;

public class MapMethodlar {

    // bu class`da static method`lar olusturalim ki
    // her yerden class ismiyle kullanabilelim

    // map ve ogrenci numarasi verdigimizde,
    // istenen formatta isim soyisim bilgisini
    // bize donduren bir method olusturalim

    public static String numaraIleOgrenciBulma(Map<Integer, String> ogrenciMap, int ogrenciNo) {

        // 1- Istenen numaraya ait value`yu kaydedelim
        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        // 2- Tek bir String olan value`yu bilgileri alabilmek icin split edelim
        String[] valueArray = ogrenciValue.split("-");

        // 3- istenen bilgileri alip, istenen formatta kaydedelim
        String isim = valueArray[0];
        String soyisim = valueArray[1];
        String formataUygunIsimSoyisim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase() +
                " " +
                soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).toLowerCase();

        return formataUygunIsimSoyisim;
    }

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;

    }

    public static void tumOgrenciListesiYazdir(Map<Integer, String> ogrenciMap) {

        // tum ogrencilerin isim ve soyisimlerini
        // bir liste olarak yazdirin
        // tum ogrencilere ulasabilmek icin, tum ogrencilerin key`lerine ihtiyacimiz var

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        // tum key`leri tek tek ele alip
        // o key`e ait isim ve soyismi, yukaridaki method`u kullanarak yazdiralim

        int siraNo = 1;
        for (Integer eachkey : ogrenciKeySet
        ) {

            // her bir key`e ait isim soyismi yazdiralim
            System.out.println(siraNo + "-" + numaraIleOgrenciBulma(ogrenciMap, eachkey));
            siraNo++;
        }
    }

    public static void istenenSiniftakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int sinif) {

        // Istenen siniftaki tum ogrencilerin isim ve soyisimlerini yazdirin


        // value`lari kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();

        // siniflari kontrol edip istenen siniftaki ogrencileri yazdirmak icin
        // her bir value`yu gozden gecirmeliyiz

        int siraNo = 1;
        for (String eachValue : valueCollection
        ) { // Ali-Can-11-H-MF

            // her bir value`yu split edip, class bilgisini kontrol etmeliyiz

            String[] eachValueArray = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // array`den sinif bilgisini kontrol edip
            // istenen sinif degerine esit ise
            // isim ve soyisim degerlerini yazdiralim


            if (eachValueArray[2].equals(sinif + "")) {
                System.out.println(siraNo + "-" + eachValueArray[0] + " " + eachValueArray[1] + " " + eachValueArray[2]);
                siraNo++;
            }
        }
    }

    public static void numaraAraligindakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
        // ogrenci numarasi verilen iki deger arasinda olan (sinir degerleri dahil)
        // tum ogrencilerin numara, isim, soyisim ve bolumlerini yazdirin

        // ogrencilerin numaralarina gore kontrol edebilmek icin tum key`lere ihtiyacim var

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]
        int siraNo = 1;
        for (Integer eachKey : ogrenciKeySeti
        ) { // 101 // 102 gibi tek tek alicak

            if (basNo <= eachKey && eachKey <= bitNo) {
                // istenen araliktaki key`ler buraya ulasir, ornegin 103
                // burada o key`e ait isim, soyisim ve bolume ulasmaliyiz

                String value = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

                String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]

                System.out.println(siraNo + " " +
                        eachKey + " " +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[4]);
                siraNo++;
            }
        }
    }

    public static Map<Integer, String> numaraIleSoyisimUpdateEt(Map<Integer, String> ogrenciMap, int ogrenciNo, String yeniSoyisim) {

        // 102 numarali ogrencinin value`sunu kaydet Veli-Cem-10-K-TM
        String value = ogrenciMap.get(ogrenciNo);

        // update yapabilmek icin bilgileri split etmeliyiz [Veli, Cem, 10, K, TM]
        String[] valueArr = value.split("-");

        // bu array`de soyisim olarak yeni soyismi atayabilirim [Veli, Han, 10, K, TM]
        valueArr[1] = yeniSoyisim;

        // bu array`deki guncel bilgileri value yapisina uygun olarak yeniden birlestirmeliyiz
        // Veli-Han-10-K-TM
        value = valueArr[0] + "-" +
                valueArr[1] + "-" +
                valueArr[2] + "-" +
                valueArr[3] + "-" +
                valueArr[4];

        // 102 numarali ogrenciyi yeni valuesu ile map`e ekleyelim
        ogrenciMap.put(ogrenciNo, value);
        // key`ler unique oldugu icin
        // varolan bir elemnti yeniden eklemek isterseniz
        // key varoldugu icin, eski value`yu silip, yeni value yapar

        return ogrenciMap;
    }

    public static void soyisimIleOgrenciYazdir(Map<Integer, String> ogrenciMap, String soyisim) {

        // verilen soyisme sahip tum ogrencileri yazdirin

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();
        int siraNo = 1;
        for (Integer eachKey : ogrenciKeySet
        ) {
            String[] eachArr = ogrenciMap.get(eachKey).split("-");
            if (soyisim.equalsIgnoreCase(eachArr[1])) {
                System.out.println(siraNo + "- " + Arrays.toString(eachArr));
                siraNo++;
            }
        }
    }

    public static void subeIleOgrenciYazdir(Map<Integer, String> ogrenciMap, String sube) {

        // verilen subedeki tum ogrencileri yazdirin

        Collection<String> valuesCollection = ogrenciMap.values();


        int siraNo = 1;
        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            if (valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(siraNo + "- " + Arrays.toString(valueArr));
                siraNo++;
            }
        }


    }

    public static void sinifVeSubeIleOgrenciYazdir(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        // verilen sinif ve subedeki tum ogrencileri yazdirin

        Collection<String> valuesCollection = ogrenciMap.values();

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(Arrays.toString(valueArr));
            }
        }
    }

    public static void numaraliTumOgrenciListesiYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();
        // [101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF]
        // Bu sekilde Map ile degil Set ile ugrasmis olucaz
        // tek bir for-each loop ile hem key`e hemde value`ye ulasabilecegiz

        // ogrenci listesini numara-isim-soyisim-sinif seklinde yazdirin
        System.out.println("No  Isim  Soyisim  Sinif");
        System.out.println("-------------------------");
        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {
            String ogrenciValuesu = eachEntry.getValue(); // 101=Ali-Can-11-H-MF
            String[] ogrenciValueArr = ogrenciValuesu.split("-"); // [Ali, Can, 11, H, MF]

            System.out.println(eachEntry.getKey() + " - " + ogrenciValueArr[0] + " - " + ogrenciValueArr[1] + " - " + ogrenciValueArr[2]);

        }
        //  101=Ali-Can-11-H-MF
        //  102=Veli-Cem-10-K-TM
        //  103=Ali-Cem-11-K-TM
        //  104=Ayse-Can-10-H-MF
        //  105=Sevgi-Cem-11-M-TM
        //  106=Sevgi-Can-10-K-MF
    }

    public static Map<Integer, String> yilSonuSinifArttir(Map<Integer, String> ogrenciMap) {

        // tum entry`leri ele almak icin bir entrySet olusturalim

        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();

        // ogrenciEntrySet`inde her bir entry`i ele alip
        // istenen update`i yapalim

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            // sinifi update edebilmek icin once value`u parcalayip
            // istenen bilgiye ulasalim

            String eachValue = eachEntry.getValue();
            String[] eachValueArr = eachValue.split("-");

            //istenen bilgiyi update edelim

            // array`de 2. index`deki sinif bilgisini
            // inceleyip gerekli update`i yapalim
            // 9-10-11 ise 1 arttir
            // 12 ise mezun yaz
            // mezun ise hic bir sey yapma
            if (!eachValueArr[2].equalsIgnoreCase("Mezun")) {
                Integer sinif = Integer.parseInt(eachValueArr[2]);
                if (sinif < 12) {
                    sinif++;
                    eachValueArr[2] = "" + sinif;
                } else {
                    eachValueArr[2] = "Mezun";
                }
            }
            // bilgi update edildikten sonra array`de yapilan degisikligin
            // map`e islenmesi icin, herbir entry`i update edelim
            eachEntry.setValue(eachValueArr[0] + "-" + eachValueArr[1] + "-" +
                    eachValueArr[2] + "-" + eachValueArr[3] + "-" + eachValueArr[4]);
        }
        return ogrenciMap;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {
        // soy isimleri buyuk harf

        // soyisim bilgisine ulasincaya kadar bol
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) { // 101=Ali-Can-11-H-MF
            String eachValue = eachEntry.getValue();
            String[] eachValueArr = eachValue.split("-");

            // soyisim bilgisini update et
            eachValueArr[1] = eachValueArr[1].toUpperCase();


            // soyismin yeni hali ile map`i update et
            eachEntry.setValue(eachValueArr[0] + "-" +
                    eachValueArr[1] + "-" +
                    eachValueArr[2] + "-" +
                    eachValueArr[3] + "-" +
                    eachValueArr[4]);

        }
        return ogrenciMap;
    }
}
