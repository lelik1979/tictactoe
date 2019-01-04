package com.home.tictactoe;

import com.home.tictactoe.model.Coordinate;
import com.home.tictactoe.model.Figure;

public class WinnerChecker {

    private static final int WINLENGTH = 3;

    public boolean checkMove(Coordinate coordinate, Figure[][] board) {
        Figure currentFigure = board[coordinate.getX()][coordinate.getY()];
        int nextX = coordinate.getX() + 1;
        if (nextX > board.length) {
            nextX = coordinate.getX() - 1;
        }
//        if (currentFigure == )
        return false;
    }
}
