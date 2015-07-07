package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1742792430224584487L;

	private Integer id;
	
	private Integer cityClearedId;	

	private ArrayList<City> cities;
	
	private Integer pointsEarned;
	
	private Integer pointsSpent;
	
	private String pokemonSeenCatch;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCityClearedId() {
		return cityClearedId;
	}

	public void setCityClearedId(Integer cityClearedId) {
		this.cityClearedId = cityClearedId;
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}

	public Integer getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public Integer getPointsSpent() {
		return pointsSpent;
	}

	public void setPointsSpent(Integer pointsSpent) {
		this.pointsSpent = pointsSpent;
	}

	public String getPokemonSeenCatch() {
		return pokemonSeenCatch;
	}

	public void setPokemonSeenCatch(String pokemonSeenCatch) {
		this.pokemonSeenCatch = pokemonSeenCatch;
	}
	
	public void cityCleared(){
		this.cityClearedId++;
	}

	
	
	
	

	
	
	

}
