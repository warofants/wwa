package com.worldwarofants.game.logic.structures;

public abstract class AbstractStructure{
	private float hp;
	private float resourceAmount; //how much resource created per tick
	private float storageAmount; //how much max storage structure provides
	private boolean isUpgradable; //if current structure is upgradable
	private String resourceType; //what will the structure produce
	private int xCoor, yCoor; //(x,y) coordinates
	private int id; //unique strucutre id

	//getters and setters
	public float getResourceAmount(){
		return resourceAmount;
	}

	public void setResourceAmount(float resourceAmount){
		this.resourceAmount = resourceAmount;
	}

	public String getResourceType(){
		return resourceType;
	}

	public void setResourceType(String resourceType){
		this.resourceType = resourceType;
	}

	public void setUpgradable(boolean upgradable){
		this.isUpgradable = upgradable;
	}

	public boolean isUpgradable(){
		return isUpgradable;
	}

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
