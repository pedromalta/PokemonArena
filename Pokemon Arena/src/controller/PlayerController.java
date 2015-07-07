package controller;
	
import java.util.ArrayList;

import model.Items;
import model.Player;
import model.Pokemon;
import util.BDtemp;
import util.GenerateGame;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import dao.OpenHelper;


public class PlayerController extends ContentProvider{

	public static final Uri CONTENT_URI = Uri.parse("content://net.clubedocomputador.PokemonArena.playercontroller"); 	
	private static  final String DATABASE_NAME = "POKEDATABASE.db";
	private static  final int DATABASE_VERSION = 1;
	private static final  String TABLE = "player";
	private static final int NOTES = 1;
	public static final String TAG = "PlayerController";
	private OpenHelper mHelper;

	
	
	public boolean newPlayer(String nome, Integer img){

		GenerateGame gg = new GenerateGame();			
		
		Player newTrainer = new Player();
		newTrainer.setName(nome.trim());
		newTrainer.setModel(img);
		newTrainer.setPoints(1500l);
		newTrainer.setItems(new ArrayList<Items>());
		newTrainer.setPokemons(new ArrayList<Pokemon>());
		//System.out.println("GG1: " + gg.newGame());
		newTrainer.setGame(gg.newGame());
		//System.out.println("GG2" + newTrainer.getGame());
		newTrainer.setId(BDtemp.idPlayers);
		
		boolean retorno = BDtemp.players.add(newTrainer);
		if (retorno)
			BDtemp.idPlayers++;	
		
		return retorno;

	}
	
	public boolean deletePlayer(Player player){
		return BDtemp.players.remove(player);
		
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
