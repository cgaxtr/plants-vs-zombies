package tp.logic.gamePrinter;

import tp.logic.Game;

public abstract class BoardPrinter{

    String[][] board;
    final String space = " ";

    public abstract void encodeGame(Game game);

}
