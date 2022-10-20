package lt.techin.karolina.objprogramavimas.packagetwo;

public class Class3 {
    private String n1 = "Class3: private";
    String n2 = "Class3: default";
    protected String n3 = "Class3: protected";
    public String n4 = "Class3: public";

    public void incap(){
        Class2 c2 = new Class2(); // Same package
//        System.out.println(c2.n1); // private - sito nepasiekia
        System.out.println(c2.n2); // default
        System.out.println(c2.n3); // protected
        System.out.println(c2.n4); // public
    }
}
