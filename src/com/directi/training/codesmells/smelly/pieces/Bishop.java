package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.chess.Color;
import com.directi.training.codesmells.smelly.chess.Position;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Position from, Position to) {
        return Move.isDiagonalMove(from, to);
    }

    @Override
    public String toString() {
        return "b";
    }
}
