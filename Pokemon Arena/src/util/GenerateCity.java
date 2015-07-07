package util;

import java.util.ArrayList;
import java.util.List;

import model.City;
import model.Place;
import model.Pokecenter;
import net.clubedocomputador.PokemonArena.R;
import enums.Types;

public class GenerateCity {

	GenerateGym gg = new GenerateGym();
	GenerateMarket gm = new GenerateMarket();
	
	public City getCity(Integer id){
		switch (id) {
		case 1:
			ArrayList<Place> places1 = new ArrayList<Place>();
			places1.add(gg.getGym(1));
			places1.add(gm.getMarket(1));
			places1.add(new Pokecenter(1, "Poke Centro Pewter"));
			City city1 = pewter(places1);
			for (Place pl : city1.getPlaces())
				pl.setCity(city1);
			return city1;
			
		case 2:
			ArrayList<Place> places2 = new ArrayList<Place>();
			places2.add(gg.getGym(2));
			places2.add(gm.getMarket(2));
			places2.add(new Pokecenter(2, "Poke Centro Cerulean"));
			City city2 = cerulean(places2);
			for (Place pl : city2.getPlaces())
				pl.setCity(city2);
			return city2;
			
		case 3:
			ArrayList<Place> places3 = new ArrayList<Place>();
			places3.add(gg.getGym(3));
			places3.add(gm.getMarket(3));
			places3.add(new Pokecenter(3, "Poke Centro Vermilion"));
			City city3 = virmilion(places3);
			for (Place pl : city3.getPlaces())
				pl.setCity(city3);
			return city3;
			
		case 4:
			ArrayList<Place> places4 = new ArrayList<Place>();
			places4.add(gg.getGym(4));
			places4.add(gm.getMarket(4));
			places4.add(new Pokecenter(4, "Poke Centro Celadon"));
			City city4 = celadon(places4);
			for (Place pl : city4.getPlaces()){
				pl.setCity(city4);
			}
			return city4;
			
		case 5:
			ArrayList<Place> places5 = new ArrayList<Place>();
			places5.add(gg.getGym(5));
			places5.add(gm.getMarket(5));
			places5.add(new Pokecenter(5, "Poke Centro Fuchsia"));
			City city5 = fuchsia(places5);
			for (Place pl : city5.getPlaces())
				pl.setCity(city5);
			return city5;
			
		case 6:
			ArrayList<Place> places6 = new ArrayList<Place>();
			places6.add(gg.getGym(6));
			places6.add(gm.getMarket(6));
			places6.add(new Pokecenter(6, "Poke Centro Saffron"));
			City city6 = saffron(places6);
			for (Place pl : city6.getPlaces())
				pl.setCity(city6);
			return city6;
			
		case 7:
			ArrayList<Place> places7 = new ArrayList<Place>();
			places7.add(gg.getGym(7));
			places7.add(gm.getMarket(7));
			places7.add(new Pokecenter(7, "Poke Centro Cinnabar"));
			City city7 = cinnabar(places7);
			for (Place pl : city7.getPlaces())
				pl.setCity(city7);
			return city7;
			
		case 8:
			ArrayList<Place> places8 = new ArrayList<Place>();
			places8.add(gg.getGym(8));
			places8.add(gm.getMarket(8));
			places8.add(new Pokecenter(8, "Poke Centro Viridian"));
			City city8 = viridian(places8);
			for (Place pl : city8.getPlaces())
				pl.setCity(city8);
			return city8;

		default:
			return null;
		}
	}
	
	private City pewter(List<Place> places){
		City ct = new City();
		ct.setId(1);
		ct.setName("Pewter");
		ct.setImg1(R.drawable.city_pewter);
		ct.setImg2(R.drawable.city_pewter);
		ct.setPlaces(places);
		ct.setLevel(10);
		ct.setType(Types.Rock);
		return ct;
	}
	
	private City cerulean(List<Place> places){
		City ct = new City();
		ct.setId(2);
		ct.setName("Cerulean");
		ct.setImg1(R.drawable.city_generic);
		ct.setImg2(R.drawable.city_generic);
		ct.setPlaces(places);
		ct.setLevel(20);
		ct.setType(Types.Water);
		return ct;
	}
	
	private City virmilion(List<Place> places){
		City ct = new City();
		ct.setId(3);
		ct.setName("Virmilion");
		ct.setImg1(R.drawable.city_generic);
		ct.setImg2(R.drawable.city_generic);
		ct.setPlaces(places);
		ct.setLevel(25);
		ct.setType(Types.Electric);
		return ct;
	}
	
	private City celadon(List<Place> places){
		City ct = new City();
		ct.setId(4);
		ct.setName("Celadon");
		ct.setImg1(R.drawable.city_celadon);
		ct.setImg2(R.drawable.city_celadon);
		ct.setPlaces(places);
		ct.setLevel(30);
		ct.setType(Types.Grass);
		return ct;
	}
	
	private City fuchsia(List<Place> places){
		City ct = new City();
		ct.setId(5);
		ct.setName("Fuchsia");
		ct.setImg1(R.drawable.city_generic);
		ct.setImg2(R.drawable.city_generic);
		ct.setPlaces(places);
		ct.setLevel(40);
		ct.setType(Types.Poison);
		return ct;
	}
	
	private City saffron(List<Place> places){
		City ct = new City();
		ct.setId(6);
		ct.setName("Saffron");
		ct.setImg1(R.drawable.city_saffron);
		ct.setImg2(R.drawable.city_saffron);
		ct.setPlaces(places);
		ct.setLevel(50);
		ct.setType(Types.Psychic);
		return ct;
	}
	
	private City cinnabar(List<Place> places){
		City ct = new City();
		ct.setId(7);
		ct.setName("Cinnabar");
		ct.setImg1(R.drawable.city_generic);
		ct.setImg2(R.drawable.city_generic);
		ct.setPlaces(places);
		ct.setLevel(50);
		ct.setType(Types.Fire);
		return ct;
	}
	
	private City viridian(List<Place> places){
		City ct = new City();
		ct.setId(8);
		ct.setName("Viridian");
		ct.setImg1(R.drawable.city_generic);
		ct.setImg2(R.drawable.city_generic);
		ct.setPlaces(places);
		ct.setLevel(60);
		ct.setType(Types.Ground);
		return ct;
	}
	
	
	
	
}


