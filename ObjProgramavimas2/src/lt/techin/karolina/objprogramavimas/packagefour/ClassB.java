package lt.techin.karolina.objprogramavimas.packagefour;

public class ClassB extends ClassA { // tikrasis paveldejimas EXTENDS
    // reikia ALT ENTER, kad nebutu paraudonave ir sukurti

    private int age = 25;

    public ClassB(String name, int age) {
        super(name); // super bus, nes turi tureti jeigu jau paveldejo tai
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override // @ tai anotacija, mechanizmas kuris privercia priverstinai atsisakyti classA ir imti classB
    public String toString() {
        return "ClassB{" +
                "age=" + age +
                '}';
    }

//    public String toString(int age){
//        return "Labas"; // print Main'e ClassA{name='Daina'}
//    }
}
