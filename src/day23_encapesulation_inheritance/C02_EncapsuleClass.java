package day23_encapesulation_inheritance;

public class C02_EncapsuleClass {

    private int satisTutari;
    private int toplamSatisTutari;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    // buraya private class uyesine
    // read veya write yetkisi olan
    // 2 farkli method olusturalim

    // satisTutari baska class`dan write edilebilsin

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;

    }

    // toplamSatisTutari baska class`dan read edilebilsin

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }
}
