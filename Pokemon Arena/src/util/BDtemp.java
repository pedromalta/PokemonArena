package util;

import java.util.ArrayList;
import java.util.Set;

import model.City;
import model.Place;
import model.Player;
import model.Pokemon;
import model.Trainer;

public class BDtemp {
	  
	public static int idPlayers = 1;
	public static long idPokemon = 1;
	public static Player player;
	public static Trainer opponent;
	public static Pokemon pkmPlayer;
	public static Pokemon pkmOpponent;
	public static Set<Pokemon> pkmUsed;
	public static Set<Pokemon> pkmEvolve;
	public static int turn = 0;
	public static boolean endBattle = false;
	public static City city;
	public static Place place;
	public static ArrayList<Player> players;
}
