package lt.techin.karolina.sablonai.patterns.singleton;

public class ClientOne{
    public void logging() {
        ProgramLogger.getProgramLogger().addLogInfo("First log message.." + ClientOne.class);
        ProgramLogger.getProgramLogger().addLogInfo("Second log message..." + ClientOne.class);
        ProgramLogger.getProgramLogger().addLogInfo("Third log message..." + ClientOne.class);
    }
}
