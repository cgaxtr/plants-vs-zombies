package tp.logic.gamePrinter;

import tp.logic.Game;
import tp.logic.objects.ActiveGameObject;
import tp.logic.objects.Zombie;
import tp.util.MyStringUtils;

public class ReleasePrinter extends BoardPrinter implements GamePrinter{

    @Override
    public String printGame(Game game) {
        int cellSize = 7;
        int marginSize = 2;
        String vDelimiter = "|";
        String hDelimiter = "-";

        String rowDelimiter = MyStringUtils.repeat(hDelimiter, (Game.COLUMNS * (cellSize + 1)) - 1);
        String margin = MyStringUtils.repeat(space, marginSize);
        String lineDelimiter = String.format("%n%s%s%n", margin + space, rowDelimiter);

        StringBuilder str = new StringBuilder();
        str.append(game.toString()).append(System.getProperty("line.separator"));
        str.append(lineDelimiter);

        encodeGame(game);

        for(int i=0; i<Game.ROWS; i++) {
            str.append(margin).append(vDelimiter);
            for (int j=0; j<Game.COLUMNS; j++) {
                str.append( MyStringUtils.centre(board[i][j], cellSize)).append(vDelimiter);
            }
            str.append(lineDelimiter);
        }
        return str.toString();
    }

    @Override
    public void encodeGame(Game game) {
        board = new String[Game.ROWS][Game.COLUMNS];

        for(int i = 0; i < Game.ROWS; i++) {
            for(int j = 0; j < Game.COLUMNS; j++) {
                board[i][j] = game.positionToString(i, j);
            }
        }
    }
}
