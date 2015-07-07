package util;

import java.util.ArrayList;

import enums.ItemType;

import model.GymLeader;
import model.Items;
import net.clubedocomputador.PokemonArena.R;

public class GenerateGymLeader {

	GeneratePokemon gp = new GeneratePokemon();

	public GymLeader getGymLeader(Integer id) {
		switch (id) {
		case 1:
			return brock();
		case 2:
			return misty();
		case 3:
			return ltsurge();
		case 4:
			return erika();
		case 5:
			return koga();
		case 6:
			return sabrina();
		case 7:
			return blaine();
		case 8:
			return giovani();
		default:
			return null;
		}
	}

	private GymLeader brock() {

		GymLeader gl = new GymLeader();

		gl.setId(-1);
		gl.setName("Brock");
		gl.setItems(new ArrayList<Items>());
		Items item = new Items();
		item.setId(1);
		item.setImage(R.drawable.badge_boulder);
		item.setItemType(ItemType.badge);
		item.setName("Boulder Badge");
		item.setPointCost(0);
		gl.getItems().add(item);

		gl.setModel(R.drawable.gymleader_brock);
		gl.setPoints(2000l);
		gl.setPokemonBonus(null);
		gl.setPokemon1(gp.getPokemon(-1));
		gl.setPokemon2(gp.getPokemon(-2));

		gl.setPokemon3(null);
		gl.setPokemon4(null);
		gl.setPokemon5(null);
		gl.setPokemon6(null);
		gl.setSpeechStart(R.string.speechStart);
		gl.setSpeechWon(R.string.speechWon);
		gl.setSpeechLose(R.string.speechLose);
		return gl;

	}

	private GymLeader misty() {

		GymLeader gl = new GymLeader();

		gl.setId(-2);
		gl.setName("Misty");
		gl.setItems(new ArrayList<Items>());
		Items item = new Items();
		item.setId(2);
		item.setImage(R.drawable.badge_cascade);
		item.setItemType(ItemType.badge);
		item.setName("Cascade Badge");
		item.setPointCost(0);
		gl.getItems().add(item);

		gl.setModel(R.drawable.gymleader_misty);
		gl.setPoints(3000l);
		gl.setPokemonBonus(null);
		gl.setPokemon1(gp.getPokemon(-3));
		gl.setPokemon2(gp.getPokemon(-4));

		gl.setPokemon3(null);
		gl.setPokemon4(null);
		gl.setPokemon5(null);
		gl.setPokemon6(null);
		gl.setSpeechStart(R.string.speechStart);
		gl.setSpeechWon(R.string.speechWon);
		gl.setSpeechLose(R.string.speechLose);
		return gl;

	}

	private GymLeader ltsurge() {
		GymLeader gl = new GymLeader();

		gl.setId(-3);
		gl.setName("Lt. Surge");
		gl.setItems(new ArrayList<Items>());
		Items item = new Items();
		item.setId(3);
		item.setImage(R.drawable.badge_thunder);
		item.setItemType(ItemType.badge);
		item.setName("Thunder Badge");
		item.setPointCost(0);
		gl.getItems().add(item);

		gl.setModel(R.drawable.gymleader_ltsurge);
		gl.setPoints(4000l);
		gl.setPokemonBonus(null);
		gl.setPokemon1(gp.getPokemon(-5));

		gl.setPokemon3(null);
		gl.setPokemon4(null);
		gl.setPokemon5(null);
		gl.setPokemon6(null);
		gl.setSpeechStart(R.string.speechStart);
		gl.setSpeechWon(R.string.speechWon);
		gl.setSpeechLose(R.string.speechLose);
		return gl;
	}

	private GymLeader erika() {

		GymLeader gl = new GymLeader();

		gl.setId(-4);
		gl.setName("Erika");
		gl.setItems(new ArrayList<Items>());
		Items item = new Items();
		item.setId(4);
		item.setImage(R.drawable.badge_rainbow);
		item.setItemType(ItemType.badge);
		item.setName("Rainbow Badge");
		item.setPointCost(0);
		gl.getItems().add(item);

		gl.setModel(R.drawable.gymleader_erika);
		gl.setPoints(5000l);
		gl.setPokemonBonus(null);
		gl.setPokemon1(gp.getPokemon(-1));
		gl.setPokemon2(gp.getPokemon(-2));

		gl.setPokemon3(null);
		gl.setPokemon4(null);
		gl.setPokemon5(null);
		gl.setPokemon6(null);
		gl.setSpeechStart(R.string.speechStart);
		gl.setSpeechWon(R.string.speechWon);
		gl.setSpeechLose(R.string.speechLose);
		return gl;

	}

