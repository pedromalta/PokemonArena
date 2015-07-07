package model;

import enums.Types;

public class Gym extends Place{	


	/**
	 * 
	 */
	private static final long serialVersionUID = 7987926071069320616L;

	private Types baseType1;
	
	private Types baseType2;
	
	private Types baseType3;
	
	private Types baseType4;
	
	private Types baseType5;
	
	private Integer NumeroNPCs;
	
	private String NPCsDefeated;
	
	private GymLeader gymLeader;
	
	private Boolean lose;
	
	private Pokemon pokemonBonus;

	public Types getBaseType1() {
		return baseType1;
	}

	public void setBaseType1(Types baseType1) {
		this.baseType1 = baseType1;
	}

	public Types getBaseType2() {
		return baseType2;
	}

	public void setBaseType2(Types baseType2) {
		this.baseType2 = baseType2;
	}

	public Types getBaseType3() {
		return baseType3;
	}

	public void setBaseType3(Types baseType3) {
		this.baseType3 = baseType3;
	}

	public Types getBaseType4() {
		return baseType4;
	}

	public void setBaseType4(Types baseType4) {
		this.baseType4 = baseType4;
	}

	public Types getBaseType5() {
		return baseType5;
	}

	public void setBaseType5(Types baseType5) {
		this.baseType5 = baseType5;
	}

	public Integer getNumeroNPCs() {
		return NumeroNPCs;
	}

	public void setNumeroNPCs(Integer numeroNPCs) {
		NumeroNPCs = numeroNPCs;
	}

	public String getNPCsDefeated() {
		return NPCsDefeated;
	}

	public void setNPCsDefeated(String nPCsDefeated) {
		NPCsDefeated = nPCsDefeated;
	}
	
	public void addNPCsDefeated(Trainer npc) {
		
		NPCsDefeated += npc.getName() + ":" + npc.getModel() + ":" + ((NPC)npc).getSpeechWon() +  ";";
	}


	public GymLeader getGymLeader() {
		return gymLeader;
	}

	public void setGymLeader(GymLeader gymLeader) {
		this.gymLeader = gymLeader;
	}

	public Boolean getLose() {
		return lose;
	}

	public void setLose(Boolean lose) {
		this.lose = lose;
	}

	public Pokemon getPokemonBonus() {
		return pokemonBonus;
	}

	public void setPokemonBonus(Pokemon pokemonBonus) {
		this.pokemonBonus = pokemonBonus;
	}
	
	
	

}
