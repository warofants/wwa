package com.worldwarofants.game.logic.combat;


/**
 *	High level interface to combat processing
 */
public interface CombatProcessor {
	
	/**
	 * Processes combat between two opponents
	 * 
	 * @param side1 first opponent
	 * @param side2 second opponent
	 * @return {@link CombatResult} object holding all data necessary for processing combat result
	 */
	CombatResult processCombat(CombatSide side1, CombatSide side2);
}
