package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Trainer implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7713399218112422928L;

	private Integer id;
	
	private String name;
	
	private Integer model;
	
	private Long points;
	
	private ArrayList<Items> items;	
	
	private Pokemon pokemon1;
	
	private Pokemon pokemon2;
	
	private Pokemon pokemon3;
	
	private Pokemon pokemon4;
	
	private Pokemon pokemon5;
	
	private Pokemon pokemon6;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public ArrayList<Items> getItems() {
		return items;
	}

	public void setItems(ArrayList<Items> items) {
		this.items = items;
	}

	public Pokemon getPokemon1() {
		return pokemon1;
	}

	public void setPokemon1(Pokemon pokemon1) {
		this.pokemon1 = pokemon1;
	}

	public Pokemon getPokemon2() {
		return pokemon2;
	}

	public void setPokemon2(Pokemon pokemon2) {
		this.pokemon2 = pokemon2;
	}

	public Pokemon getPokemon3() {
		return pokemon3;
	}

	public void setPokemon3(Pokemon pokemon3) {
		this.pokemon3 = pokemon3;
	}

	public Pokemon getPokemon4() {
		return pokemon4;
	}

	public void setPokemon4(Pokemon pokemon4) {
		this.pokemon4 = pokemon4;
	}

	public Pokemon getPokemon5() {
		return pokemon5;
	}

	public void setPokemon5(Pokemon pokemon5) {
		this.pokemon5 = pokemon5;
	}

	public Pokemon getPokemon6() {
		return pokemon6;
	}

	public void setPokemon6(Pokemon pokemon6) {
		this.pokemon6 = pokemon6;
	}
	
	public void healPokemons(){
		if (this.getPokemon1() != null){
			this.getPokemon1().setLife(this.getPokemon1().getHp());
			this.getPokemon1().resetPP1();
			this.getPokemon1().resetPP2();
			this.getPokemon1().resetPP3();
			this.getPokemon1().resetPP4();
		}
		if (this.getPokemon2() != null){
			this.getPokemon2().setLife(this.getPokemon2().getHp());
			this.getPokemon2().resetPP1();
			this.getPokemon2().resetPP2();
			this.getPokemon2().resetPP3();
			this.getPokemon2().resetPP4();
		}
		if (this.getPokemon3() != null){
			this.getPokemon3().setLife(this.getPokemon3().getHp());
			this.getPokemon3().resetPP1();
			this.getPokemon3().resetPP2();
			this.getPokemon3().resetPP3();
			this.getPokemon3().resetPP4();
		}
		if (this.getPokemon4() != null){
			this.getPokemon4().setLife(this.getPokemon4().getHp());
			this.getPokemon4().resetPP1();
			this.getPokemon4().resetPP2();
			this.getPokemon4().resetPP3();
			this.getPokemon4().resetPP4();
		}
		if (this.getPokemon5() != null){
			this.getPokemon5().setLife(this.getPokemon5().getHp());
			this.getPokemon5().resetPP1();
			this.getPokemon5().resetPP2();
			this.getPokemon5().resetPP3();
			this.getPokemon5().resetPP4();
		}
		if (this.getPokemon6() != null){
			this.getPokemon6().setLife(this.getPokemon6().getHp());
			this.getPokemon6().resetPP1();
			this.getPokemon6().resetPP2();
			this.getPokemon6().resetPP3();
			this.getPokemon6().resetPP4();
		}
	}

}
