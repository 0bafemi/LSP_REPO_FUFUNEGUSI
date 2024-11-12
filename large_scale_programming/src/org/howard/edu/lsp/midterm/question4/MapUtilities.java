package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;
import java.util.Map;

/**
 * The MapUtilities class provides a utility method to find the number of common key/value pairs between two HashMaps.
 */
public class MapUtilities {
    /**
     * Returns the number of common key/value pairs between two HashMaps.
     * If either map is null or empty, the method returns 0.
     *
     * @param map1 the first HashMap<String, String>
     * @param map2 the second HashMap<String, String>
     * @return the number of common key/value pairs
     */
    public static int commonKeyValuePairs(
            HashMap<String, String> map1,
            HashMap<String, String> map2) {

        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null && value.equals(map2.get(key))) {
                count++;
            }
        }
        return count;
    }
}

