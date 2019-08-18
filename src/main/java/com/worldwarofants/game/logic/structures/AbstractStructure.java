package com.worldwarofants.game.logic.structures;

public abstract class AbstractStructure{
	private float hp;
	private boolean storage;

	//(x,y) coordinates
	private int xCoor, yCoor;
	private int id;

	public float getHp(){
		return hp;
	}

	public void setHp(float hp){
		this.hp = hp;
	}

	public int getxCoor(){
		return xCoor;
	}

	public void setxCoor(int xCoor){
		this.xCoor = xCoor;
	}

	public int getyCoor(){
		return yCoor;
	}

	public void setyCoor(int yCoor){
		this.yCoor = yCoor;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}
}
