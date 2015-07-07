package util;

import java.util.ArrayList;

import model.Items;
import model.Market;
import model.Specie;
import net.clubedocomputador.PokemonArena.R;

public class GenerateMarket {
	
	GenerateSpecies gs = new GenerateSpecies();
	
	public Market getMarket(Integer id){
		switch (id) {
		case 1:
			return pewter();
		case 2:
			return cerulean();
		case 3:
			return vermilion();
		case 4:
			return celadon();
		case 5:
			return fuchsia();
		case 6:
			return saffron();
		case 7:
			return cinnabar();
		case 8:
			return viridian();

		default:
			return null;
		}
	}
	
	private Market pewter(){
		Market mk = new Market();
		
		mk.setBuilding(R.drawable.place_pokemarket);
		mk.setBackground(R.drawable.place_pokemoncenterinside);
		mk.setBackgroundColor(Integer.valueOf(R.color.market));
		mk.setId(1);
		mk.setName("Mercado Pewter");
		mk.setItems(new ArrayList<Items>());
		mk.setSpecies(new ArrayList<Specie>());
		mk.getSpecies().add(gs.getSpecie(1));
		mk.getSpecies().add(gs.getSpecie(4));
		mk.getSpecies().add(gs.getSpecie(7));
		mk.getSpecies().add(gs.getSpecie(25));

		mk.setWelcomeText(R.string.hello_world);
		return mk;
	}
	
	private Market cerulean(){
		Market mk = new Market();
		
		mk.setBuilding(R.drawable.place_pokemarket);
		mk.setBackground(R.drawable.place_pokemoncenterinside);
		mk.setBackgroundColor(Integer.valueOf(R.color.market));
		mk.setId(2);
		mk.setName("Mercado Cerulean");
		mk.setItems(new ArrayList<Items>());
		mk.setSpecies(new ArrayList<Specie>());
		mk.getSpecies().add(gs.getSpecie(10));
		mk.getSpecies().add(gs.getSpecie(13));
		mk.getSpecies().add(gs.getSpecie(16));
		mk.getSpecies().add(gs.getSpecie(19));
		mk.getSpecies().add(gs.getSpecie(21));
		mk.getSpecies().add(gs.getSpecie(29));


		mk.setWelcomeText(R.string.hello_world);
		return mk;
	}
	

	private Market vermilion(){
		Market mk = new Market();
		
		mk.setBuilding(R.drawable.place_pokemarket);
		mk.setBackground(R.drawable.place_pokemoncenterinside);
		mk.setBackgroundColor(Integer.valueOf(R.color.market));
		mk.setId(3);
		mk.setName("Mercado Vermilion");
		mk.setItems(new ArrayList<Items>());
		mk.setSpecies(new ArrayList<Specie>());
		mk.getSpecies().add(gs.getSpecie(32));
		mk.getSpecies().add(gs.getSpecie(56));
		mk.getSpecies().add(gs.getSpecie(23));
		mk.getSpecies().add(gs.getSpecie(32));
		mk.getSpecies().add(gs.getSpecie(35));
		mk.getSpecies().add(gs.getSpecie(36));
		mk.setWelcomeText(R.string.hello_world);
		return mk;
	}
	
	private Market celadon(){
		Market mk = new Market();
		
		mk.setBuilding(R.drawable.place_pokemarket);
		mk.setBackground(R.drawable.place_pokemoncenterinside);
		mk.setBackgroundColor(Integer.valueOf(R.color.market));
		mk.setId(3);
		mk.setName("Mercado Celadon");
		mk.setItems(new ArrayList<Items>());
		mk.setSpecies(new ArrayList<Specie>());
		mk.getSpecies().add(gs.getSpecie(35));
		mk.getSpecies().add(gs.getSpecie(39));
		mk.getSpecies().add(gs.getSpecie(15));
		mk.getSpecies().add(gs.getSpecie(16));


		mk.setWelcomeText(R.string.hello_world);
		return mk;
	}
	
	private Market fuchsia(){
		Market mk = new Market();
		
		mk.setBuilding(R.drawable.place_pokemarket);
		mk.setBackground(R.drawable.place_pokemoncenterinside);
		mk.setBackgroundColor(Integer.valueOf(R.color.market));
		mk.setId(3);
		mk.setName("Mercado Fuchsia");
		mk.setItems(new ArrayList<Items>());
		mk.setSpecies(new ArrayList<Specie>());
		mk.getSpecies().add(gs.getSpecie(41));
		mk.getSpecies().add(gs.getSpecie(43));
		mk.getSpecies().add(gs.getSpecie(46));
		mk.getSpecies().add(gs.getSpecie(69));
		mk.setWelcomeText(R.string.hello_world);
		return mk;
	}
	
	private Market saffron(){
		Market mk = new Market();
		
		mk.setBuilding(R.drawable.place_pokemarket);
		mk.setBackground(R.drawable.place_pokemoncenterinside);
		mk.setBackgroundColor(Integer.valueOf(R.color.market));
		mk.setId(3);
		mk.setName("Saffron Market");
		mk.setItems(new ArrayList<Items>());
		mk.setSpecies(new ArrayList<Specie>());
		mk.getSpecies().add(gs.getSpecie(74));
		mk.getSpecies().add(gs.getSpecie(81));
		mk.getSpecies().add(gs.getSpecie(100));
		mk.setWelcomeText(R.string.hello_world);
		return mk;
	}
	
	private Market cinnabar(){
		Market mk = new Market();
		
		mk.setBuilding(R.drawable.place_pokemarket);
		mk.setBackground(R.drawable.place_pokemoncenterinside);
		mk.setBackgroundColor(Integer.valueOf(R.color.market));
		mk.setId(3);
		mk.setName("Mercado Cinnabar");
		mk.setItems(new ArrayList<Items>());
		mk.setSpecies(new ArrayList<Specie>());
		mk.getSpecies().add(gs.getSpecie(15));
		mk.getSpecies().add(gs.getSpecie(16));
		mk.getSpecies().add(gs.getSpecie(32));
		mk.getSpecies().add(gs.getSpecie(35));
		mk.getSpecies().add(gs.getSpecie(36));
		mk.setWelcomeText(R.string.hello_world);
		return mk;
	}
	
	private Market viridian(){
		Market mk = new Market();
		
		mk.setBuilding(R.drawable.place_pokemarket);
		mk.setBackground(R.drawable.place_pokemoncenterinside);
		mk.setBackgroundColor(Integer.valueOf(R.color.market));
		mk.setId(3);
		mk.setName("Mercado Viridian");
		mk.setItems(new ArrayList<Items>());
		mk.setSpecies(new ArrayList<Specie>());
		mk.getSpecies().add(gs.getSpecie(15));
		mk.getSpecies().add(gs.getSpecie(16));
		mk.getSpecies().add(gs.getSpecie(32));
		mk.getSpecies().add(gs.getSpecie(35));
		mk.getSpecies().add(gs.getSpecie(36));
		mk.setWelcomeText(R.string.hello_world);
		return mk;
	}

}
