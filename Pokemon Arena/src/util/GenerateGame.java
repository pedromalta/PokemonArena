package util;

import java.util.ArrayList;

import model.City;
import model.Game;

public class GenerateGame {
	

	
	GenerateCity gc = new GenerateCity();
	
	public Game newGame(){
		
		Game game = new Game();
		game.setCityClearedId(1);
		ArrayList<City> cities = new ArrayList<City>();
		cities.add(gc.getCity(1));
		cities.add(gc.getCity(2));
		cities.add(gc.getCity(3));
		cities.add(gc.getCity(4));
		cities.add(gc.getCity(5));
		cities.add(gc.getCity(6));
		cities.add(gc.getCity(7));
		cities.add(gc.getCity(8));
		game.setCities(cities);
		game.setPointsEarned(0);
		game.setPointsSpent(0);
		
		return game;

	}

}
