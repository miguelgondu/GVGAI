package tracks.singlePlayer;

import java.util.Random;

import core.logging.Logger;
import tools.Utils;
import tracks.ArcadeMachine;

/**
 Taken and adapted from Test.java (in this same folder)
 Written by: Miguel González Duque
 */
public class Simulate {

    public static void main(String[] args) {
        /* Parse the args:
            0. gameVGDL: a string with the filepath to the VGDL of the game.
            1. gameTxt: a string with the filepath to the txt of the level.
			2. agent: a string with the agent to run.
			3. recordActionsFile: a string with where to store the playtrace. None for no storing.
			4. seed: the seed for the process.
        */
        String gameVGDL = args[0];
        String gameTxt = args[1];
		String agent = args[2];
		String recordActionsFile;
		if (args[3].equals("None")) {
			recordActionsFile = null;
		}
		else {
			recordActionsFile = args[3];
		}
		int seed = Integer.parseInt(args[4]);
        
		//Game settings
		boolean visuals = false;

		// Play one game
		double[] fullResult = ArcadeMachine.runOneGame(gameVGDL, gameTxt, visuals, agent, recordActionsFile, seed, 0);

		// Print the result for the Python listener
		System.out.println(fullResult[0]);
		System.out.print("END");
    }
}
