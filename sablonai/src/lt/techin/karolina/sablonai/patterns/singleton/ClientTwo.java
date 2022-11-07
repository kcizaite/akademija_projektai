package lt.techin.karolina.sablonai.patterns.singleton;

public class ClientTwo {
    public void logging() {
        ProgramLogger.getProgramLogger().addLogInfo("First log message.." + ClientTwo.class);
        ProgramLogger.getProgramLogger().addLogInfo("Second log message..." + ClientTwo.class);
        ProgramLogger.getProgramLogger().addLogInfo("Third log message..." + ClientTwo.class);
    }
}
