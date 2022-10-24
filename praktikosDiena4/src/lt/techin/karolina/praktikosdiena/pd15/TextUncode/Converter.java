package lt.techin.karolina.praktikosdiena.pd15.TextUncode;

public class Converter {

    public static String convertToHex(String text){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(Integer.toHexString(chars[i]));
        }
        return stringBuilder.toString();
    }
}
