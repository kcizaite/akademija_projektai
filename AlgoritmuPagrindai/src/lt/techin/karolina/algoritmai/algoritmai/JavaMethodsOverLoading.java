package lt.techin.karolina.algoritmai.algoritmai;

public class JavaMethodsOverLoading {
    public static void main(String[] args) {
//        Tas pats tik su masyvu
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumInteger(-1, 6, 9, 82, 123, -89));
//        Tas pats tik su masyvu -> veikia del to INT ... !!! TEN IR REISKIA MASYVA
        System.out.println(sumInteger(numbers));
    }

//    Sumacijos variantas primityvus sumacijos variantas
//    static int sumInteger(int numberOne, int numberTwo) {
//        return numberOne + numberTwo;
//    }
//    static int sumInteger(int numberOne, int numberTwo, int numberThree) {
//        return numberOne + numberTwo + numberThree;
//    }

//    Kaip padaryti geriau, kad nesvarbu kiek mes turim skaiciu sudetu !!!
    public static int sumInteger(int ... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
//            for (int eli : array) -> foreach variantas butu toks, vietoj for eilutes auksciau
            sum += array[i];
        }
        return sum;

}

}
