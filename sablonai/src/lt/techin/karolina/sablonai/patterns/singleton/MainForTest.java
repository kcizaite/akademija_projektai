package lt.techin.karolina.sablonai.patterns.singleton;

public class MainForTest {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger().toString()); // print lt.techin.karolina.sablonai.patterns.singleton.ProgramLogger@2133c8f8
        System.out.println(ProgramLogger.getProgramLogger().toString()); // print lt.techin.karolina.sablonai.patterns.singleton.ProgramLogger@2133c8f8
        System.out.println(ProgramLogger.getProgramLogger().toString()); // print lt.techin.karolina.sablonai.patterns.singleton.ProgramLogger@2133c8f8
        ClientOne c1 = new ClientOne();
        c1.logging();
        ClientTwo c2 = new ClientTwo();
        c2.logging();
        ProgramLogger.getProgramLogger().showLogInfo();
    }
}
// PRINT
// This is a log file ...
// First log message..class lt.techin.karolina.sablonai.patterns.singleton.ClientOne
// Second log message...class lt.techin.karolina.sablonai.patterns.singleton.ClientOne
// Third log message...class lt.techin.karolina.sablonai.patterns.singleton.ClientOne
// First log message..class lt.techin.karolina.sablonai.patterns.singleton.ClientTwo
// Second log message...class lt.techin.karolina.sablonai.patterns.singleton.ClientTwo
// Third log message...class lt.techin.karolina.sablonai.patterns.singleton.ClientTwo
