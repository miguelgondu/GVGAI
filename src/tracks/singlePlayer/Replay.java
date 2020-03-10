package tracks.singlePlayer;

import java.util.Random;

import core.logging.Logger;
import tools.Utils;
import tracks.ArcadeMachine;

/**
 * Created with IntelliJ IDEA. User: Diego Date: 04/10/13 Time: 16:29 This is a
 * Java port from Tom Schaul's VGDL - https://github.com/schaul/py-vgdl
 */
public class Replay {

    public static void main(String[] args) {
		/*
		Args for this code:
		0: gameVGDL: the filepath to theVGDL description of the game.
		1: gameTxt: the filepath to the level.
		2: recordActionsFile: the filepath to the playtrace.
		*/

		String gameVGDL = args[0];
        String gameTxt = args[1];
		String recordActionsFile = args[2];

		// Game and level to play
		 ArcadeMachine.replayGame(gameVGDL, gameTxt, true, recordActionsFile);

    }
}
