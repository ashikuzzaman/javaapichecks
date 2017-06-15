package com.ashik.chess;

import com.ashik.chess.PieceType;

public class PieceTypeTest {
	
	public static void main(String[] args) {

		System.out.println("King = " + PieceType.KING.getValue().equals("King"));
		System.out.println("Is Major Piece = " + PieceType.MAJPR_PIECES.contains(PieceType.KING));		
		System.out.println("King = " + PieceType.KING.equals(PieceType.get("King"))); // TODO fix it
	}


}