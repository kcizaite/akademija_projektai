package lt.techin.praktika1;

import java.text.DecimalFormat;

public class TemperatureConversion {
    private static final DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {
        double tempC = 24.00;
        double tempF = 140.00;

        tempFtoC(tempF);
        tempCtoF(tempC);
    }
    private static void tempCtoF(double tempC) {
        double tempCtoF = ((tempC * 1.8) + 32);
        System.out.println(df.format(tempCtoF) + " F"); // 75.2 F
    }
    private static void tempFtoC(double tempF) {
        double tempFtoC = ((tempF - 32) * 5/9);
        System.out.println(df.format(tempFtoC) + " C"); // 60 C
    }
}
