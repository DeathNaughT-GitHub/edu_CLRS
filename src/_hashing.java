//  HashSet, HashMap, LinkedHashMap, LinkedHashSet, Hashtable, ConcurrentHashMap, TreeSet

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.TreeSet;
import java.util.Map;

class _hashing {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(); // Only value, not keys
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); // Maintains order

        HashMap<Integer, Integer> hm = new HashMap<>(); // Both key & value
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>(); // Maintains order

        Hashtable<Integer, Integer> ht = new Hashtable<>(); // Synchronized

        ConcurrentHashMap<Integer, Integer> chs = new ConcurrentHashMap<>(); // Synchronized + putIfAbsent()

        TreeSet<Integer> ts = new TreeSet<>(); // Sorted set

        hm.put(1, 50);
        hm.put(10, 100);
        hm.put(100, 150);

        for (Map.Entry element: hm.entrySet()) {
            System.out.print(element.getKey() + " - ");
            System.out.println(element.getValue());
        }

        lhm.put(1, 50);
        lhm.put(10, 100);
        lhm.put(100, 150);

        for (Map.Entry element: lhm.entrySet()) {
            System.out.print(element.getKey() + " - ");
            System.out.println(element.getValue());
        }

        // Maps: put, remove, clear, containsKey(), get
        // Sets: add, remove, clear, contains
        
    }
}