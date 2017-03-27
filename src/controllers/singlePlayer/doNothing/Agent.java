package controllers.singlePlayer.doNothing;

import core.game.SerializableStateObservation;
import core.game.StateObservation;
import core.player.AbstractPlayer;
import ontology.Types;
import ontology.Types.ACTIONS;
import tools.ElapsedCpuTimer;

public class Agent extends AbstractPlayer{


	/**
	 * initialize all variables for the agent
	 * @param stateObs Observation of the current state.
     * @param elapsedTimer Timer when the action returned is due.
	 */
	public Agent(StateObservation stateObs, ElapsedCpuTimer elapsedTimer){
		SerializableStateObservation sso = new SerializableStateObservation(stateObs);

		for (int i=0; i<10; i++) {
//			System.out.println("Constructor: Create object time: " + elapsedTimer);
			sso.serialize("gsonState.json");
//			System.out.println("Constructor: Serialize object time: " + elapsedTimer);
		}
//		System.out.println("In constructor : " + sso.toString());
	}
	
	/**
	 * return ACTION_NIL on every call to simulate doNothing player
	 * @param stateObs Observation of the current state.
     * @param elapsedTimer Timer when the action returned is due.
	 * @return 	ACTION_NIL all the time
	 */
	@Override
	public ACTIONS act(StateObservation stateObs, ElapsedCpuTimer elapsedTimer) {
		SerializableStateObservation sso = new SerializableStateObservation(stateObs);
//		System.out.println("Create object time: " + elapsedTimer);
//		sso.serialize("gsonState.json");
		sso.toString();
		System.out.println(sso.gameTick + " " + elapsedTimer);
//		System.out.println("Serialize object time: " + elapsedTimer);

//		System.out.println("At game tick "+sso.gameTick + " : " +sso.toString());
		return Types.ACTIONS.ACTION_NIL;
	}
}