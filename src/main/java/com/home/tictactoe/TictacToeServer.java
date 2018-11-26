package com.home.tictactoe;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class TictacToeServer extends Application<TictacToeConfiguration> {

    public static void main(String[] args) throws Exception {
        new TictacToeServer().run(args);
    }
    public void run(TictacToeConfiguration tictacToeConfiguration, Environment environment) throws Exception {

    }
}
