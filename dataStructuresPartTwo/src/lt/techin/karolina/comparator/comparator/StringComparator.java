package lt.techin.karolina.comparator.comparator;

import java.util.Comparator;

public class StringComparator  implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.println("1");
            return 1;
        } else if (str1.length() < str2.length()) {
            System.out.println("-1");
            return -1;

        } else {
            System.out.println("0");
            return 0;
        }
    }
}
