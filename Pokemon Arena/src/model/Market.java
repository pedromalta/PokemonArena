package model;

import java.util.ArrayList;

public class Market extends Place {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 323250746001607459L;

	private ArrayList<Specie> species;
	
	private ArrayList<Items> items;

	public ArrayList<Specie> getSpecies() {
		return species;
	}

	public void setSpecies(ArrayList<Specie> species) {
		this.species = species;
	}

	public ArrayList<Items> getItems() {
		return items;
	}

	public void setItems(ArrayList<Items> items) {
		this.items = items;
	}
	
	

	
	
	
	
	
	
}
