package tp.controller.commands;

import tp.controller.Controller;
import tp.logic.Game;

public class ExitCommand extends NoParamsCommand {
    public static final String CommandText = "exit";
    public static final String CommandTextMsg = "[E]xit";
    public static final String HelpTextMsg = "terminate the program.";

    public ExitCommand(){
        super(CommandText, CommandTextMsg, HelpTextMsg);
    }

    @Override
    public void execute(Game game, Controller controller) {
        controller.setExit();
        controller.setNoPrintGameState();
    }
}