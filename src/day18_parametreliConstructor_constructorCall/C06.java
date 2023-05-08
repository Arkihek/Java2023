package day18_parametreliConstructor_constructorCall;

public class C06 {

    C06(){
        System.out.println("Parametresiz Constructor");
    }

    C06(int sayi){
        // C06(); Java bu sekilde yazimi method call kabul eder
        // yani constructor`lar cons. ismi yazilarak CAGIRILAMAZ

        this();
        // bir constructor`in icinde baska bir constructor`i calistirmak istersek
        // this(istenen argumentler) yazariz
        System.out.println("int parametreli Constructor");
    }

    C06(String str){
        this(3);
        System.out.println("String parametreli Constructor");
    }

    public static void main(String[] args) {
        C06 obj =new C06("Java");
    }

}
