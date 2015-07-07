package model;

import java.util.ArrayList;

public class Player extends Trainer{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1831765767987225405L;
	
	private Game game;
	private ArrayList<Pokemon> pokemons;
	
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}
	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
	

}
