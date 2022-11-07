package lt.techin.karolina.sablonai.patterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger; // Taip mes neleidziame kurti objekto, tampa vienas vienintelis
    private String logFile = "This is a log file ... \n";

    private ProgramLogger() { // Vienas ir nepakartojamas
    }

    public static ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

//    Prideti zinute metodas
    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }
//    Parodyti zinute metodas
    public void showLogInfo(){
        System.out.println(logFile);
    }
}
