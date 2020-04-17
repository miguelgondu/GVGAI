package tracks.singlePlayer;

import java.util.Random;

import core.logging.Logger;
import tools.Utils;
import tracks.ArcadeMachine;

/**
 Taken and adapted from Test.java (in this same folder)
 Written by: Miguel González Duque
 */
public class Play {

    public static void main(String[] args) {
        /* Parse the args:
            0. gameVGDL: a string with the filepath to the VGDL of the game.
            1. gameTxt: a string with the filepath to the txt of the level.
			2. recordActionsFile: a string with where to store the playtrace. None for no storing.
			3. seed: the seed for the process.
        */
        String gameVGDL = args[0];
        String gameTxt = args[1];
		String recordActionsFile;
		if (args[2].equals("None")) {
			recordActionsFile = null;
		}
		else {
			recordActionsFile = args[2];
		}
        int seed = Integer.parseInt(args[3]);

        // Play one game
        double[] fullResult = ArcadeMachine.playOneGame(gameVGDL, gameTxt, recordActionsFile, seed);

		// double[] fullResult = ArcadeMachine.runOneGame(gameVGDL, gameTxt, visuals, agent, recordActionsFile, seed, 0);

		// Print the result for the Python listener
		// 0: win state
		// 1: score
		// 2: game tick.
		String serialized_output = "{";
		serialized_output = serialized_output.concat("\"win\": " + fullResult[0] + ",");
		serialized_output = serialized_output.concat("\"score\": " + fullResult[1] + ",");
		serialized_output = serialized_output.concat("\"steps\": " + fullResult[2] + "}");
		System.out.println(serialized_output);
		System.out.print("END");
    }
}
