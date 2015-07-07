package model;

import net.clubedocomputador.PokemonArena.R;

public class Pokecenter extends Place {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5841883230866456203L;

	public Pokecenter(Integer id, String name){
		setId(id);
		setName(name);
		setBackgroundColor(Integer.valueOf(R.color.pokecenter));
		setBuilding(R.drawable.place_pokecenter);
		setBackground(R.drawable.place_pokemoncenterinside);
		setWelcomeText(R.string.hello_world);
		
	}

}
