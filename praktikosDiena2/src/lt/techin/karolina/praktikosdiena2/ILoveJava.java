package lt.techin.karolina.praktikosdiena2;

// JavaFindCharDublicates
public class ILoveJava {
    private final static int MAX_CHAR_NUMBER = 256; // Nes cia byte skaiciuojam.... 65535 jeigu noreciau dar lt kalba skaiciuot

    public static void main(String[] args) {
        String text = "I like Java!";
        System.out.println(text);
//        String text = new String(data);
//        String allChars = Arrays.toString(data.toCharArray());
//        System.out.println(allChars);
//        int countNumber = ;
        countDublicates(text);
//        for (int i = 0; i < allChars.length(); i++) {
//            allChars[i] = countNumber;
    }

    //        System.out.println(countNumber);
//    }
    private static void countDublicates(String text) {
        int[] emptyCharArray = new int[MAX_CHAR_NUMBER];
        countCharacters(text, emptyCharArray);
        for (int i = 0; i < MAX_CHAR_NUMBER; i++) {
            if (emptyCharArray[i] >= 1) {
                System.out.printf("%c -> %d\n", i, emptyCharArray[i]);
            }
        }
    }

    private static void countCharacters(String text, int[] emptyCharArray) {
        for (int i = 0; i < text.length(); i++) {
            emptyCharArray[text.charAt(i)]++;
        }
    }
}