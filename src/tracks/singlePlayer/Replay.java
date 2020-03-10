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
		// /Users/migd/Projects/ITAE_First_Test_paper/code/2020_02_26_experiments/zelda/zelda_experiments/playtraces/1583803396_674288_sampleRHEA_10_gens_50_iter_100_init_40_roll_17_seed_playtrace_seed_9.txt
		// /Users/migd/Projects/ITAE_First_Test_paper/code/2020_02_26_experiments/zelda/zelda_experiments/zelda_vgld_desc.txt
		// /Users/migd/Projects/ITAE_First_Test_paper/code/2020_02_26_experiments/zelda/zelda_experiments/levels/1583803396_674288_sampleRHEA_10_gens_50_iter_100_init_40_roll_17_seed_level.txt
		// 3. This replays a game from an action file previously recorded
		 ArcadeMachine.replayGame(gameVGDL, gameTxt, true, recordActionsFile);

    }
}
