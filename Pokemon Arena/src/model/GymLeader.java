package model;

import util.BDtemp;

public class GymLeader extends NPC {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8985069628411904928L;
	
	private Pokemon pokemonBonus;
	
	public Pokemon getPokemonBonus() {
		return pokemonBonus;
	}

	public void setPokemonBonus(Pokemon pokemonBonus) {
		this.pokemonBonus = pokemonBonus;
	}
	
	public void setDefeatedGymLeader(){
		((Gym)BDtemp.player
		.getGame()
		.getCities()
		.get(BDtemp.player.getGame().getCities().indexOf(BDtemp.city))
		.getPlaces()
		.get(BDtemp.player.getGame().getCities().get(BDtemp.player.getGame().getCities().indexOf(BDtemp.city)).getPlaces().indexOf(BDtemp.place))
		).getGymLeader().setDefeated(true);
	}

	
	
	
	
	
	


}
