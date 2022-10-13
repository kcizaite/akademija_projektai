package lt.techin.karolina.tesinys;
//      ________________________________________________
//      154 skaidres lentele, Array dalis, masyvo reikia
//      CIA SKAICIUOSIME MASYVO UZPILDYMO IR INDEXO PAIESKOS LAIKA

import java.util.Arrays;
import java.util.Random;

public class DataStructureOperation {
    private static Random rnd = new Random();
    private static int[] control = new int[10000];

    public static void main(String[] args) {
        int[] data = new int[100000];
//        fillArray(data);
//        metodas, kuris spausdintu laika
        countTime(data, 1); // fillArray
        countTime(data, 2); // accessByIndex
        countTime(data, 3); // searchByValue <- ieskome masyve pagal verte
        countTime(data, 4); // insertByIndex
//        Ar tai tikrai yra masyvas
//        System.out.println(Arrays.toString(control));
    }

    private static void countTime(int[] data, int operationNumber) {
        long start = System.currentTimeMillis();
        switch (operationNumber) {
            case 1:
                fillArray(data);
                break;
            case 2:
                accessByIndex(data);
                break;
            case 3:
                searchByValue(data);
                break;
            case 4:
                insertByIndex(data);
                break;
        }
//        fillArray(data);
//        accessByIndex();
        long end = System.currentTimeMillis();
        System.out.println("Working time: " + (end - start) + " mS");
    }

    private static void insertByIndex(int[] data) {
        int insertionCount = 10; // kiek kartu iterpimas bus
        int rndNumberForInsertion = rnd.nextInt(10000);
        int[] newArray = new int[data.length + insertionCount]; // mes iterpiam, pastumiam ar panasiai
        int rndIndex = rnd.nextInt(100000); // random indexas i kuri desime
        for (int i = 0; i < newArray.length; i++) {
            if (i < rndIndex) {
                newArray[i] = data[i];
            } else if (i == rndIndex) {
                newArray[i] = rndNumberForInsertion;
            } else {
                newArray[i] = data[i - insertionCount];
            }
        }
//        System.out.println(Arrays.toString(data));
//        System.out.println("New array " + Arrays.toString(newArray));
    }

    private static void searchByValue(int[] data) {
        int searchNumberValue = 20;
        for (int i = 0; i < data.length; i++) {
            if (searchNumberValue == data[i]) {
                System.out.println("");
            } else {
                System.out.println("");
            }
        }
    }

    private static void accessByIndex(int[] data) {
        for (int i = 0; i < 10000; i++) {
            int number = data[rnd.nextInt(100000)];
            control[i] = number;
        }
    }

    private static void fillArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
//            jei butu i <= data reiktu - 1 dar prie tos datos
            data[i] = rnd.nextInt(10000);
        }
    }
}
