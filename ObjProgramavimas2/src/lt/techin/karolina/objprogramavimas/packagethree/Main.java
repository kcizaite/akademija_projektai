package lt.techin.karolina.objprogramavimas.packagethree;

public class Main {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        // Vienas is paveldejimo butu, per taskus - agregracija -> ne visai paveldejimas
        System.out.println(classB.classA.getName()); // print Java
        System.out.println(classB.toString()); // print ClassB{classA=ClassA{name='Java'}}
        System.out.println(classB.classA.toString()); // print ClassA{name='Java'}
    }
}
