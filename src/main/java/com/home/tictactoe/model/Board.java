package com.home.tictactoe.model;

import com.home.tictactoe.WinnerChecker;
import com.home.tictactoe.exception.TicTacToeException;

public class Board {

    private Figure[][] board;

    private WinnerChecker winnerChecker = new WinnerChecker();

    public Board(int boardSize) {
        this.board = new Figure[boardSize][boardSize];
    }

    public boolean doMove(Coordinate coordinate, Figure figure) {
        Figure figureAt = board[coordinate.getX()][coordinate.getY()];
        if (figureAt != null) {
            throw new TicTacToeException("Can't do move to busy cell");
        }
        board[coordinate.getX()][coordinate.getY()] = figure;
        return checkResult(board, coordinate);
    }

    private boolean checkResult(Figure[][] board, Coordinate coordinate) {
        return winnerChecker.checkMove(coordinate, board);
    }


}
