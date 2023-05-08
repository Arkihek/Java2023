package day25_inheritance;

public class FServisHemsiresi extends DHemsire{

    String str = "Servis Hemsiresi";
    int numara= 20;


    public static void main(String[] args) {

        FServisHemsiresi sh1 = new FServisHemsiresi();
        sh1.statikOlmayanMethod();

    }

    public void statikOlmayanMethod(){
        nobet(); // Servis hemsireleri haftada 3 gun nobet tutar
        this.nobet(); // Servis hemsireleri haftada 3 gun nobet tutar
        super.nobet(); // Hemsireler haftada 2 gun nobet tutar

        maas(); // Hemsire maasi : 2000
        this.maas(); // Hemsire maasi : 2000
        super.maas(); // Hemsire maasi : 2000

        calismaGunu(); // Servis hemsireleri haftada 4 gun calisir
        this.calismaGunu(); // Servis hemsireleri haftada 4 gun calisir
        // super.calismaGunu(); CTE

        String str = "Method";

        System.out.println(str); // Method
        System.out.println(this.str); // Servis Hemsiresi
        System.out.println(super.str); // Hemsire

        System.out.println(numara); // 20
        System.out.println(this.numara); // 20
        System.out.println(super.numara); // 30

        System.out.println(izinDemi); // false scope/class/parent
        System.out.println(this.izinDemi); // false class/parent
        System.out.println(super.izinDemi); // false parent

        char ilkHarf = 'J';
        System.out.println(ilkHarf); // J
        // System.out.println(this.ilkHarf); CTE
        // System.out.println(super.ilkHarf); CTE
    }

    public void nobet(){

        System.out.println("Servis hemsireleri haftada 3 gun nobet tutar");
    }

    public void calismaGunu(){

        System.out.println("Servis hemsireleri haftada 4 gun calisir");
    }


}
