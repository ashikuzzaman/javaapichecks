package com.ashik.chess;

import java.util.Map;
import java.util.EnumSet;

/**
 * @author ashik
 * To compile: javac -d . MappedEnumUtil.java PieceType.java
 */

public enum PieceType {
    
    KING("King"), 
    QUEEN("Queen"), 
    ROOK("Rook"), 
    BISHOP("bishop"), 
    KNIGHT("Knight"), 
    PAWN("pawn");
    
    
    private static final Map<String, PieceType> LOOKUP = MappedEnumUtil.createLookupMap(PieceType.values());
    
    private final String value;

    private PieceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    
    public static PieceType get(String value) {
        if(value == null) {
            return null;
        }
        PieceType type = LOOKUP.get(value);
        if (type == null) {
            System.err.println("Unknown type of PieceType. Return null for value: " + value);
        }
        return type;
    }

    public static EnumSet<PieceType> MAJPR_PIECES = EnumSet.of(PieceType.QUEEN, PieceType.ROOK);

}
