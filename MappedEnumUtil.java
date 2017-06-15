package com.ashik.chess;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public enum MappedEnumUtil {
    
    INSTANCE; // Enum singleton

    /**
     * A helper method for static initialization of maps to perform lookups of enum constants from their mapped
     * representations.
     *
     * @param values
     *            The enum's values array
     * @return An UnmodifableMap from the enum's mapped representations to enum constants
     */
    public static Map<String, PieceType> createLookupMap(PieceType[] values) {

        Map<String, PieceType> builderMap = new HashMap<String, PieceType>(values.length);

        for (PieceType e : values) {
            String key = e.name();
            if (key == null || key == "") {
                continue;
            }

            if (builderMap.containsKey(key)) {
                throw new IllegalStateException("duplicate MappedEnum key: " + key + ", value1: " + e
                        + ", value2: " + builderMap.get(key));
            }
            builderMap.put(key, e);
        }
        return Collections.unmodifiableMap(builderMap);
    }


}
