package day18_parametreliConstructor_constructorCall;

public class C03_Car {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 2018;
    int fiyat;

    public C03_Car() {

    }

    public C03_Car(int fyt, String mrk) {
        fiyat = fyt;
        marka = mrk;
    }

    public C03_Car(String mrk) {
        marka = mrk;
        // fiyat = 999000;
        // model = "Yerli ve Milli";
        // yil = 2023;
    }

    public C03_Car(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "C03_Car ==>" +
                " marka = " + marka +
                ", model = " + model +
                ", yil = " + yil +
                ", fiyat = " + fiyat;
    }
}
