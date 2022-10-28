package lt.techin.karolina.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMapTest {
    public static void main(String[] args) {
        // 1 -> {...}
        // 2 -> {...}
        // Key -> Value => Map
        // _____________________________
        // HasMap (neuztikrina eiliskumo)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Tomas");
        hashMap.put(2, "Dovile");
        hashMap.put(3, "Lucija");
        hashMap.put(4, "Ernestas");
        System.out.println(hashMap); // print {1=Tomas, 2=Dovile, 3=Lucija, 4=Ernestas}
        hashMap.put(2, "Karolis");
        System.out.println(hashMap); // print {1=Tomas, 2=Karolis, 3=Lucija, 4=Ernestas}
        // Kaip atspausdinti mapá
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue()); // print 1Tomas 2Karolis 3Lucija 4Ernestas
        }
        // HashMap neuztikrina eiliskumo, nes veikia pagal hashá
        Map<String, String> translation = new HashMap<>();
        translation.put("Cat", "Kate");
        translation.put("Dog", "Suo");
        translation.put("Cow", "Karve");
        translation.put("Frog", "Varle");
        System.out.println(translation); // print {Frog=Varle, Cat=Kate, Cow=Karve, Dog=Suo}
        // HashMap, LinkedHashMap, TreeMap
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        testMap(hashMap1);
        testMap(linkedHashMap1);
        testMap(treeMap1);
    }
    private static void testMap(Map<Integer, String> map) {
        map.put(39, "Teddy");
        map.put(12, "Tommy");
        map.put(2, "Lenon");
        map.put(128, "Vita");
        map.put(200, "Katy");
        System.out.println(map);
        // print {128=Vita, 2=Lenon, 39=Teddy, 200=Katy, 12=Tommy}
        // print {39=Teddy, 12=Tommy, 2=Lenon, 128=Vita, 200=Katy}
        // print {2=Lenon, 12=Tommy, 39=Teddy, 128=Vita, 200=Katy}
    }
}
