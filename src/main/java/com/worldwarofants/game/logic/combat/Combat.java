package com.worldwarofants.game.logic.combat;

/*
 * High level combat processing class
 * */
public class Combat {
	private boolean processed = false;
	
	private final CombatSide side1;
	private final CombatSide side2;
	
	public Combat(CombatSide side1, CombatSide side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public CombatResult process() {
		if(processed) {
			throw new IllegalArgumentException("Combat has already finished!");
		}
		
		//TODO here comes combat processing and building CombatResult object
		return null;
	}
}
