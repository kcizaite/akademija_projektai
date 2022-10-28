package lt.techin.karolina.collections.comporator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    // str1 > str2 => 1
    // str1 < str2 => -1
    // str1 == str2 => 0

    @Override
    public int compare(String str1, String str2) {
        if (str1.length() > str2.length()){ // charAt(1) => pagal antra raide
            return 1;
        } else if (str1.length() < str2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
