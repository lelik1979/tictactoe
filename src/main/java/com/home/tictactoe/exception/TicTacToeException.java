package com.home.tictactoe.exception;

public class TicTacToeException extends RuntimeException {

    public TicTacToeException(String message) {
        super(message);
    }

    public TicTacToeException(String message, Throwable cause) {
        super(message, cause);
    }
}
