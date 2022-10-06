package lt.techin.karolina.day221006;

import java.util.Arrays;

public class masyvai {
    public static void main (String[] args) {
//        _______________
//        MASYVAI/INDEXAI
//        int[] -> cia jau nurodome, kad bus masyvas
//        int[] numbers = {};
//        Cia norima pasakyti, kad labai svarbu zinoti masyvo ilgi
        int [] numbers = new int[2];
        System.out.println(Arrays.toString(numbers)); // print [0, 0]
        System.out.println(numbers.length); // print 2
        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers)); // print [1, 0]

//        __DVIMATIS MASYVAS__
//        Tai yra matricos
        int[] nums1 = {1, 2, 3, 4, 5}; // ref1
        int[] nums2 = {6, 7, 8, 9, 0}; // ref2

        int[][] multiNums = {nums1, nums2};
        System.out.println(multiNums); // print [[I@49e4cb85 KELIAS, tai atsimink
        System.out.println(Arrays.deepToString(multiNums)); // print [[1, 2, 3, 4, 5], [6, 7, 8, 9, 0]]

//        __MASYVU LYGINIMAS__
        System.out.println(nums1 == nums2); // print false, nes lyginame nuorodas(kelius, ref1 = ref2)
        System.out.println(nums1.equals(nums2)); // print false, nes lyginami objektai, ne ju turinys
        System.out.println(Arrays.equals(nums1, nums2)); // print false, nes ju turinys nera vienodas
//        KAS IS TO SVARBU? KLASE ARRAYS PRINTINIME IR KAD JAVA DURNA, NES KAZKOKIUS KELIUS MATO, O NE DUOMENIS
//        PYTHON 4 EVER

    }
}
