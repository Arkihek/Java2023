package day24_inheritance;

public class Corolla extends BToyota {
    String uretimYeri = "Turkiye";
    String lastik = "Corolla araclar pirelli 205-60-16 lastik kullanir";
    String model = "Corolla";
        public void hiz(){
            System.out.println("Corolla araclar max 240 km hiz yapar");
    }

    public void guvenlik(){
        System.out.println("Corolla araclar 12 hava yastigi kullanir");
    }

    public static void main(String[] args) {
        Corolla corolla1 = new Corolla();
        System.out.println(corolla1.uretimYeri); // C Turkiye
        System.out.println(corolla1.lastik); // C Corolla araclar pirelli 205-60-16 lastik kullanir
        System.out.println(corolla1.model); // C Corolla
        System.out.println(corolla1.marka); // B Toyota
        System.out.println(corolla1.tekerSayisi); // A 4
        corolla1.hiz(); // C Corolla araclar max 240 km hiz yapar
        corolla1.guvenlik(); // C Corolla araclar 12 hava yastigi kullanir
        corolla1.aku(); // B Toyota araclar inci aku kullanir
    }
}