	private GymLeader koga() {

		GymLeader gl = new GymLeader();

		gl.setId(-5);
		gl.setName("Koga");
		gl.setItems(new ArrayList<Items>());
		Items item = new Items();
		item.setId(5);
		item.setImage(R.drawable.badge_soul);
		item.setItemType(ItemType.badge);
		item.setName("Soul Badge");
		item.setPointCost(0);
		gl.getItems().add(item);

		gl.setModel(R.drawable.gymleader_koga);
		gl.setPoints(6000l);
		gl.setPokemonBonus(null);
		gl.setPokemon1(gp.getPokemon(-1));
		gl.setPokemon2(gp.getPokemon(-2));

		gl.setPokemon3(null);
		gl.setPokemon4(null);
		gl.setPokemon5(null);
		gl.setPokemon6(null);
		gl.setSpeechStart(R.string.speechStart);
		gl.setSpeechWon(R.string.speechWon);
		gl.setSpeechLose(R.string.speechLose);
		return gl;

	}

	private GymLeader sabrina() {

		GymLeader gl = new GymLeader();

		gl.setId(-6);
		gl.setName("Sabrina");
		gl.setItems(new ArrayList<Items>());
		Items item = new Items();
		item.setId(6);
		item.setImage(R.drawable.badge_marsh);
		item.setItemType(ItemType.badge);
		item.setName("Marsh Badge");
		item.setPointCost(0);
		gl.getItems().add(item);

		gl.setModel(R.drawable.gymleader_sabrina);
		gl.setPoints(7000l);
		gl.setPokemonBonus(null);
		gl.setPokemon1(gp.getPokemon(-1));
		gl.setPokemon2(gp.getPokemon(-2));

		gl.setPokemon3(null);
		gl.setPokemon4(null);
		gl.setPokemon5(null);
		gl.setPokemon6(null);
		gl.setSpeechStart(R.string.speechStart);
		gl.setSpeechWon(R.string.speechWon);
		gl.setSpeechLose(R.string.speechLose);
		return gl;

	}

	private GymLeader blaine() {

		GymLeader gl = new GymLeader();

		gl.setId(-7);
		gl.setName("Blaine");
		gl.setItems(new ArrayList<Items>());
		Items item = new Items();
		item.setId(7);
		item.setImage(R.drawable.badge_volcano);
		item.setItemType(ItemType.badge);
		item.setName("Volcano Badge");
		item.setPointCost(0);
		gl.getItems().add(item);

		gl.setModel(R.drawable.gymleader_blaine);
		gl.setPoints(8000l);
		gl.setPokemonBonus(null);
		gl.setPokemon1(gp.getPokemon(-1));
		gl.setPokemon2(gp.getPokemon(-2));

		gl.setPokemon3(null);
		gl.setPokemon4(null);
		gl.setPokemon5(null);
		gl.setPokemon6(null);
		gl.setSpeechStart(R.string.speechStart);
		gl.setSpeechWon(R.string.speechWon);
		gl.setSpeechLose(R.string.speechLose);
		return gl;

	}
	
	private GymLeader giovani() {

		GymLeader gl = new GymLeader();

		gl.setId(-8);
		gl.setName("Giovani");
		gl.setItems(new ArrayList<Items>());
		Items item = new Items();
		item.setId(8);
		item.setImage(R.drawable.badge_earth);
		item.setItemType(ItemType.badge);
		item.setName("Earth Badge");
		item.setPointCost(0);
		gl.getItems().add(item);

		gl.setModel(R.drawable.gymleader_giovanni);
		gl.setPoints(9000l);
		gl.setPokemonBonus(null);
		gl.setPokemon1(gp.getPokemon(-1));
		gl.setPokemon2(gp.getPokemon(-2));

		gl.setPokemon3(null);
		gl.setPokemon4(null);
		gl.setPokemon5(null);
		gl.setPokemon6(null);
		gl.setSpeechStart(R.string.speechStart);
		gl.setSpeechWon(R.string.speechWon);
		gl.setSpeechLose(R.string.speechLose);
		return gl;

	}
	

}
