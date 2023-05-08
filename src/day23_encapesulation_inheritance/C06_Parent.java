package day23_encapesulation_inheritance;

public class C06_Parent {

    private int toplamSatisTutari;
    String strDefault = "Parent Class strDefault";
    protected String strProtected = "Parent Class strProtected";
    public String strPublic = "Parent Class strPublic";

    private void privateMethod(){
        System.out.println("Parent class private method");

    }
    void defaultMethod(){
        System.out.println("Parent class defaultMethod");
    }
    protected void protectedMethod(){
        System.out.println("Parent class protectedMethod");
    }
    public void publicMethoc(){
        System.out.println("Parent class publicMethoc");
    }

    public static void main(String[] args) {
        C06_Parent obj = new C06_Parent();
        System.out.println(obj.strProtected); // child`daki atama burayi etkilemez.
    }
}
